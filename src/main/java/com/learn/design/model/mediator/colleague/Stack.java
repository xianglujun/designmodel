package com.learn.design.model.mediator.colleague;

import com.learn.design.model.mediator.mediator.AbstractMediator;

/**
 * 库存管理
 *
 * @author xianglujun
 * @datetime 2018/9/27 16:08
 */
public class Stack extends AbstractColleague {

  /**
   * 刚开始有100台电脑
   */
  public static int DEFAULT_COMPUTER_COUNT = 100;

  public Stack(AbstractMediator mediator) {
    super(mediator);
  }

  public void increase(int number) {
    DEFAULT_COMPUTER_COUNT = DEFAULT_COMPUTER_COUNT + number;
    System.out.println("当前库存中有电脑:" + DEFAULT_COMPUTER_COUNT);
  }

  public void decrease(int number) {
    DEFAULT_COMPUTER_COUNT = DEFAULT_COMPUTER_COUNT - number;
    System.out.printf("减少电脑%d台，还剩%d台", number, DEFAULT_COMPUTER_COUNT);
  }

  public int getSockNumber() {
    return DEFAULT_COMPUTER_COUNT;
  }

  /**
   * 清理库存
   */
  public void clearStock() {
    System.out.printf("清理数量为: %d 台", DEFAULT_COMPUTER_COUNT);
    this.mediator.execute("stock.clear");
  }

}
