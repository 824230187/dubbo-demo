package top.jf.dal.mapper;

import top.jf.dal.entity.BikeGoods;

public interface BikeGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bike_goods
     *
     * @mbg.generated Mon Jun 05 11:48:48 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bike_goods
     *
     * @mbg.generated Mon Jun 05 11:48:48 CST 2017
     */
    int insert(BikeGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bike_goods
     *
     * @mbg.generated Mon Jun 05 11:48:48 CST 2017
     */
    int insertSelective(BikeGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bike_goods
     *
     * @mbg.generated Mon Jun 05 11:48:48 CST 2017
     */
    BikeGoods selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bike_goods
     *
     * @mbg.generated Mon Jun 05 11:48:48 CST 2017
     */
    int updateByPrimaryKeySelective(BikeGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bike_goods
     *
     * @mbg.generated Mon Jun 05 11:48:48 CST 2017
     */
    int updateByPrimaryKey(BikeGoods record);
}