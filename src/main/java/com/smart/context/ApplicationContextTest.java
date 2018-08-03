package com.smart.context;

import com.smart.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;
import org.testng.annotations.Test;

/**
 * @author niuhaijun
 * @date 2018/7/23 14:27
 */
public class ApplicationContextTest {

  @Test
  public void TestClassPathXmlApplicationContext() {
    String location = "classpath:com/smart/context/beans.xml";
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext(location);
    Car car = applicationContext.getBean("car", Car.class);

    car.introduce();
  }

  @Test
  public void TestFileSystemXmlApplicationContext() {
    String location = "file:D:/masterSpring/code/chapter4/src/main/resources/com/smart/context/beans.xml";
    ApplicationContext applicationContext = new FileSystemXmlApplicationContext(location);
    Car car = applicationContext.getBean("car", Car.class);

    car.introduce();
  }

  @Test
  public void TestAnnotationConfigApplicationContext() {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Beans.class);
    Car car = applicationContext.getBean("car", Car.class);

    car.introduce();
  }

  @Test
  public void TestGenericGroovyApplicationContext() {
    String location = "classpath:com/smart/context/groovy-beans.groovy";
    ApplicationContext applicationContext = new GenericGroovyApplicationContext(location);
    Car car = applicationContext.getBean("car", Car.class);

    car.introduce();
  }

}
