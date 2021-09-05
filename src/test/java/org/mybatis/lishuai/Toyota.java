package org.mybatis.lishuai;

import org.springframework.stereotype.Component;

/**
 * @program: mybatis-spring
 * @author: lishuai
 * @create: 2020-06-18 22:54
 */
//@Component
public class Toyota implements Car{
  public void print(){
    System.out.println("I am Toyota");
  }
}
