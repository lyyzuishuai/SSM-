package com.neuedu.dao;

import com.neuedu.entity.EasybuyNews;
import org.apache.ibatis.jdbc.SQL;

public class EasybuyNewsSqlProvider {
    public String insertSelective(EasybuyNews record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("easybuy_news");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getTitle() != null) {
            sql.VALUES("title", "#{title,jdbcType=VARCHAR}");
        }
        
        if (record.getContent() != null) {
            sql.VALUES("content", "#{content,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatetime() != null) {
            sql.VALUES("createTime", "#{createtime,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(EasybuyNews record) {
        SQL sql = new SQL();
        sql.UPDATE("easybuy_news");
        
        if (record.getTitle() != null) {
            sql.SET("title = #{title,jdbcType=VARCHAR}");
        }
        
        if (record.getContent() != null) {
            sql.SET("content = #{content,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatetime() != null) {
            sql.SET("createTime = #{createtime,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}