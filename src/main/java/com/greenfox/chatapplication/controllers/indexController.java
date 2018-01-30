package com.greenfox.chatapplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
  
  @GetMapping("")
  public String getIndexPage(){
    return "index";
  }
  
}
