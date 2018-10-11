package com.learn.design.model.decorator.component;

/**
 * @author xianglujun
 * @datetime 2018/10/11 14:55
 */
public class SchoolResport extends AbstractSchoolReport {

  private String signName;

  @Override
  public void report() {
    System.out.println("当前的成绩为: 语文:68, 数学 62, 英语: 60");
  }

  @Override
  public void sign(String name) {
    this.signName = name;
    System.out.printf("家长签名: %s. %n", this.signName);
  }
}
