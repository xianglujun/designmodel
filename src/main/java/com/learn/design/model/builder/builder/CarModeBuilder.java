package com.learn.design.model.builder.builder;

import com.learn.design.model.builder.product.CarModel;
import java.util.List;

/**
 * @author xianglujun
 * @datetime 2018/9/13 14:26
 */
public abstract class CarModeBuilder {

  /**
   * 对汽车模型的动作进行操作
   */
  public abstract void setSequence(List<String> sequence);

  /**
   * 负责创建汽车产品模型
   */
  public abstract CarModel getCarMode();
}
