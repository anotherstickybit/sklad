package ru.puppetters.sklad.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.puppetters.sklad.entity.embeddable.SaleProductPK;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "purchase", schema = "sklad")
public class SaleProductEntity {

    @EmbeddedId
    private SaleProductPK id;

    @ManyToOne
    @MapsId("saleId")
    @JoinColumn(name = "sale_id")
    private SaleEntity sale;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id")
    private ProductEntity product;

    @Column(name = "count", nullable = false)
    private Integer count;

    @Column(name = "price_per_one", nullable = false)
    private Integer pricePerOne;
}
