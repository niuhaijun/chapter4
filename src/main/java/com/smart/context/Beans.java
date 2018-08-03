package com.smart.context;

import com.smart.Car;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {

  @Bean(name = "car")
  public Car buildCar() {
    Car car = new Car();
    return car;
  }

//  @Bean(name = "beanPostProcessor")
//  public BeanPostProcessor buildBeanFactoryPostProcessor() {
//    return new MyBeanPostProcessor();
//  }

  @Bean(name = "instantiationAwareBeanPostProcessor")
  public InstantiationAwareBeanPostProcessor buildInstantiationAwareBeanPostProcessor() {
    return new MyInstantiationAwareBeanPostProcessor();
  }

  @Bean(name = "beanFactoryPostProcessor")
  public MyBeanFactoryPostProcessor buildMyBeanFactoryPostProcessor() {
    return new MyBeanFactoryPostProcessor();
  }

}
