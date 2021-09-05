package org.mybatis.lishuai;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @program: mybatis-spring
 * @author: lishuai
 * @create: 2020-06-18 22:56
 */
@Configuration
@Import({Toyota.class,Volkswagen.class})//@Import注解把用到的bean导入到了当前容器中。
public class SimpleConfig {
  //Any other bean definitions
}
