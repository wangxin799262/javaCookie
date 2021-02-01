package test.java.com.mlkui.chrome.test;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;
public class MyJob implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("定时器任务执行" + new Date(System.currentTimeMillis()));
        JobDataMap map=jobExecutionContext.getMergedJobDataMap();
        System.out.println("参数值"+map.get("uname"));
    }
}
