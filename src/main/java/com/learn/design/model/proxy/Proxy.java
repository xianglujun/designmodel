package com.learn.design.model.proxy;

/**
 * 该类是代理角色: 这是代理模式的核心操作.
 *
 * @author xianglujun
 * @datetime 2018/9/25 12:27
 */
public class Proxy implements Subject {

  private Subject subject;

  /**
   * 默认的被代理者
   */
  public Proxy() {
    this.subject = new RealSubject();
  }

  public void request() {
    this.before();
    this.subject.request();
    this.after();
  }

  private void before() {
    System.out.println("proxy before method...");
  }

  private void after() {
    System.out.println("proxy after method....");
  }
}
