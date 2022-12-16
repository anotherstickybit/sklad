package ru.puppetters.sklad.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "product", schema = "sklad")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "vendor_code", nullable = false, unique = true)
    private Integer vendorCode;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "last_purchase_price")
    private Integer lastPurchasePrice;

    @Column(name = "last_sale_price")
    private Integer lastSalePrice;

    @OneToMany(mappedBy = "wareHouse")
    private Set<WareHouseEntity> wareHouses = new HashSet<>();
}
