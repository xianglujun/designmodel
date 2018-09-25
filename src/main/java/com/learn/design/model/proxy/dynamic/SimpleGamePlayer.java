package com.learn.design.model.proxy.dynamic;

/**
 * @author xianglujun
 * @datetime 2018/9/25 16:27
 */
public class SimpleGamePlayer implements IGamePlayer{

  private String userName;

  private String password;

  public void killBoss() {
    System.out.printf("%s is killing boss! %n", userName);
  }

  public void upgrade() {
    System.out.printf("%s is upgrade! %n", userName);
  }

  public void login(String userName, String password) {
    this.userName = userName;
    this.password = password;
  }
}
