package com.learn.design.model.decorator.decorator;

import com.learn.design.model.decorator.component.AbstractSchoolReport;

/**
 * @author xianglujun
 * @datetime 2018/10/11 15:36
 */
public class SortDecorator extends AbstractDecorator {

  public SortDecorator(
      AbstractSchoolReport schoolReport) {
    super(schoolReport);
  }

  @Override
  public void report() {
    this.printSort();
    super.report();
  }

  private void printSort() {
    System.out.println("语文: 38; 数学: 40; 英语: 36");
  }
}
