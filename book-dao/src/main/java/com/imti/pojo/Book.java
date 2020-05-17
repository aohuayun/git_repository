package com.imti.pojo;

/**
 * @Author: ahy
 * @Date:2020/5/12
 * @Description:com.imti.pojo
 * @Version:1.0
 */
public class Book {
    private Integer id;
    private String name;
    private Double price;
    private Integer stock;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
