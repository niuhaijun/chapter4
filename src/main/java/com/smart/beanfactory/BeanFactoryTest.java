package com.smart.beanfactory;

import com.smart.Car;
import java.io.IOException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * @author niuhaijun
 * @date 2018/7/23 10:34
 */
public class BeanFactoryTest {

  public static void main(String[] args) throws IOException {
    String location = "classpath:/com/smart/beanfactory/beans.xml";
    ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
    Resource resource = resourcePatternResolver.getResource(location);
    System.out.println(resource.getURL());

    DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
    XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(
        defaultListableBeanFactory);
    xmlBeanDefinitionReader.loadBeanDefinitions(resource);

    Car car = defaultListableBeanFactory.getBean("car", Car.class);
    car.introduce();
  }
}
