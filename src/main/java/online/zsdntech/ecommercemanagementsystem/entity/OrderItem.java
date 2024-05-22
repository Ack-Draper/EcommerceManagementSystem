package online.zsdntech.ecommercemanagementsystem.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("order_items")
public class OrderItem {
    @TableId
    private Long id;
    private Long orderId;    // 订单ID
    private Long productId;  // 产品ID
    private Integer quantity; // 数量
    private Double price;    // 价格
}
