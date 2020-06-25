package cn.lhx.springcloud.service;

import cn.lhx.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lee549
 * @date 2020/6/25 22:16
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id) {
                return new Dept()
                        .setDeptNo(id)
                        .setDName("没有该id:" + id + "的信息,此刻provider服务已经关闭，consumer客户端已经降级处理")
                        .setDbSource("no database");

            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
