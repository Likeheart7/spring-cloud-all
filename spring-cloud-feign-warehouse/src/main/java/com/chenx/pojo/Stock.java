package com.chenx.pojo;

public class Stock {
    private Long id;
    private String name;
    private Integer quantity;
    private String unit;
    private String desc;


    public Stock(Long id, String name, Integer quantity, String unit, String desc) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.desc = desc;
    }

    public Stock() {
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
