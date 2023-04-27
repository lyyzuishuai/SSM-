package com.neuedu.dao;

import com.neuedu.entity.EasybuyCategory;
import com.neuedu.entity.EasybuyProductCategory;
import com.neuedu.entity.Page;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.ArrayList;
import java.util.List;

public interface EasybuyCategoryMapper {
    @Delete({
            "delete from easybuy_product_category",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
            "insert into easybuy_product_category (id, name, ",
            "parentId, type, ",
            "iconClass)",
            "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
            "#{parentid,jdbcType=INTEGER}, #{type,jdbcType=INTEGER}, ",
            "#{iconclass,jdbcType=VARCHAR})"
    })
    int insert(EasybuyCategory record);

    @InsertProvider(type = EasybuyProductCategorySqlProvider.class, method = "insertSelective")
    int insertSelective(EasybuyProductCategory record);

    @Select({
            "select",
            "s.id, s.name, s.parentId, p.name parentName,s.type, s.iconClass",
            "from easybuy_product_category s  ",
            "left join easybuy_product_category p on s.parentId=p.id ",
            " where s.id = #{id,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "parentId", property = "parentid", jdbcType = JdbcType.INTEGER),
            @Result(column = "parentName", property = "parentName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "type", property = "type", jdbcType = JdbcType.INTEGER),
            @Result(column = "iconClass", property = "iconclass", jdbcType = JdbcType.VARCHAR)
    })
    EasybuyCategory selectByPrimaryKey(Integer id);

    @Select({
            "select",
            "s.id, s.name, s.parentId, p.name parentName,s.type, s.iconClass",
            "from easybuy_product_category s  ",
            "left join easybuy_product_category p on s.parentId=p.id "
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "parentId", property = "parentid", jdbcType = JdbcType.INTEGER),
            @Result(column = "parentName", property = "parentName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "type", property = "type", jdbcType = JdbcType.INTEGER),
            @Result(column = "iconClass", property = "iconclass", jdbcType = JdbcType.VARCHAR)
    })
    ArrayList<EasybuyCategory> selectByAll();


    @SelectProvider(type = EasybuyProductCategorySqlProvider.class, method = "selectByPage")
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "parentId", property = "parentid", jdbcType = JdbcType.INTEGER),
            @Result(column = "parentName", property = "parentName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "type", property = "type", jdbcType = JdbcType.INTEGER),
            @Result(column = "iconClass", property = "iconclass", jdbcType = JdbcType.VARCHAR)
    })
    ArrayList<EasybuyCategory> selectByPage(Page<EasybuyCategory> page);

    @UpdateProvider(type = EasybuyProductCategorySqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(EasybuyCategory record);

    @Update({
            "update easybuy_product_category",
            "set name = #{name,jdbcType=VARCHAR},",
            "parentId = #{parentid,jdbcType=INTEGER},",
            "type = #{type,jdbcType=INTEGER},",
            "iconClass = #{iconclass,jdbcType=VARCHAR}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(EasybuyCategory record);

    @Select({
            "select",
            "s.id, s.name, s.parentId, p.name parentName,s.type, s.iconClass",
            "from easybuy_product_category s  ",
            "left join easybuy_product_category p on s.parentId=p.id where p.NAME is not null"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "parentId", property = "parentid", jdbcType = JdbcType.INTEGER),
            @Result(column = "parentName", property = "parentName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "type", property = "type", jdbcType = JdbcType.INTEGER),
            @Result(column = "iconClass", property = "iconclass", jdbcType = JdbcType.VARCHAR)
    })
    ArrayList<EasybuyCategory> selectCategoryAll();
}