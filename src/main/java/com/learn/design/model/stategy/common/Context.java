package com.learn.design.model.stategy.common;

/**
 * @author xianglujun
 * @datetime 2018/10/15 19:20
 */
public class Context {

  private Strategy strategy;

  public Context(Strategy _strategy) {
    this.strategy = _strategy;
  }

  public void useStrategry() {
    strategy.doSomething();
  }

}
