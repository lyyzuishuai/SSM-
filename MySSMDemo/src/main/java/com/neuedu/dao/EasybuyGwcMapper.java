package com.neuedu.dao;

import com.neuedu.entity.EasybuyGwc;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface EasybuyGwcMapper {

    @Insert({
            "insert into easybuy_gwc(user_id,product_name,product_price,product_img,num,product_id)",
            "values (#{user_id},#{product_name},#{product_price},#{product_img},#{num},#{product_id})"
    })
    Integer insert(EasybuyGwc easybuyGwc);


    @Select({
            "select",
            "id, user_id, product_name, product_price, product_img, num,product_id",
            "from easybuy_gwc",
            "where user_id = #{id}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "user_id", property = "user_id", jdbcType = JdbcType.INTEGER),
            @Result(column = "product_name", property = "product_name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "product_price", property = "product_price", jdbcType = JdbcType.DOUBLE),
            @Result(column = "product_img", property = "product_img", jdbcType = JdbcType.VARCHAR),
            @Result(column = "num", property = "num", jdbcType = JdbcType.INTEGER),
            @Result(column = "product_id",property = "product_id",jdbcType = JdbcType.INTEGER)
    })
    List<EasybuyGwc> selectGwcByUserId(Integer id);


    @Delete({
            "delete from easybuy_gwc",
            "where id = #{id,jdbcType=INTEGER}"
    })
    Integer deleteShoppingCartById(Integer id);

    @Select({
            "select",
            "id, user_id, product_name, product_price, product_img, num,product_id",
            "from easybuy_gwc",
            "where product_id = #{pid}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "user_id", property = "user_id", jdbcType = JdbcType.INTEGER),
            @Result(column = "product_name", property = "product_name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "product_price", property = "product_price", jdbcType = JdbcType.DOUBLE),
            @Result(column = "product_img", property = "product_img", jdbcType = JdbcType.VARCHAR),
            @Result(column = "num", property = "num", jdbcType = JdbcType.INTEGER),
            @Result(column = "product_id",property = "product_id",jdbcType = JdbcType.INTEGER)
    })
    EasybuyGwc selectGwcByProdcutId(Integer pid);


    @Update({
            "update easybuy_gwc",
            "set num = num+1",
            "where product_id = #{pid,jdbcType=INTEGER}"
    })
    void updateProductNumByProductId(Integer pid);


    @Delete({
            "delete from easybuy_gwc",
            "where product_id = #{pid,jdbcType=INTEGER}"
    })
    void deleteShoppingCartByProductId(int productId);


    @Update({
            "update easybuy_gwc",
            "set num = num-1",
            "where product_id = #{pid,jdbcType=INTEGER}"
    })
    Integer reduceByProductId(Integer pid);
}
