package com.learn.design.model.builder.product;

import java.util.ArrayList;
import java.util.List;

/**
 * 汽车模型，充当产品的角色(Product)
 *
 * @author xianglujun
 * @datetime 2018/9/13 14:14
 */
public abstract class CarModel {

  private List<String> sequence = new ArrayList<String>();

  /**
   * 模型开始跑
   */
  protected abstract void start();

  /**
   * 模型停止
   */
  protected abstract void stop();

  /**
   * 喇叭鸣笛
   */
  protected abstract void alarm();

  /**
   * 引擎的轰鸣声音
   */
  protected abstract void enginBoom();

  public final void run() {
    for (String method : sequence) {
      if ("start".equals(method)) {
        this.start();
      } else if ("stop".equals(method)) {
        this.stop();
      } else if ("alarm".equals(method)) {
        this.alarm();
      } else if ("enginBoom".equals(method)){
        this.enginBoom();
      }
    }
  }

  public void setSequence(List<String> sequence) {
    this.sequence = sequence;
  }
}
