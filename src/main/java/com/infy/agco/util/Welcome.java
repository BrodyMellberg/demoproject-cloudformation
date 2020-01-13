package com.infy.agco.util;

public class Welcome
{
	public Welcome(String message)
	{
		super();
		this.message = message;
	}

	private  String message;

	public String getMessage()
	{
		return message;
	}
	
	public Welcome()
	{
		this.message = "";
	}
}