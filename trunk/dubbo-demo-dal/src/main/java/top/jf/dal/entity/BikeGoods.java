package top.jf.dal.entity;

import java.util.Date;

public class BikeGoods {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bike_goods.id
     *
     * @mbg.generated Mon Jun 05 11:48:48 CST 2017
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bike_goods.brand
     *
     * @mbg.generated Mon Jun 05 11:48:48 CST 2017
     */
    private String brand;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bike_goods.goods_type
     *
     * @mbg.generated Mon Jun 05 11:48:48 CST 2017
     */
    private String goodsType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bike_goods.create_time
     *
     * @mbg.generated Mon Jun 05 11:48:48 CST 2017
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bike_goods.id
     *
     * @return the value of bike_goods.id
     *
     * @mbg.generated Mon Jun 05 11:48:48 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bike_goods.id
     *
     * @param id the value for bike_goods.id
     *
     * @mbg.generated Mon Jun 05 11:48:48 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bike_goods.brand
     *
     * @return the value of bike_goods.brand
     *
     * @mbg.generated Mon Jun 05 11:48:48 CST 2017
     */
    public String getBrand() {
        return brand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bike_goods.brand
     *
     * @param brand the value for bike_goods.brand
     *
     * @mbg.generated Mon Jun 05 11:48:48 CST 2017
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bike_goods.goods_type
     *
     * @return the value of bike_goods.goods_type
     *
     * @mbg.generated Mon Jun 05 11:48:48 CST 2017
     */
    public String getGoodsType() {
        return goodsType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bike_goods.goods_type
     *
     * @param goodsType the value for bike_goods.goods_type
     *
     * @mbg.generated Mon Jun 05 11:48:48 CST 2017
     */
    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bike_goods.create_time
     *
     * @return the value of bike_goods.create_time
     *
     * @mbg.generated Mon Jun 05 11:48:48 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bike_goods.create_time
     *
     * @param createTime the value for bike_goods.create_time
     *
     * @mbg.generated Mon Jun 05 11:48:48 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}