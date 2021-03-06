package cn.lhx.springcloud.controller;

import cn.lhx.springcloud.entities.Dept;
import cn.lhx.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lee549
 * @date 2020/6/19 18:43
 */
@RestController
public class DeptController {
    @Resource
    private DeptService deptService;
    @Resource
    private DiscoveryClient client;

    @RequestMapping("/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return deptService.save(dept);
    }

    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "processHystrixGet")
    public Dept get(@PathVariable Long id) {
        Dept dept = this.deptService.getById(id);
        if (null == dept) {
            throw new RuntimeException("没有该id:"+id+"的信息");
        }
        return dept;
    }

    public Dept processHystrixGet(@PathVariable Long id) {
        return new Dept().setDeptNo(id).setDName("没有该id:"+id+"的信息").setDbSource("no database");
    }

    @GetMapping("/dept/list")
    public List<Dept> list() {
        return deptService.list();
    }

    @GetMapping("/dept/discovery")
    public Object discovery() {
        List<String> list = client.getServices();
        System.out.println("***" + list);
        List<ServiceInstance> srvList = client.getInstances("spring-cloud-dept");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t" + element.getUri());

        }
        return this.client;
    }

}
