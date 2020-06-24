package cn.lhx.springcloud;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author lee549
 * @date 2020/6/20 17:36
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, DruidDataSourceAutoConfigure.class })
@EnableEurekaClient
@EnableFeignClients
public class ConsumerDeptFeignApp80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDeptFeignApp80.class,args);
    }
}
