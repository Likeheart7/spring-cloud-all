package com.chenx.pojo;

import java.io.Serializable;

// 因为dubbo默认基于jdk序列化，所以一定要实现Serializable接口
public class Order implements Serializable {
    private Long orderId;
    private Long productId;
    private String productName;
    private String productDesc;
    private Integer productCount;


    public Order() {
    }

    public Order(Long orderId, Long productId, String productName, String productDesc, Integer productCount) {
        this.orderId = orderId;
        this.productId = productId;
        this.productName = productName;
        this.productDesc = productDesc;
        this.productCount = productCount;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }
}
