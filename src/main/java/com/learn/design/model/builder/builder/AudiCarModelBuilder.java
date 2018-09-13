package com.learn.design.model.builder.builder;

import com.learn.design.model.builder.product.AudiCardModel;
import com.learn.design.model.builder.product.CarModel;
import java.util.List;

/**
 * 构建者模式中的构建者，负责对应的产品的创建工作
 *
 * @author xianglujun
 * @datetime 2018/9/13 14:25
 */
public class AudiCarModelBuilder extends CarModeBuilder {

  private AudiCardModel audiCardModel = new AudiCardModel();

  @Override
  public void setSequence(List<String> sequence) {
    this.audiCardModel.setSequence(sequence);
  }

  @Override
  public CarModel getCarMode() {
    return audiCardModel;
  }
}
