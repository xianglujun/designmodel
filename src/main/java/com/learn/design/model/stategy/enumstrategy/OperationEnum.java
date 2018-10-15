package com.learn.design.model.stategy.enumstrategy;

/**
 * @author xianglujun
 * @datetime 2018/10/15 19:23
 */
public enum OperationEnum {
  ADD("+") {
    @Override
    public int operate(int a, int b) {
      return a + b;
    }
  },
  SUB("-") {
    @Override
    public int operate(int a, int b) {
      return a - b;
    }
  }
  ;

  private String operate;

  OperationEnum(String operate) {
    this.operate = operate;
  }

  public abstract int operate(int a, int b);
}
