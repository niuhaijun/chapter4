package com.smart.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author niuhaijun
 * @date 2018/7/22 18:23
 */
public class ReflectCarTest {

  public static void main(String[] args) throws Exception {
    Car car = initByDefaultConst();
    car.introduce();
  }

  /**
   * 通过Car默认的构造函数，以反射的方式生成对象
   *
   * @return 返回一个Car的对象
   */
  public static Car initByDefaultConst() throws Exception {
    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    Class<Car> carClass = (Class<Car>) classLoader.loadClass("com.smart.reflect.Car");

    Constructor<Car> constructor = carClass.getDeclaredConstructor((Class<Car>[]) null);
    Car car = constructor.newInstance();

    Method setBrand = carClass.getDeclaredMethod("setBrand", String.class);
    setBrand.invoke(car, "保时捷");

    Method setColor = carClass.getDeclaredMethod("setColor", String.class);
    setColor.invoke(car, "红色");

    Method setMaxSpeed = carClass.getDeclaredMethod("setMaxSpeed", int.class);
    setMaxSpeed.invoke(car, 200);

    return car;
  }
}
