package com.learn.design.model.mediator.colleague;

import com.learn.design.model.mediator.mediator.AbstractMediator;

/**
 * @author xianglujun
 * @datetime 2018/9/27 15:31
 */
public class AbstractColleague {

  protected AbstractMediator mediator;

  protected AbstractColleague(AbstractMediator mediator) {
    this.mediator = mediator;
  }

}
