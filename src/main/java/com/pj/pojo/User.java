package com.pj.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
  private long userId;
  private String name;
  private long pwd;

  public User() {
  }

  public User(long userId, String name, long pwd) {
    this.userId = userId;
    this.name = name;
    this.pwd = pwd;
  }

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getPwd() {
    return pwd;
  }

  public void setPwd(long pwd) {
    this.pwd = pwd;
  }

  @Override
  public String toString() {
    return "User{" +
            "userId=" + userId +
            ", name='" + name + '\'' +
            ", pwd=" + pwd +
            '}';
  }
}
