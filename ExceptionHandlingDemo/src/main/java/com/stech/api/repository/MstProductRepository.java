package com.stech.api.repository;

import com.stech.api.model.MstProduct;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MstProductRepository extends JpaRepository<MstProduct,Integer> {
    List<MstProduct> findByProductType(String product_Type);
}
