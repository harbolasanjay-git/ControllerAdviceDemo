package com.stech.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TBL_MST_PRODUCT")
public class MstProduct {
    @Id
    private int PRODUCTID;
    @Column(name = "PRODUCT_NAME")
    private String productName;
    @Column(name = "PRODUCT_PRICE")
    private float productPrice;
    @Column(name = "PRODUCT_TYPE")
    private String productType;
}
