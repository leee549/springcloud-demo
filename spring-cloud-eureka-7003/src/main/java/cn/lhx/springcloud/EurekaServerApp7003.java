package cn.lhx.springcloud;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lee549
 * @date 2020/6/21 14:10
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, DruidDataSourceAutoConfigure.class })
@EnableEurekaServer
public class EurekaServerApp7003 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApp7003.class,args);
    }
}
