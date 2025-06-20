package org.grainger.product.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;
    @Column
    private Double price;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    public Product(Long id, String name, Double price) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
