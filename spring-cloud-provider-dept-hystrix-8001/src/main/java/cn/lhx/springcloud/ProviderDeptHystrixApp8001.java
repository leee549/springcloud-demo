package cn.lhx.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lee549
 * @date 2020/6/19 17:55
 */
@SpringBootApplication
@EnableEurekaClient    //本服务启动后会自动注册进Eureka服务中
@EnableDiscoveryClient  //服务发现
@EnableCircuitBreaker  //服务熔断
@MapperScan("cn.lhx.springcloud.dao")
public class ProviderDeptHystrixApp8001 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderDeptHystrixApp8001.class,args);
    }

}
