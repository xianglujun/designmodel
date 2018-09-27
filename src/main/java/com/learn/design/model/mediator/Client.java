package com.learn.design.model.mediator;

import com.learn.design.model.mediator.colleague.Purchase;
import com.learn.design.model.mediator.colleague.Sale;
import com.learn.design.model.mediator.colleague.Stack;
import com.learn.design.model.mediator.mediator.AbstractMediator;
import com.learn.design.model.mediator.mediator.ConcreteMediator;

/**
 * @author xianglujun
 * @datetime 2018/9/27 16:22
 */
public class Client {

  public static void main(String[] args) {
    AbstractMediator abstractMediator = new ConcreteMediator();

    Purchase purchase = new Purchase(abstractMediator);
    purchase.buyComputer(20);

    Stack stack = new Stack(abstractMediator);
    stack.decrease(1);
    stack.clearStock();

    Sale sale = new Sale(abstractMediator);
    sale.sellComputer(2);

  }

}
