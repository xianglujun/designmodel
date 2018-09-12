package com.learn.design.model.templatemethod;

/**
 * 具体实现类，该实现类主要实现父类模板中定义的基本方法
 *
 * @author xianglujun
 * @datetime 2018/9/12 12:35
 */
public class ConcreteClass1 extends AbstractClass {

  @Override
  protected void doAnyThing() {
    System.out.println("class1: doAnyThing()");
  }

  @Override
  protected void doAnotherThing() {
    System.out.println("class2: doAnotherThing()");
  }
}
