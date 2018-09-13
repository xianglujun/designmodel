package com.learn.design.model.builder;

import com.learn.design.model.builder.builder.AudiCarModelBuilder;
import com.learn.design.model.builder.builder.BzCarModelBuilder;
import com.learn.design.model.builder.builder.CarModeBuilder;
import com.learn.design.model.builder.product.AudiCardModel;
import com.learn.design.model.builder.product.CarModel;
import java.util.ArrayList;
import java.util.List;

/**
 * 构建者模式中的导演角色，该角色负责协调产品的创建，以及产品的各个组件如何组装，
 * 以及如何运作等。
 *
 * @author xianglujun
 * @datetime 2018/9/13 14:29
 */
public class Director {

  public CarModel getAudiCardMode() {
    List<String> sequence = new ArrayList<String>();
    sequence.add("stop");
    sequence.add("start");
    sequence.add("enginBoom");

    CarModeBuilder carModeBuilder = new AudiCarModelBuilder();
    carModeBuilder.setSequence(sequence);

    return carModeBuilder.getCarMode();
  }

  public CarModel getBzCarModel() {
    List<String> sequence = new ArrayList<String>();
    sequence.add("start");
    sequence.add("enginBoom");
    sequence.add("stop");

    CarModeBuilder carModeBuilder = new BzCarModelBuilder();
    carModeBuilder.setSequence(sequence);

    return carModeBuilder.getCarMode();
  }

  public static void main(String[] args) {
    Director director = new Director();
    director.getAudiCardMode().run();
    director.getBzCarModel().run();
  }


}
