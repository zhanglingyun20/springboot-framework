package com.sawyer.springboot.util;

import java.io.IOException;
import java.io.InputStream;
import java.text.MessageFormat;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * 
 * @author <a href="mailto:sawyer@wolaidai.com">sawyer</a>
 */
public class MessageUtils
{

	private static final Logger logger = LoggerFactory.getLogger(MessageUtils.class);
	private static Properties prop = new Properties();
	static
	{
		try
		{
			InputStream in = new ClassPathResource("messages.properties").getInputStream();
			prop.load(in);
		}
		catch (IOException e)
		{
			logger.error("Message ready messages.properties error", e);
		}

	}

	public static String getValue(String key)
	{
		return prop.getProperty(key);
	}

	public static String formatVaule(String key, Object params[])
	{

		return MessageFormat.format(getValue(key), params);
	}
}
