package com.learn.design.model.builder.product;

/**
 * 产品的具体实现类, 实现了产品中的基本方法，而{@link #run()}方法则是模板方法，
 * 负责对基本方法的调度.
 *
 * @author xianglujun
 * @datetime 2018/9/13 14:22
 */
public class AudiCardModel extends CarModel {

  @Override
  protected void start() {
    System.out.println("Audi start...");
  }

  @Override
  protected void stop() {
    System.out.println("Audi stop...");
  }

  @Override
  protected void alarm() {
    System.out.println("Audi alarm....");
  }

  @Override
  protected void enginBoom() {
    System.out.println("Audi engin boom...");
  }
}
