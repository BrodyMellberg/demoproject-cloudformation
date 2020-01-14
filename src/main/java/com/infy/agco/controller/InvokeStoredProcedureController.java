package com.infy.agco.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.agco.util.Welcome;

@RestController
public class InvokeStoredProcedureController
{
    private static final String welcomemsg = "Welcome! This is InvokeStoredProcedureController";
	
	@RequestMapping(value="/invoke", method=RequestMethod.GET )
    @ResponseBody
    public Welcome welcomeUser()
    {
        return new Welcome(String.format(welcomemsg));
    }
}
