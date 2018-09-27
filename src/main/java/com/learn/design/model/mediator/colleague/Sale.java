package com.learn.design.model.mediator.colleague;

import com.learn.design.model.mediator.mediator.AbstractMediator;
import java.util.Random;

/**
 * @author xianglujun
 * @datetime 2018/9/27 16:13
 */
public class Sale extends AbstractColleague {

  public Sale(AbstractMediator mediator) {
    super(mediator);
  }

  public void sellComputer(int number) {
    this.mediator.execute("sale.sell", number);
    System.out.printf("销售电脑%d台", number);
  }

  public int getSaleStatus() {
    Random random = new Random();
    int saleStatus = random.nextInt(100);
    System.out.printf("当前销售状态为:%d %n", saleStatus);
    return saleStatus;
  }

  public void offSale() {
    super.mediator.execute("sale.offsell");
  }
}
