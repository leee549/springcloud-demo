package cn.lhx.springcloud.service;

import cn.lhx.springcloud.entities.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author lee549
 * @date 2020/6/24 12:05
 */

/**
 * 服务熔断，利用AOP 织入的思想，解决高耦合，当接口出现异常通通交给DeptClientServiceFallbackFactory处理
 */
@FeignClient(value = "SPRING-CLOUD-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
    @RequestMapping("/dept/add")
    boolean add(Dept dept);

    @GetMapping("/dept/get/{id}")
    Dept get(@PathVariable("id") Long id);

    @GetMapping("/dept/list")
    List<Dept> list();


}
