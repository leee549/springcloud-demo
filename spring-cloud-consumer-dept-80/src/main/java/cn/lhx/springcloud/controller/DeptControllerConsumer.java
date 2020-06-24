package cn.lhx.springcloud.controller;

import cn.lhx.springcloud.entities.Dept;
import org.springframework.web.bind.annotation.*;
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
    private RestTemplate restTemplate;
    // public static final String REST_URL_PREFIX = "http://localhost:8001";
    public static final String REST_URL_PREFIX = "http://SPRING-CLOUD-DEPT";

    @RequestMapping("/dept/add")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @GetMapping("/dept/list")
    public List<Dept> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }
    @RequestMapping("/dept/discovery")
    public Object discovery(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/discovery",Object.class);
    }

}
