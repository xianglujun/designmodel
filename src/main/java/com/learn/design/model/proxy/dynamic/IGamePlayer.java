package com.learn.design.model.proxy.dynamic;

/**
 * @author xianglujun
 * @datetime 2018/9/25 16:24
 */
public interface IGamePlayer {

  /**
   * 杀怪
   */
  void killBoss();

  void upgrade();

  void login(String userName, String password);
}
