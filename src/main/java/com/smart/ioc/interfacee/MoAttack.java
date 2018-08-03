package com.smart.ioc.interfacee;

public class MoAttack implements ActorArrangable {

  private GeLi geli;

  /**
   * 接口注入 将调用类所有依赖注入的方法抽取到一个接口中，调用类通过实现该接口提供相应的注入方法。
   */
  @Override
  public void injectGeli(GeLi geli) {
    this.geli = geli;
  }

  public void cityGateAsk() {
    geli.responseAsk("墨者革离");
  }
}
