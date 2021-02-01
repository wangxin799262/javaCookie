package main.java.com.mlkui.chrome.cookie.entity;

import java.io.File;
import java.util.Date;

public class EncryptedCookie extends com.mlkui.chrome.cookie.entity.ChromeCookie
{
	protected byte[] encryptedValue;

	public byte[] getEncryptedValue()
	{
		return encryptedValue;
	}

	public EncryptedCookie(String name, byte[] encryptedValue, Date expires, String path, String domain, boolean secure, boolean httpOnly, File cookieStore)
	{
		super(name, expires, path, domain, secure, httpOnly, cookieStore);
		this.encryptedValue = encryptedValue;
	}

	public boolean isDecrypted()
	{
		return false;
	}

	@Override
	public String toString()
	{
		return "Cookie [name=" + name + " (encrypted)]";
	}

}
