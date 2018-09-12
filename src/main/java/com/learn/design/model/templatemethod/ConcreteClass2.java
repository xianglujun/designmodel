package com.learn.design.model.templatemethod;

/**
 * 实现模板方法中父类定义的基本方法
 *
 * @author xianglujun
 * @datetime 2018/9/12 12:37
 */
public class ConcreteClass2 extends AbstractClass {

  @Override
  protected void doAnyThing() {
    System.out.println("class2: doAnyThing()");
  }

  @Override
  protected void doAnotherThing() {
    System.out.println("class2: doAnotherThing()");
  }
}
