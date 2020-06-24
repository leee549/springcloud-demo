package cn.lhx.springcloud.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author lee549
 * @date 2020/6/14 23:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName("dept")
public class Dept implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value = "deptno", type = IdType.AUTO)
    private Long deptNo;
    @TableField(value = "dname")
    private String dName;
    @TableField(value = "db_source")
    private String dbSource; //来自哪个数据库

}
