package com.itheima.dao.cargo;

import com.itheima.domain.cargo.Shipping;
import com.itheima.domain.cargo.ShippingExample;
import java.util.List;

public interface ShippingDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table co_shipping_order
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table co_shipping_order
     *
     * @mbg.generated
     */
    int insert(Shipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table co_shipping_order
     *
     * @mbg.generated
     */
    int insertSelective(Shipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table co_shipping_order
     *
     * @mbg.generated
     */
    List<Shipping> selectByExample(ShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table co_shipping_order
     *
     * @mbg.generated
     */
    Shipping selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table co_shipping_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Shipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table co_shipping_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Shipping record);
}