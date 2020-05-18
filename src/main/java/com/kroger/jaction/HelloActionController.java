package com.kroger.jaction;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloActionController {
   @RequestMapping(value="/", method=RequestMethod.GET)
   @ResponseBody
   public String helloAction(){
       return "Hello World !!";
   }
    
}