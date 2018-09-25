package com.learn.design.model.proxy;

/**
 * 真实主题角色: 用于对Subject定义的功能进行实现, 这是一个业务正常的逻辑实现，
 * 并且代理模式的核心是在代理类上.
 *
 * @author xianglujun
 * @datetime 2018/9/25 12:25
 */
public class RealSubject implements Subject{

  public void request() {
    System.out.println("RealSubject....");
  }
}
