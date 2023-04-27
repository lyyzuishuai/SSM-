package com.neuedu.dao;

import com.neuedu.entity.EasybuyOrder;
import com.neuedu.entity.EasybuyOrderDetail;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.ArrayList;

public interface EasybuyOrderDetailMapper {
    @Delete({
        "delete from easybuy_order_detail",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert(
            "<script>"+
            "<foreach item='detail'  collection='details' > " +
                    "insert into easybuy_order_detail "+
                    "(orderId,productId, quantity, cost) values"+
                    "(#{oid,jdbcType=INTEGER},#{detail.productid,jdbcType=INTEGER}," +
                    " #{detail.quantity,jdbcType=INTEGER},  #{detail.cost,jdbcType=FLOAT});"+
            "</foreach>"+
            "</script>"

    )
    int insert(@Param("oid") int oid,@Param("details") ArrayList<EasybuyOrderDetail> details);

    @InsertProvider(type=EasybuyOrderDetailSqlProvider.class, method="insertSelective")
    int insertSelective(EasybuyOrderDetail record);

    @Select({
        "select",
        "id, orderId, productId, quantity, cost",
        "from easybuy_order_detail",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="orderId", property="orderid", jdbcType=JdbcType.INTEGER),
        @Result(column="productId", property="productid", jdbcType=JdbcType.INTEGER),
        @Result(column="quantity", property="quantity", jdbcType=JdbcType.INTEGER),
        @Result(column="cost", property="cost", jdbcType=JdbcType.FLOAT)
    })
    EasybuyOrderDetail selectByPrimaryKey(Integer id);

    @Select({
            "select",
            "d.id, d.orderId, d.productId,p.name productName, d.quantity, d.cost",
            "from easybuy_order_detail d",
            " left join easybuy_product p on d.productId=p.id",
            "where orderId = #{oid,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="orderId", property="orderid", jdbcType=JdbcType.INTEGER),
            @Result(column="productId", property="productid", jdbcType=JdbcType.INTEGER),
            @Result(column="productName", property="productName", jdbcType=JdbcType.INTEGER),
            @Result(column="quantity", property="quantity", jdbcType=JdbcType.INTEGER),
            @Result(column="cost", property="cost", jdbcType=JdbcType.FLOAT)
    })
    ArrayList<EasybuyOrderDetail> selectByOid(Integer oid);

    @UpdateProvider(type=EasybuyOrderDetailSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(EasybuyOrderDetail record);

    @Update({
        "update easybuy_order_detail",
        "set orderId = #{orderid,jdbcType=INTEGER},",
          "productId = #{productid,jdbcType=INTEGER},",
          "quantity = #{quantity,jdbcType=INTEGER},",
          "cost = #{cost,jdbcType=REAL}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(EasybuyOrderDetail record);
}