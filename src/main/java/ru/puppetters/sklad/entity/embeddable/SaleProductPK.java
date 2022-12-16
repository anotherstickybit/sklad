package ru.puppetters.sklad.entity.embeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class SaleProductPK implements Serializable {

    @Column(name = "sale_id", nullable = false)
    private Long saleId;

    @Column(name = "product_id", nullable = false)
    private Long productId;
}
