package com.learn.design.model.mediator.mediator;

import com.learn.design.model.mediator.colleague.Purchase;
import com.learn.design.model.mediator.colleague.Sale;
import com.learn.design.model.mediator.colleague.Stack;

/**
 * @author xianglujun
 * @datetime 2018/9/27 15:32
 */
public abstract class AbstractMediator {

  protected Purchase purchase;
  protected Sale sale;
  protected Stack stack;

  protected AbstractMediator() {
    purchase = new Purchase(this);
    sale = new Sale(this);
    stack = new Stack(this);
  }

  public abstract void execute(String operation, Object ... objects);
}
