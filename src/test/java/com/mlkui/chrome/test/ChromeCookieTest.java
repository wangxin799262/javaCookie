package test.java.com.mlkui.chrome.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


import main.java.com.mlkui.chrome.ChromeDecryptHelper;
import com.mlkui.chrome.cookie.entity.ChromeCookie;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ChromeCookieTest
{
	public static void main(String[] args) {

        /**
         * 爬取电影排行榜的数据
         */
        try {
            Map<String,String> cookie = new HashMap<String, String>();
            cookie.put("cookie","Hm_lvt_e71d0b417f75981e161a94970becbb1b=1606958010; DIDA642a4585eb3d6e32fdaa37b44468fb6c=f0tlhvm21ti1kfacbrff3csd37; remember=0; time=MTEzNTI2LjIxNjM0Mi4xMDI4MTYuMTA3MTAwLjExMTM4NC4yMDc3NzQuMTE5OTUyLjExMTM4NC4xMDQ5NTguMTE1NjY4LjEwMjgxNi4xMTU2NjguMTIyMDk0LjExNTY2OC4xMDQ5NTguMTAyODE2LjEwMjgxNi4xMTEzODQuMA%3D%3D; Hm_lpvt_e71d0b417f75981e161a94970becbb1b=1606961007");
            for (int i = 0; i < 10; i++) {
                Document doc = Jsoup.connect("http://58921.com/alltime?page=" + i).cookies(cookie).get();

                // 寻找Tag为tr的标签,返回ArrayList。
                Elements items = doc.getElementsByTag("tr");
                ArrayList<String> URLS = new ArrayList<String>();
                // 将信息提取出来。
                for (Element j : items) {
                    System.out.println(j.text());
                    URLS.add(j.text());
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        Set<ChromeCookie> chromeCookies=ChromeDecryptHelper.getCookie("");
        for (ChromeCookie chromeCookie : chromeCookies)
        {
            System.out.println(chromeCookie);
        }

	}

}
