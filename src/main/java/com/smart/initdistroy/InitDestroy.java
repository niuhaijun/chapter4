package com.smart.initdistroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author niuhaijun
 * @date 2018/7/24 14:39
 */
public class InitDestroy {

  private String init;
  private String destroy;

  public InitDestroy() {}

  public InitDestroy(String init, String destroy) {
    this.init = init;
    this.destroy = destroy;
  }

  @PostConstruct
  public void init() {
    System.out.println("执行被标注了@PostConstruct初始化方法inti()");
    init = "init";
    destroy = "destroy";
  }

  @PreDestroy
  public void destroy() {
    System.out.println("执行被标注了@PreDestroy销毁方法destroy()");
  }

  public String getInit() {
    return init;
  }

  public void setInit(String init) {
    this.init = init;
  }

  public String getDestroy() {
    return destroy;
  }

  public void setDestroy(String destroy) {
    this.destroy = destroy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    InitDestroy that = (InitDestroy) o;

    if (init != null ? !init.equals(that.init) : that.init != null) {
      return false;
    }
    return destroy != null ? destroy.equals(that.destroy) : that.destroy == null;
  }

  @Override
  public int hashCode() {
    int result = init != null ? init.hashCode() : 0;
    result = 31 * result + (destroy != null ? destroy.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "InitDestroy{" +
        "init='" + init + '\'' +
        ", destroy='" + destroy + '\'' +
        '}';
  }
}
