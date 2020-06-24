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
@FeignClient(value = "SPRING-CLOUD-DEPT")
public interface DeptClientService {
    @RequestMapping("/dept/add")
    boolean add(Dept dept);

    @GetMapping("/dept/get/{id}")
    Dept get(@PathVariable("id") Long id);

    @GetMapping("/dept/list")
    List<Dept> list();


}
