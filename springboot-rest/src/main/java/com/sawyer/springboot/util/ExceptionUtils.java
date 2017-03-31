package com.sawyer.springboot.util;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ExceptionUtils extends org.apache.commons.lang3.exception.ExceptionUtils
{
	public static String[] convertArgsToString(Object[] args)
	{
		String[] argsStrs = new String[args.length];
		for (int i = 0; i < args.length; i++)
		{
			argsStrs[i] = String.valueOf(args[i]);
		}
		return argsStrs;
	}

	public static String toString(Throwable e)
	{
		return toString("", e);
	}

	public static String toString(String msg, Throwable e)
	{
		StringWriter w = new StringWriter();
		w.write(msg);
		PrintWriter p = new PrintWriter(w);
		p.println();
		try
		{
			e.printStackTrace(p);
			return w.toString();
		}
		finally
		{
			p.close();
		}
	}
}