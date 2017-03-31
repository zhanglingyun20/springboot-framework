package com.sawyer.springboot.dto;

import org.springframework.http.HttpStatus;

public class ResponseVo<T>
{
	private int status = HttpStatus.OK.value();
	private String message = "success";
	private T data;
	private String traceId;
	private long timestamp = System.currentTimeMillis();

	private String path;
	private int version = 1;

	public ResponseVo()
	{}

	public ResponseVo(String message)
	{
		this.message = message;
	}
	
	public ResponseVo(T data)
	{
		this.data = data;
	}

	public ResponseVo(T data, String message)
	{
		this.data = data;
		this.message = message;
	}

	public int getStatus()
	{
		return status;
	}

	public void setStatus(int status)
	{
		this.status = status;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public T getData()
	{
		return data;
	}

	public void setData(T data)
	{
		this.data = data;
	}

	public String getTraceId()
	{
		return traceId;
	}

	public void setTraceId(String traceId)
	{
		this.traceId = traceId;
	}

	public long getTimestamp()
	{
		return timestamp;
	}

	public void setTimestamp(long timestamp)
	{
		this.timestamp = timestamp;
	}

	public String getPath()
	{
		return path;
	}

	public void setPath(String path)
	{
		this.path = path;
	}

	public int getVersion()
	{
		return version;
	}

	public void setVersion(int version)
	{
		this.version = version;
	}

}