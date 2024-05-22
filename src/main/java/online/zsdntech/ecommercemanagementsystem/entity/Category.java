package online.zsdntech.ecommercemanagementsystem.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("categories")
public class Category {
    @TableId
    private Long id;
    private String name;
    private String description;

}
