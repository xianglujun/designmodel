package com.learn.design.model.stategy.enumstrategy;

/**
 * @author xianglujun
 * @datetime 2018/10/15 19:25
 */
public class Client {

  public static void main(String[] args) {
    System.out.println("2 + 2 = " + OperationEnum.ADD.operate(2, 2));
  }
}
