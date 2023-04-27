package com.neuedu.dao;

import com.neuedu.entity.EasybuyProductCategory;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface EasybuyProductCategoryMapper {
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
    int insert(EasybuyProductCategory record);

    @InsertProvider(type=EasybuyProductCategorySqlProvider.class, method="insertSelective")
    int insertSelective(EasybuyProductCategory record);

    @Select({
        "select",
        "id, name, parentId, type, iconClass",
        "from easybuy_product_category",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="parentId", property="parentid", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="iconClass", property="iconclass", jdbcType=JdbcType.VARCHAR)
    })
    EasybuyProductCategory selectByPrimaryKey(Integer id);

    @UpdateProvider(type=EasybuyProductCategorySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(EasybuyProductCategory record);

    @Update({
        "update easybuy_product_category",
        "set name = #{name,jdbcType=VARCHAR},",
          "parentId = #{parentid,jdbcType=INTEGER},",
          "type = #{type,jdbcType=INTEGER},",
          "iconClass = #{iconclass,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(EasybuyProductCategory record);
}