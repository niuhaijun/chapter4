package com.smart.context;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * Bean工厂后处理器 此时所有的bean配置信息在容器内都有一个与之对应的BeanDefinition，可以修改之。
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

  @Override
  public void postProcessBeanFactory(ConfigurableListableBeanFactory bf) throws BeansException {
    BeanDefinition bd = bf.getBeanDefinition("car");
    bd.getPropertyValues().addPropertyValue("brand", "奇瑞QQ");
    System.out.println("MyBeanFactoryPostProcessor.postProcessBeanFactory()");
    System.out.println();
  }
}
