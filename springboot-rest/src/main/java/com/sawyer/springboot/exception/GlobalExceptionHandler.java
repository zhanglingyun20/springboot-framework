package com.sawyer.springboot.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.sawyer.springboot.dto.ResponseVo;
import com.sawyer.springboot.util.MessageUtils;

@ControllerAdvice
public class GlobalExceptionHandler
{

	@ExceptionHandler(value = {BussinessException.class})
	@ResponseBody
	public ResponseVo<?> jsonErrorHandler(HttpServletRequest req, BussinessException e) throws Exception
	{
		String message = MessageUtils.getValue(e.getMessage());
		return createResponse(message, req);
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler({MethodArgumentNotValidException.class})
	@ResponseBody
	public ResponseVo<?> handleServiceException(MethodArgumentNotValidException e, HttpServletRequest req)
	{
		BindingResult result = e.getBindingResult();
		FieldError error = result.getFieldError();
		String field = error.getField();
		String code = error.getDefaultMessage();
		String message = String.format("%s:%s", field, code);
		return createResponse(message, req);
	}
	
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(BindException.class)
	@ResponseBody
	public ResponseVo<?> handleBindException(BindException e, HttpServletRequest req)
	{
		BindingResult result = e.getBindingResult();
		FieldError error = result.getFieldError();
		String field = error.getField();
		String code = error.getDefaultMessage();
		String message = String.format("%s:%s", field, code);
		return createResponse(message, req);
	}

	private ResponseVo<?> createResponse(String message,HttpServletRequest req){
		ResponseVo<String> respone = new ResponseVo<>();
		respone.setMessage(message);
		respone.setStatus(HttpStatus.PRECONDITION_FAILED.value());
		respone.setPath(req.getRequestURL().toString());
		return respone;
	}
}