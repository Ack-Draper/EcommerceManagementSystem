package online.zsdntech.ecommercemanagementsystem.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("products")
public class Product {
    @TableId
    private Long id;
    private String name;
    private String specification;
    private Double price;
    private String description;
    private Long categoryId;
    private String imageUrl;
    private Integer stock;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
