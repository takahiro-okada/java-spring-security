package com.practice.springsecurity.service;

import com.practice.springsecurity.entity.User;
import com.practice.springsecurity.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

  @Autowired //mapperをインスタンス化。DB接続をするMapperクラスを参照
  private UserMapper userMapper;

  //loadUserByUsernameは実装が必要
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    System.out.println(username);
    //findByUsernameで見つけてきたユーザ情報をmyUserに入れる
    User myUser = userMapper.findByUsername(username);
    System.out.println(myUser);
    //UserDetailsにreturn
    return myUser;

  }
}
