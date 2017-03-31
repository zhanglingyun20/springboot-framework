package com.sawyer.springboot.exception;

import java.util.Date;

public abstract interface BaseException
{
  public abstract String getCode();

  public abstract String[] getArgs();

  public abstract void setTime(Date paramDate);

  public abstract Date getTime();

  public abstract void setClassName(String paramString);

  public abstract String getClassName();

  public abstract void setMethodName(String paramString);

  public abstract String getMethodName();

  public abstract void setParameters(String[] paramArrayOfString);

  public abstract String[] getParameters();

  public abstract void setHandled(boolean paramBoolean);

  public abstract boolean isHandled();

  public abstract String getMessage();

  public abstract void setI18nMessage(String paramString);

  public abstract String getI18nMessage();
}