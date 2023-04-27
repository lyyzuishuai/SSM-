package com.neuedu.dao;

import com.neuedu.entity.EasybuyUser;
import com.neuedu.entity.Page;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface EasybuyUserMapper {
    @Delete({
            "delete from easybuy_user",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
            "insert into easybuy_user (loginName, ",
            "userName, password, ",
            "sex, identityCode, ",
            "email, mobile, type)",
            "values (#{id,jdbcType=INTEGER}, #{loginname,jdbcType=VARCHAR}, ",
            "#{username,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
            "#{sex,jdbcType=INTEGER}, #{identitycode,jdbcType=VARCHAR}, ",
            "#{email,jdbcType=VARCHAR}, #{mobile,jdbcType=VARCHAR}, #{type,jdbcType=INTEGER})"
    })
    int insert(EasybuyUser record);

    @InsertProvider(type = EasybuyUserSqlProvider.class, method = "insertSelective")
    int insertSelective(EasybuyUser record);

    @Select({
            "select",
            "id, loginName, userName, password, sex, identityCode, email, mobile, type",
            "from easybuy_user",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "loginName", property = "loginname", jdbcType = JdbcType.VARCHAR),
            @Result(column = "userName", property = "username", jdbcType = JdbcType.VARCHAR),
            @Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
            @Result(column = "sex", property = "sex", jdbcType = JdbcType.INTEGER),
            @Result(column = "identityCode", property = "identitycode", jdbcType = JdbcType.VARCHAR),
            @Result(column = "email", property = "email", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mobile", property = "mobile", jdbcType = JdbcType.VARCHAR),
            @Result(column = "type", property = "type", jdbcType = JdbcType.INTEGER)
    })
    EasybuyUser selectByPrimaryKey(Integer id);

    @Select({
            "select",
            "id, loginName, userName, sex, identityCode, email, mobile, type",
            " from easybuy_user ",
            " where loginName=#{uname,jdbcType=VARCHAR} and password=#{pwd,jdbcType=VARCHAR} ",
            " and type=1"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "loginName", property = "loginname", jdbcType = JdbcType.VARCHAR),
            @Result(column = "userName", property = "username", jdbcType = JdbcType.VARCHAR),
            @Result(column = "sex", property = "sex", jdbcType = JdbcType.INTEGER),
            @Result(column = "identityCode", property = "identitycode", jdbcType = JdbcType.VARCHAR),
            @Result(column = "email", property = "email", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mobile", property = "mobile", jdbcType = JdbcType.VARCHAR),
            @Result(column = "type", property = "type", jdbcType = JdbcType.INTEGER)
    })
    EasybuyUser selectByAdmin(@Param("uname") String uname, @Param("pwd") String pwd);

    @Select({
            "select",
            "id, loginName, userName, sex, identityCode, email, mobile, type",
            "from easybuy_user ",
            "where loginName=#{uname,jdbcType=VARCHAR} and password=#{pwd,jdbcType=VARCHAR} ",
            "and type=0"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "loginName", property = "loginname", jdbcType = JdbcType.VARCHAR),
            @Result(column = "userName", property = "username", jdbcType = JdbcType.VARCHAR),
            @Result(column = "sex", property = "sex", jdbcType = JdbcType.INTEGER),
            @Result(column = "identityCode", property = "identitycode", jdbcType = JdbcType.VARCHAR),
            @Result(column = "email", property = "email", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mobile", property = "mobile", jdbcType = JdbcType.VARCHAR),
            @Result(column = "type", property = "type", jdbcType = JdbcType.INTEGER)
    })
    EasybuyUser selectByUser(@Param("uname") String uname, @Param("pwd") String pwd);

    @Select("<script>"
            +"select"
            +" id, loginName, userName, sex, identityCode, email, mobile, type"
            +" from easybuy_user "
            +"<if test='key !=null'>"
            +"where loginName like concat('%',#{key},'%') "
            +"</if>"
            +"</script>"
    )
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "loginName", property = "loginname", jdbcType = JdbcType.VARCHAR),
            @Result(column = "userName", property = "username", jdbcType = JdbcType.VARCHAR),
            @Result(column = "sex", property = "sex", jdbcType = JdbcType.INTEGER),
            @Result(column = "identityCode", property = "identitycode", jdbcType = JdbcType.VARCHAR),
            @Result(column = "email", property = "email", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mobile", property = "mobile", jdbcType = JdbcType.VARCHAR),
            @Result(column = "type", property = "type", jdbcType = JdbcType.INTEGER)
    })
    List<EasybuyUser> selectByPage(Page<EasybuyUser> page);


    @UpdateProvider(type = EasybuyUserSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(EasybuyUser record);

    @Update({
            "update easybuy_user",
            "set loginName = #{loginname,jdbcType=VARCHAR},",
            "userName = #{username,jdbcType=VARCHAR},",
            "password = #{password,jdbcType=VARCHAR},",
            "sex = #{sex,jdbcType=INTEGER},",
            "identityCode = #{identitycode,jdbcType=VARCHAR},",
            "email = #{email,jdbcType=VARCHAR},",
            "mobile = #{mobile,jdbcType=VARCHAR},",
            "type = #{type,jdbcType=INTEGER}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(EasybuyUser record);

    void selectUserAll();
}