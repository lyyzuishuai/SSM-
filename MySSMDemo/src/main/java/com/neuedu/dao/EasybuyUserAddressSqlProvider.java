package com.neuedu.dao;

import com.neuedu.entity.EasybuyUserAddress;
import org.apache.ibatis.jdbc.SQL;

public class EasybuyUserAddressSqlProvider {
    public String insertSelective(EasybuyUserAddress record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("easybuy_user_address");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getUserid() != null) {
            sql.VALUES("userId", "#{userid,jdbcType=INTEGER}");
        }
        
        if (record.getAddress() != null) {
            sql.VALUES("address", "#{address,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatetime() != null) {
            sql.VALUES("createTime", "#{createtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIsdefault() != null) {
            sql.VALUES("isDefault", "#{isdefault,jdbcType=INTEGER}");
        }
        
        if (record.getRemark() != null) {
            sql.VALUES("remark", "#{remark,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(EasybuyUserAddress record) {
        SQL sql = new SQL();
        sql.UPDATE("easybuy_user_address");
        
        if (record.getUserid() != null) {
            sql.SET("userId = #{userid,jdbcType=INTEGER}");
        }
        
        if (record.getAddress() != null) {
            sql.SET("address = #{address,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatetime() != null) {
            sql.SET("createTime = #{createtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIsdefault() != null) {
            sql.SET("isDefault = #{isdefault,jdbcType=INTEGER}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{remark,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}