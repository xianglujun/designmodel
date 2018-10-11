package com.learn.design.model.decorator;

import com.learn.design.model.decorator.component.AbstractSchoolReport;
import com.learn.design.model.decorator.component.SchoolResport;
import com.learn.design.model.decorator.decorator.HighScoreDecorator;
import com.learn.design.model.decorator.decorator.SortDecorator;

/**
 * @author xianglujun
 * @datetime 2018/10/11 15:41
 */
public class Client {

  public static void main(String[] args) {
    AbstractSchoolReport schoolReport = new SchoolResport();
    schoolReport = new HighScoreDecorator(schoolReport);
    schoolReport = new SortDecorator(schoolReport);

    schoolReport.report();

    schoolReport.sign("李三");
  }
}
