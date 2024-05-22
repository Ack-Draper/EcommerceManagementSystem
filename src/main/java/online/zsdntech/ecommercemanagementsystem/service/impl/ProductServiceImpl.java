package online.zsdntech.ecommercemanagementsystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import online.zsdntech.ecommercemanagementsystem.entity.Product;
import online.zsdntech.ecommercemanagementsystem.mapper.ProductMapper;
import online.zsdntech.ecommercemanagementsystem.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
