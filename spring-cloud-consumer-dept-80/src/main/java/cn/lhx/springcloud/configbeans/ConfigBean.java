package cn.lhx.springcloud.configbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author lee549
 * @date 2020/6/20 17:06
 */
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    //自定义随机负载均衡算法代替轮询
    // @Bean
    // public IRule myRule() {
    //     return new RandomRule();
    // }
}
