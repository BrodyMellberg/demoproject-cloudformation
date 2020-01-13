package com.infy.agco.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.agco.util.Welcome;

@RestController
public class HealthCheckController
{
    private static final String welcomemsg = "Welcome!";
	
	@RequestMapping(value="/stat", method=RequestMethod.GET )

    @ResponseBody
    public Welcome welcomeUser()
    {
        return new Welcome(String.format(welcomemsg ));
    }
}
