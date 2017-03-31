package com.sawyer.springboot.exception;

public class BussinessException extends BaseRuntimeException
{
	private static final long serialVersionUID = -4954118251735823026L;

	public BussinessException(String msg)
	{
		super(msg);
	}

	public BussinessException(String code, String defaultMsg, Object[] args)
	{
		super(code, defaultMsg, args);
	}

	public BussinessException(String code, String msg)
	{
		super(code, msg, new Object[0]);
	}

	public BussinessException(String msg, Throwable cause)
	{
		super(msg, cause);
	}

	public BussinessException(String code, String msg, Throwable cause)
	{
		super(code, msg, cause, new Object[0]);
	}

	public Throwable fillInStackTrace()
	{
		return this;
	}
}