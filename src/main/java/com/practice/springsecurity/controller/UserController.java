package com.practice.springsecurity.controller;

import com.practice.springsecurity.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @GetMapping("/")
  public String test(){
    return "index";
  }

  @PostMapping("/login/")
  public ResponseEntity<HttpStatus> login(@RequestBody User user) throws Exception{
    System.out.println("コントローラーの処理");
    System.out.println(user);
    return new ResponseEntity<HttpStatus>(HttpStatus.OK);
  }

}
