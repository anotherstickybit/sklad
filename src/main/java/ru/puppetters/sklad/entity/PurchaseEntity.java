package ru.puppetters.sklad.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "purchase", schema = "sklad")
public class PurchaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "warehouse_id", referencedColumnName = "id")
    private WareHouseEntity wareHouse;

    @CreatedDate
    @Column(name = "date", nullable = false)
    private LocalDateTime creationDate;
}
