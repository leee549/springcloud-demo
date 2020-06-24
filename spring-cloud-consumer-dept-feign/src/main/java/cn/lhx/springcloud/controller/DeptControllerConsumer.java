package cn.lhx.springcloud.controller;

import cn.lhx.springcloud.entities.Dept;
import cn.lhx.springcloud.service.DeptClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lee549
 * @date 2020/6/20 17:09
 */
@RestController
@RequestMapping("/consumer")
public class DeptControllerConsumer {
    @Resource
    DeptClientService deptClientService;

    @RequestMapping("/dept/add")
    public boolean add(Dept dept) {
        return this.deptClientService.add(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return this.deptClientService.get(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> list() {
        return this.deptClientService.list();
    }

}
