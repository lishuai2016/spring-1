package org.mybatis.lishuai;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: mybatis-spring
 * @author: lishuai
 * @create: 2020-06-18 22:55
 */
@Configuration
public class JavaConfigA {

  @Bean(name="volkswagen")
  public Car getVolkswagen(){
    return new Volkswagen();
  }
}
