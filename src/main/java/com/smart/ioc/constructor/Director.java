package com.smart.ioc.constructor;

public class Director {

  public void direct() {
    GeLi geli = new LiuDeHua();
    MoAttack moAttack = new MoAttack(geli);
    moAttack.cityGateAsk();
  }
}
