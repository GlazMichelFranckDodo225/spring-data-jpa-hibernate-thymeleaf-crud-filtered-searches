package com.dgmf.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
@Table(name = "tbl_product")
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false, length = 60)
    private String name;
    @Column(name = "brand", nullable = false, length = 60)
    private String brand;
    @Column(name = "made_in", nullable = false, length = 60)
    private String madeIn;
    @Column(name = "price", nullable = false)
    private float price;
}
