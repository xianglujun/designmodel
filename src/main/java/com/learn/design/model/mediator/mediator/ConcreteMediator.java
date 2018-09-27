package com.learn.design.model.mediator.mediator;

/**
 * @author xianglujun
 * @datetime 2018/9/27 16:03
 */
public class ConcreteMediator extends AbstractMediator {

  public ConcreteMediator() {
  }

  @Override
  public void execute(String operation, Object... objects) {
    if (operation.equals("purchase.buy")) {
      this.buyComputer((Integer) objects[0]);
    } else if (operation.equals("sale.sell")) {
      this.sellComputer((Integer) objects[0]);
    } else if (operation.equals("sale.offsell")) {
      this.offsell();
    } else if (operation.equals("stack.clear")) {
      this.clearStack();
    }
  }

  private void buyComputer(int number) {
    int saleStatus = sale.getSaleStatus();
    if (saleStatus > 80) {
      System.out.printf("采购电脑%d台 %n", number);
      this.stack.increase(number);
    } else {
      System.out.printf("采购电脑%d台 %n", number/2);
      this.stack.increase(number/2);
    }
  }

  private void sellComputer(int number) {
    if (stack.getSockNumber() < number) {
      this.purchase.buyComputer(number);
    }

    this.stack.decrease(number);
  }

  private void offsell() {
    System.out.printf("这家销售%d台 %n", this.stack.getSockNumber());
  }

  private void clearStack() {
    sale.offSale();
    purchase.refuseBuyComputer();
  }
}
