package com.neuedu.dao;

import com.neuedu.entity.EasybuyCategory;
import com.neuedu.entity.Page;
import org.apache.ibatis.jdbc.SQL;

public class EasybuyProductCategorySqlProvider {


    public String insertSelective(EasybuyCategory record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("easybuy_product_category");

        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }

        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }

        if (record.getParentid() != null) {
            sql.VALUES("parentId", "#{parentid,jdbcType=INTEGER}");
        }

        if (record.getType() != null) {
            sql.VALUES("type", "#{type,jdbcType=INTEGER}");
        }

        if (record.getIconclass() != null) {
            sql.VALUES("iconClass", "#{iconclass,jdbcType=VARCHAR}");
        }

        return sql.toString();
    }

    public String updateByPrimaryKeySelective(EasybuyCategory record) {
        SQL sql = new SQL();
        sql.UPDATE("easybuy_product_category");

        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }

        if (record.getParentid() != null) {
            sql.SET("parentId = #{parentid,jdbcType=INTEGER}");
        }

        if (record.getType() != null) {
            sql.SET("type = #{type,jdbcType=INTEGER}");
        }

        if (record.getIconclass() != null) {
            sql.SET("iconClass = #{iconclass,jdbcType=VARCHAR}");
        }

        sql.WHERE("id = #{id,jdbcType=INTEGER}");

        return sql.toString();
    }

    public String selectByPage(Page<EasybuyCategory> page) {
        SQL sql = new SQL();
        sql.SELECT(" s.id, s.name, s.parentId, p.name parentName,s.type, s.iconClass " +
                " from easybuy_product_category s  " +
                " left join easybuy_product_category p on s.parentId=p.id ");

        if (page.getParams().size() > 0 && page.getParams().containsKey("type")) {
            sql.WHERE("s.type=#{params.type,jdbcType=INTEGER}");
        }
        if (page.getKey() != null && !"".equals(page.getKey())) {
            sql.WHERE("s.name like concat('%',#{key,jdbcType=VARCHAR},'%') or s.parentId=#{key,jdbcType=VARCHAR}");
        }

        return sql.toString();
    }


}