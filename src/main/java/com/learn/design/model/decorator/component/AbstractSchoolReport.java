package com.learn.design.model.decorator.component;

/**
 * 学校的报告单, 充当的角色为Component, 用于实现具体的业务逻辑
 *
 * @author xianglujun
 * @datetime 2018/10/11 14:53
 */
public abstract class AbstractSchoolReport {

  /**
   * 将成绩报告给家长
   */
  public abstract void report();

  /**
   * 签字
   * @param name
   */
  public abstract void sign(String name);

}
