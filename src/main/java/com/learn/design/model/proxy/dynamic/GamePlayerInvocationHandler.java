package com.learn.design.model.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *
 *
 * @author xianglujun
 * @datetime 2018/9/25 16:14
 */
public class GamePlayerInvocationHandler implements InvocationHandler {

  private IGamePlayer gamePlayer;

  public GamePlayerInvocationHandler(IGamePlayer gamePlayer) {
    this.gamePlayer = gamePlayer;
    gamePlayer.login("lisi", "dfdfdf");
  }

  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    return method.invoke(gamePlayer, args);
  }
}
