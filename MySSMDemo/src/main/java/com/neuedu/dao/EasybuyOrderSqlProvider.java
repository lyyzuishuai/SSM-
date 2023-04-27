package com.neuedu.dao;

import com.neuedu.entity.EasybuyOrder;
import org.apache.ibatis.jdbc.SQL;

public class EasybuyOrderSqlProvider {
    public String insertSelective(EasybuyOrder record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("easybuy_order");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getUserid() != null) {
            sql.VALUES("userId", "#{userid,jdbcType=INTEGER}");
        }
        
        if (record.getLoginname() != null) {
            sql.VALUES("loginName", "#{loginname,jdbcType=VARCHAR}");
        }
        
        if (record.getUseraddress() != null) {
            sql.VALUES("userAddress", "#{useraddress,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatetime() != null) {
            sql.VALUES("createTime", "#{createtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCost() != null) {
            sql.VALUES("cost", "#{cost,jdbcType=REAL}");
        }
        
        if (record.getSerialnumber() != null) {
            sql.VALUES("serialNumber", "#{serialnumber,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(EasybuyOrder record) {
        SQL sql = new SQL();
        sql.UPDATE("easybuy_order");
        
        if (record.getUserid() != null) {
            sql.SET("userId = #{userid,jdbcType=INTEGER}");
        }
        
        if (record.getLoginname() != null) {
            sql.SET("loginName = #{loginname,jdbcType=VARCHAR}");
        }
        
        if (record.getUseraddress() != null) {
            sql.SET("userAddress = #{useraddress,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatetime() != null) {
            sql.SET("createTime = #{createtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCost() != null) {
            sql.SET("cost = #{cost,jdbcType=REAL}");
        }
        
        if (record.getSerialnumber() != null) {
            sql.SET("serialNumber = #{serialnumber,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}