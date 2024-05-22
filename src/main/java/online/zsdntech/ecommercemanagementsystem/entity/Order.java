package online.zsdntech.ecommercemanagementsystem.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("orders")
public class Order {
    @TableId
    private Long id;
    private String orderNumber;  // 订单号
    private Long customerId;     // 客户ID
    private Double totalPrice;   // 总价格
    private String status;       // 订单状态
    private LocalDateTime createdAt;  // 创建时间
    private LocalDateTime updatedAt;  // 更新时间
}
