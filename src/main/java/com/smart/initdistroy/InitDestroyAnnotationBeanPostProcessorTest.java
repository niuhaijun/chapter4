package com.smart.initdistroy;

import org.springframework.beans.factory.annotation.InitDestroyAnnotationBeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.testng.annotations.Test;

/**
 * @author niuhaijun
 * @date 2018/7/24 14:38
 */
public class InitDestroyAnnotationBeanPostProcessorTest {

  @Test
  public void testInitDestroyAnnotation() {
    String location = "classpath:com/smart/initdistroy/beans.xml";
    ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
    Resource resource = resolver.getResource(location);

    DefaultListableBeanFactory bf = new DefaultListableBeanFactory();
    XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(bf);
    reader.loadBeanDefinitions(resource);

    ((ConfigurableBeanFactory) bf)
        .addBeanPostProcessor(new InitDestroyAnnotationBeanPostProcessor());

    InitDestroy id = bf.getBean("initdistroy", InitDestroy.class);
    System.out.println(id);
  }
}
