package ru.puppetters.sklad.entity.embeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ProductWareHousePK implements Serializable {

    @Column(name = "warehouse_id", nullable = false)
    private Long wareHouseId;

    @Column(name = "product_id", nullable = false)
    private Long productId;
}
