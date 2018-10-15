package com.learn.design.model.stategy.common;

/**
 * @author xianglujun
 * @datetime 2018/10/15 19:21
 */
public class Client {

  public static void main(String[] args) {
    Strategy strategy = new ConcreteStrategy();
    Context context = new Context(strategy);
    context.useStrategry();

    System.out.println("换一种策略....");
    strategy = new ConcreteStrategy1();
    context = new Context(strategy);

    context.useStrategry();
  }
}
