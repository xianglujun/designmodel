package com.learn.design.model.mediator.colleague;

import com.learn.design.model.mediator.mediator.AbstractMediator;

/**
 * 采购管理
 *
 * @author xianglujun
 * @datetime 2018/9/27 16:04
 */
public class Purchase extends AbstractColleague {

  public Purchase(AbstractMediator mediator) {
    super(mediator);
  }

  /**
   * 采购电脑
   * @param number 采购数量
   */
  public void buyComputer(int number) {
    this.mediator.execute("purchase.buy", number);
  }

  public void refuseBuyComputer() {
    System.out.println("不再采购电脑....");
  }

}
