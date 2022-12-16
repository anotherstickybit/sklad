package ru.puppetters.sklad.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.puppetters.sklad.entity.embeddable.ProductWareHousePK;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "m2m_product_warehouse", schema = "sklad")
public class ProductWareHouseEntity {

    @EmbeddedId
    private ProductWareHousePK id;

    @ManyToOne
    @MapsId("wareHouseId")
    @JoinColumn(name = "warehouse_id")
    private WareHouseEntity wareHouse;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id")
    private ProductEntity product;

    @Column(name = "count", nullable = false)
    private Integer count;
}
