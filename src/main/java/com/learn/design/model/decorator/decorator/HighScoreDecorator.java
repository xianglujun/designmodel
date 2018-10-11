package com.learn.design.model.decorator.decorator;

import com.learn.design.model.decorator.component.AbstractSchoolReport;

/**
 * @author xianglujun
 * @datetime 2018/10/11 15:33
 */
public class HighScoreDecorator extends AbstractDecorator {

  public HighScoreDecorator(
      AbstractSchoolReport schoolReport) {
    super(schoolReport);
  }

  @Override
  public void report() {
    this.printHighScore();
    super.report();
  }

  private void printHighScore() {
    System.out.println("语文：80; 数学: 80; 英语: 100");
  }
}
