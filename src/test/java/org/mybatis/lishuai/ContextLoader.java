package org.mybatis.lishuai;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: mybatis-spring
 * @author: lishuai
 * @create: 2020-06-18 22:56
 */
public class ContextLoader {
  public static void main (String args[]){
   t2();
  }

  public static void t1() {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ParentConfig.class);
    Car car = (Toyota)context.getBean("toyota");
    car.print();
    car = (Volkswagen)context.getBean("volkswagen");
    car.print();
    context.close();
  }

  public static void t2() {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SimpleConfig.class);
    Car car = context.getBean(Toyota.class);
    car.print();
    car = context.getBean(Volkswagen.class);
    car.print();
    context.close();
  }
}
