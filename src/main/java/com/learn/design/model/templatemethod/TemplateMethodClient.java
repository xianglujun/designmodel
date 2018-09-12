package com.learn.design.model.templatemethod;

/**
 * 模板方法的调用部分
 *
 * @author xianglujun
 * @datetime 2018/9/12 12:38
 */
public class TemplateMethodClient {

  public static void main(String[] args) {
    AbstractClass abstractClass = new ConcreteClass1();
    abstractClass.templateMethod();

    abstractClass = new ConcreteClass2();
    abstractClass.templateMethod();
  }
}
