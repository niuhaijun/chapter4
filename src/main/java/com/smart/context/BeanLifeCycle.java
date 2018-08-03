package com.smart.context;

import com.smart.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;

/**
 * @author niuhaijun
 * @date 2018/7/24 16:24
 */
public class BeanLifeCycle {

  @Test
  public void showBeanLifeCycle() {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Beans.class);

    Car car = context.getBean("car", Car.class);

    context.destroy();
  }
}
