package com.learn.design.model.proxy;

/**
 * 委托模式中的主题角色: 该接口主要定义了一些基本的方式,并交由RealSubject来进行实现
 *
 * @author xianglujun
 * @datetime 2018/9/25 12:24
 */
public interface Subject {

  void request();
}
