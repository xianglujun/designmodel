package com.learn.design.model.decorator.decorator;

import com.learn.design.model.decorator.component.AbstractSchoolReport;

/**
 * @author xianglujun
 * @datetime 2018/10/11 14:58
 */
public abstract class AbstractDecorator extends AbstractSchoolReport {

  private AbstractSchoolReport schoolReport;

  public AbstractDecorator(AbstractSchoolReport schoolReport) {
    this.schoolReport = schoolReport;
  }

  @Override
  public void report() {
    if (null != schoolReport) {
      this.schoolReport.report();
    }
  }

  @Override
  public void sign(String name) {
    if (null != schoolReport) {
      schoolReport.sign(name);
    }
  }
}
