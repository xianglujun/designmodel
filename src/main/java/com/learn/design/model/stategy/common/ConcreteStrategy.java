package com.learn.design.model.stategy.common;

/**
 * @author xianglujun
 * @datetime 2018/10/15 19:19
 */
public class ConcreteStrategy extends Strategy {

  public void doSomething() {
    System.out.println("具体的策略执行某些事情(1)");
  }
}
