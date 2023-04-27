package com.neuedu.dao;

import com.neuedu.entity.EasybuyOrderDetail;
import org.apache.ibatis.jdbc.SQL;

public class EasybuyOrderDetailSqlProvider {
    public String insertSelective(EasybuyOrderDetail record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("easybuy_order_detail");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getOrderid() != null) {
            sql.VALUES("orderId", "#{orderid,jdbcType=INTEGER}");
        }
        
        if (record.getProductid() != null) {
            sql.VALUES("productId", "#{productid,jdbcType=INTEGER}");
        }
        
        if (record.getQuantity() != null) {
            sql.VALUES("quantity", "#{quantity,jdbcType=INTEGER}");
        }
        
        if (record.getCost() != null) {
            sql.VALUES("cost", "#{cost,jdbcType=REAL}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(EasybuyOrderDetail record) {
        SQL sql = new SQL();
        sql.UPDATE("easybuy_order_detail");
        
        if (record.getOrderid() != null) {
            sql.SET("orderId = #{orderid,jdbcType=INTEGER}");
        }
        
        if (record.getProductid() != null) {
            sql.SET("productId = #{productid,jdbcType=INTEGER}");
        }
        
        if (record.getQuantity() != null) {
            sql.SET("quantity = #{quantity,jdbcType=INTEGER}");
        }
        
        if (record.getCost() != null) {
            sql.SET("cost = #{cost,jdbcType=REAL}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}