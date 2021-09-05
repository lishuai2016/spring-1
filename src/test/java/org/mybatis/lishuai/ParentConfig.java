package org.mybatis.lishuai;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @program: mybatis-spring
 * @author: lishuai
 * @create: 2020-06-18 22:56
 */
@Configuration
@Import({JavaConfigA.class,JavaConfigB.class})//导入配置类到当前容器中
public class ParentConfig {
  //Any other bean definitions
}
