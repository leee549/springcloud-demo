package cn.lhx.springcloud;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author lee549
 * @date 2020/6/27 14:05
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, DruidDataSourceAutoConfigure.class })
public class ConfigClientApp3355 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApp3355.class,args);
    }
}
