package com.learn.design.model.templatemethod;

/**
 * 模板方法(TemplateMethod) 中的抽象类，主要定义了模板方法和基本方法。
 * 其中的基本方法主要交由子类具体实现，并被模板方法调用。
 *
 * @author xianglujun
 * @datetime 2018/9/12 12:33
 */
public abstract class AbstractClass {

  protected abstract void doAnyThing();

  protected abstract void doAnotherThing();

  public void templateMethod() {
    doAnyThing();
    doAnotherThing();
  }

}
