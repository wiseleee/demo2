package com.example.demo2.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo2.dto.MemberDTO;
import com.example.demo2.service.MemberService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j // Simple Logging Facade for Java

public class MainController {

@Autowired
private MemberService memberService;

@RequestMapping("/main")
public ModelAndView main() {
log.info("========================== MemberController(/main) ==================================");
ModelAndView mv=new ModelAndView("/main");
return mv;
}

}