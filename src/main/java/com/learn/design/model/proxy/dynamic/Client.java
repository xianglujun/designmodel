package com.learn.design.model.proxy.dynamic;


import java.lang.reflect.Proxy;

/**
 * @author xianglujun
 * @datetime 2018/9/25 16:28
 */
public class Client {

  public static void main(String[] args) {
    SimpleGamePlayer gamePlayer = new SimpleGamePlayer();
    GamePlayerInvocationHandler handler = new GamePlayerInvocationHandler(gamePlayer);

    IGamePlayer player = (IGamePlayer) Proxy
        .newProxyInstance(gamePlayer.getClass().getClassLoader(), new Class[]{IGamePlayer.class},
            handler);

    player.killBoss();
    player.upgrade();
  }

}
