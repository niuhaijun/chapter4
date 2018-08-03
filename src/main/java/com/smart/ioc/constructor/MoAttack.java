package com.smart.ioc.constructor;


public class MoAttack {

  private GeLi geli;

  /**
   * 构造函数注入 通过调用类的构造函数，将接口实现类通过构造函数变量传入
   */
  public MoAttack(GeLi geli) {
    this.geli = geli;
  }

  public void cityGateAsk() {
    geli.responseAsk("墨者革离");
  }
}
