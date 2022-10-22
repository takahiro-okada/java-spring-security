package com.practice.springsecurity.repository;

import com.practice.springsecurity.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

  @Select("SELECT * FROM user WHERE username = #{username}")
  public User findByUsername(String name);

}
