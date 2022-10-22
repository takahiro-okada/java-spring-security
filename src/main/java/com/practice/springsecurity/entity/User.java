package com.practice.springsecurity.entity;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Getter;
import lombok.Setter;


public class User implements UserDetails{

  @Getter
  @Setter
  private String username;

  @Getter
  @Setter
  private String password;

  private Collection<GrantedAuthority> authorities;

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return authorities;
  }

  @Override
  public boolean isAccountNonExpired() {
    // TODO 自動生成されたメソッド・スタブ
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    // TODO 自動生成されたメソッド・スタブ
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    // TODO 自動生成されたメソッド・スタブ
    return true;
  }

  @Override
  public boolean isEnabled() {
    // TODO 自動生成されたメソッド・スタブ
    return true;
  }

}
