package com.sawyer.springboot.exception;

import java.util.Date;

import org.springframework.core.NestedRuntimeException;

public class BaseRuntimeException extends NestedRuntimeException implements BaseException
{

	public BaseRuntimeException(String code, String defaultMessage, Object[] args)
	{
		super(defaultMessage);
	}

	public BaseRuntimeException(String code, String defaultMessage, Throwable cause, Object[] args)
	{
		super(defaultMessage, cause);
	}

	public BaseRuntimeException(String defaultMessage, Throwable cause)
	{
		super(defaultMessage, cause);
	}

	public BaseRuntimeException(String defaultMessage)
	{
		super(defaultMessage);
	}

	@Override
	public String getCode()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getArgs()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTime(Date paramDate)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public Date getTime()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setClassName(String paramString)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getClassName()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMethodName(String paramString)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getMethodName()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setParameters(String[] paramArrayOfString)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public String[] getParameters()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setHandled(boolean paramBoolean)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isHandled()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setI18nMessage(String paramString)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getI18nMessage()
	{
		// TODO Auto-generated method stub
		return null;
	}

	
}