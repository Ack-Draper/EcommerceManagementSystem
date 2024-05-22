package online.zsdntech.ecommercemanagementsystem.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("payments")
public class Payment {
    @TableId
    private Long id;
    private Long orderId;       // 订单ID
    private Double amount;      // 支付金额
    private String paymentMethod; // 支付方式
    private LocalDateTime paymentDate; // 支付日期
}
