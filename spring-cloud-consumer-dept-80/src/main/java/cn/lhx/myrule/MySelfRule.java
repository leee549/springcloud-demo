package cn.lhx.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lee549
 * @date 2020/6/23 22:26
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new FiveRandomRule();
    }

}
