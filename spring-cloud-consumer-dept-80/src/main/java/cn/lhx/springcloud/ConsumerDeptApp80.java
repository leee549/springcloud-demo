package cn.lhx.springcloud;

import cn.lhx.myrule.MySelfRule;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author lee549
 * @date 2020/6/20 17:36
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, DruidDataSourceAutoConfigure.class })
@EnableEurekaClient
@RibbonClient(name = "SPRING-CLOUD-DEPT",configuration = MySelfRule.class)//自定义ribbon规则类，不能放在@ComponentScan的包下
public class ConsumerDeptApp80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDeptApp80.class,args);
    }
}
