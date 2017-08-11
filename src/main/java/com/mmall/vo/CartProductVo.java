package com.mmall.vo;

import java.math.BigDecimal;

/**
 * Created by casin
 */
public class CartProductVo {

//结合了产品和购物车的一个抽象对象
    /*购物车Id*/
    private Integer id;
    /*userId*/
    private Integer userId;
    /*商品的Id*/
    private Integer productId;
    /*购物车中此产品的数量*/
    private Integer quantity;
    /*产品的名称*/
    private String productName;
    /*产品的副标题*/
    private String productSubtitle;
    /*产品的主图*/
    private String productMainImage;
    /*产品的价格*/
    private BigDecimal productPrice;
    /*产品的状态*/
    private Integer productStatus;
    /*产品的总价格*/
    private BigDecimal productTotalPrice;
    /*产品的库存*/
    private Integer productStock;
    /*此商品是否勾选*/
    private Integer productChecked;

    /*限制数量的一个返回结果*/
    private String limitQuantity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductSubtitle() {
        return productSubtitle;
    }

    public void setProductSubtitle(String productSubtitle) {
        this.productSubtitle = productSubtitle;
    }

    public String getProductMainImage() {
        return productMainImage;
    }

    public void setProductMainImage(String productMainImage) {
        this.productMainImage = productMainImage;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    public BigDecimal getProductTotalPrice() {
        return productTotalPrice;
    }

    public void setProductTotalPrice(BigDecimal productTotalPrice) {
        this.productTotalPrice = productTotalPrice;
    }

    public Integer getProductStock() {
        return productStock;
    }

    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }

    public Integer getProductChecked() {
        return productChecked;
    }

    public void setProductChecked(Integer productChecked) {
        this.productChecked = productChecked;
    }

    public String getLimitQuantity() {
        return limitQuantity;
    }

    public void setLimitQuantity(String limitQuantity) {
        this.limitQuantity = limitQuantity;
    }
}
