package com.smart.classloader;

/**
 * @author niuhaijun
 * @date 2018/7/22 18:52
 */
public class ClassLoaderLevel {

  /**
   * ClassLoader的父子层级关系
   */
  public static void main(String[] args) {
    ClassLoader loader = Thread.currentThread().getContextClassLoader();
    System.out.println("AppClassLoader " + loader);
    System.out.println("ExtClassLoader " + loader.getParent());
    System.out.println("BootstrpClassLoader " + loader.getParent().getParent());
  }
}
