package cn.lhx.springcloud.service.Impl;

import cn.lhx.springcloud.dao.DeptDao;
import cn.lhx.springcloud.entities.Dept;
import cn.lhx.springcloud.service.DeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author lee549
 * @date 2020/6/19 18:39
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptDao, Dept> implements DeptService {
}
