package com.smart.ioc.property;

public class Director {

  public void direct() {
    GeLi geli = new LiuDeHua();
    MoAttack moAttack = new MoAttack();
    moAttack.setGeli(geli);
    moAttack.cityGateAsk();
  }
}
