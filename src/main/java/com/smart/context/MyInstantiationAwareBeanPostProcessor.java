package com.smart.context;

import java.beans.PropertyDescriptor;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

public class MyInstantiationAwareBeanPostProcessor extends
    InstantiationAwareBeanPostProcessorAdapter {

  @Override
  public Object postProcessBeforeInstantiation(Class beanClass, String beanName)
      throws BeansException {
    if ("car".equals(beanName)) {
      System.out.println("MyInstantiationAwareBeanPostProcessor.postProcessBeforeInstantiation");
    }
    return null;
  }

  @Override
  public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
    if ("car".equals(beanName)) {
      System.out.println("MyInstantiationAwareBeanPostProcessor.postProcessAfterInstantiation");
    }
    return true;
  }

  @Override
  public PropertyValues postProcessPropertyValues(
      PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName)
      throws BeansException {
    if ("car".equals(beanName)) {
      System.out.println("MyInstantiationAwareBeanPostProcessor.postProcessPropertyValues");
    }
    return pvs;
  }



  // 一下方法是BeanPostProcessor的方法
  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName)
      throws BeansException {
    if ("car".equals(beanName)) {
      System.out.println("MyInstantiationAwareBeanPostProcessor.postProcessBeforeInitialization");
    }
    return bean;
  }

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    if ("car".equals(beanName)) {
      System.out.println("MyInstantiationAwareBeanPostProcessor.postProcessAfterInitialization");
    }
    return bean;
  }
}
