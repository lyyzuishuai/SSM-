package com.neuedu.dao;

import com.neuedu.entity.EasybuyProduct;
import org.apache.ibatis.jdbc.SQL;

public class EasybuyProductSqlProvider {
    public String insertSelective(EasybuyProduct record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("easybuy_product");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getDescription() != null) {
            sql.VALUES("description", "#{description,jdbcType=VARCHAR}");
        }
        
        if (record.getPrice() != null) {
            sql.VALUES("price", "#{price,jdbcType=REAL}");
        }
        
        if (record.getStock() != null) {
            sql.VALUES("stock", "#{stock,jdbcType=INTEGER}");
        }
        
        if (record.getCategorylevel1id() != null) {
            sql.VALUES("categoryLevel1Id", "#{categorylevel1id,jdbcType=INTEGER}");
        }
        
        if (record.getCategorylevel2id() != null) {
            sql.VALUES("categoryLevel2Id", "#{categorylevel2id,jdbcType=INTEGER}");
        }
        
        if (record.getCategorylevel3id() != null) {
            sql.VALUES("categoryLevel3Id", "#{categorylevel3id,jdbcType=INTEGER}");
        }
        
        if (record.getFilename() != null) {
            sql.VALUES("fileName", "#{filename,jdbcType=VARCHAR}");
        }
        
        if (record.getIsdelete() != null) {
            sql.VALUES("isDelete", "#{isdelete,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(EasybuyProduct record) {
        SQL sql = new SQL();
        sql.UPDATE("easybuy_product");
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getDescription() != null) {
            sql.SET("description = #{description,jdbcType=VARCHAR}");
        }
        
        if (record.getPrice() != null) {
            sql.SET("price = #{price,jdbcType=REAL}");
        }
        
        if (record.getStock() != null) {
            sql.SET("stock = #{stock,jdbcType=INTEGER}");
        }
        
        if (record.getCategorylevel1id() != null) {
            sql.SET("categoryLevel1Id = #{categorylevel1id,jdbcType=INTEGER}");
        }
        
        if (record.getCategorylevel2id() != null) {
            sql.SET("categoryLevel2Id = #{categorylevel2id,jdbcType=INTEGER}");
        }
        
        if (record.getCategorylevel3id() != null) {
            sql.SET("categoryLevel3Id = #{categorylevel3id,jdbcType=INTEGER}");
        }
        
        if (record.getFilename() != null) {
            sql.SET("fileName = #{filename,jdbcType=VARCHAR}");
        }
        
        if (record.getIsdelete() != null) {
            sql.SET("isDelete = #{isdelete,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}