package com.smart.ioc.property;


public class MoAttack {

  private GeLi geli;

  /**
   * 属性注入 有选择地通过setter方法完成调用类所需依赖的注入
   */
  public void setGeli(GeLi geli) {
    this.geli = geli;
  }

  public void cityGateAsk() {
    geli.responseAsk("墨者革离");
  }
}
