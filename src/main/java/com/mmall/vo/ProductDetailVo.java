package com.mmall.vo;

import java.math.BigDecimal;

/**
 * 类说明：
 *
 * @author: Casin
 * @Create: 2017-07-05 9:53
 * @HOME: https://qincasin.github.io/
 */

public class ProductDetailVo {
    /*产品id*/
    private Integer id;
    /*产品分类*/
    private Integer categoryId;
    /*产品名字*/
    private String name;
    /*产品副标题*/
    private String subtitle;
    /*产品主图*/
    private String mainImage;
    /*产品子图*/
    private String subImages;
    /*产品详情描述*/
    private String detail;
    private BigDecimal price;
    /*产品库存*/
    private Integer stock;
    /*产品状态*/
    private Integer status;
    /*产品创建时间*/
    private String  createTime;
    /*产品更新时间*/
    private String updateTime;
    /*服务器的前缀*/
    private String imageHost;
    /*父分类*/
    private Integer parentCategoryId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }

    public String getSubImages() {
        return subImages;
    }

    public void setSubImages(String subImages) {
        this.subImages = subImages;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getImageHost() {
        return imageHost;
    }

    public void setImageHost(String imageHost) {
        this.imageHost = imageHost;
    }

    public Integer getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(Integer parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }







}
