package com.neuedu.dao;

import com.neuedu.entity.EasybuyUser;
import org.apache.ibatis.jdbc.SQL;

public class EasybuyUserSqlProvider {
    public String insertSelective(EasybuyUser record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("easybuy_user");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getLoginname() != null) {
            sql.VALUES("loginName", "#{loginname,jdbcType=VARCHAR}");
        }
        
        if (record.getUsername() != null) {
            sql.VALUES("userName", "#{username,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.VALUES("password", "#{password,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            sql.VALUES("sex", "#{sex,jdbcType=INTEGER}");
        }
        
        if (record.getIdentitycode() != null) {
            sql.VALUES("identityCode", "#{identitycode,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.VALUES("email", "#{email,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            sql.VALUES("mobile", "#{mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("type", "#{type,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(EasybuyUser record) {
        SQL sql = new SQL();
        sql.UPDATE("easybuy_user");
        
        if (record.getLoginname() != null) {
            sql.SET("loginName = #{loginname,jdbcType=VARCHAR}");
        }
        
        if (record.getUsername() != null) {
            sql.SET("userName = #{username,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.SET("password = #{password,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            sql.SET("sex = #{sex,jdbcType=INTEGER}");
        }
        
        if (record.getIdentitycode() != null) {
            sql.SET("identityCode = #{identitycode,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("email = #{email,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            sql.SET("mobile = #{mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{type,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}