package com.neuedu.dao;

import com.neuedu.entity.EasybuyNews;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface EasybuyNewsMapper {
    @Delete({
            "delete from easybuy_news",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
            "insert into easybuy_news (id, title, ",
            "content, createTime)",
            "values (#{id,jdbcType=INTEGER}, #{title,jdbcType=VARCHAR}, ",
            "#{content,jdbcType=VARCHAR}, #{createtime,jdbcType=VARCHAR})"
    })
    int insert(EasybuyNews record);

    @InsertProvider(type = EasybuyNewsSqlProvider.class, method = "insertSelective")
    int insertSelective(EasybuyNews record);

    @Select({
            "select",
            "id, title, content, createTime",
            "from easybuy_news",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "title", property = "title", jdbcType = JdbcType.VARCHAR),
            @Result(column = "content", property = "content", jdbcType = JdbcType.VARCHAR),
            @Result(column = "createTime", property = "createtime", jdbcType = JdbcType.VARCHAR)
    })
    EasybuyNews selectByPrimaryKey(Integer id);

    @UpdateProvider(type = EasybuyNewsSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(EasybuyNews record);

    @Update({
            "update easybuy_news",
            "set title = #{title,jdbcType=VARCHAR},",
            "content = #{content,jdbcType=VARCHAR},",
            "createTime = #{createtime,jdbcType=VARCHAR}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(EasybuyNews record);
}