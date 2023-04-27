package com.neuedu.dao;

import com.neuedu.entity.EasybuyOrder;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;

import java.util.ArrayList;
import java.util.List;

public interface EasybuyOrderMapper {
    @Delete({
        "delete from easybuy_order",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into easybuy_order (userId, ",
        "loginName, userAddress, ",
        "createTime, cost, serialNumber)",
        "values ( #{userid,jdbcType=INTEGER}, ",
        "#{loginname,jdbcType=VARCHAR}, #{useraddress,jdbcType=VARCHAR}, ",
        "now(), #{cost,jdbcType=REAL}, ",
        "#{serialnumber,jdbcType=VARCHAR})"
    })
    @Options(keyColumn = "id",keyProperty = "id" ,useGeneratedKeys = true)
    int insert(EasybuyOrder record);

    @InsertProvider(type=EasybuyOrderSqlProvider.class, method="insertSelective")
    int insertSelective(EasybuyOrder record);

    @Select({
        "select",
        "id, userId, loginName, userAddress, createTime, cost, serialNumber",
        "from easybuy_order",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="userId", property="userid", jdbcType=JdbcType.INTEGER),
        @Result(column="loginName", property="loginname", jdbcType=JdbcType.VARCHAR),
        @Result(column="userAddress", property="useraddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="createTime", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="cost", property="cost", jdbcType=JdbcType.REAL),
        @Result(column="serialNumber", property="serialnumber", jdbcType=JdbcType.VARCHAR)
    })
    EasybuyOrder selectByPrimaryKey(Integer id);



    @Select({
            "select",
            "id, userId, loginName, userAddress, createTime,cost, serialNumber",
            "from easybuy_order ",
            "where userId = #{uid,jdbcType=INTEGER}"
    })
    @Results({
            @Result(id = true,column="id", property="id", jdbcType=JdbcType.INTEGER),
            @Result(column="userId", property="userid", jdbcType=JdbcType.INTEGER),
            @Result(column="loginName", property="loginname", jdbcType=JdbcType.VARCHAR),
            @Result(column="userAddress", property="useraddress", jdbcType=JdbcType.VARCHAR),
            @Result(column="createTime", property="createtime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="cost", property="cost", jdbcType=JdbcType.FLOAT),
            @Result(column="serialNumber", property="serialnumber", jdbcType=JdbcType.VARCHAR),
            @Result(property = "details",column = "id",javaType = List.class,
                    many = @Many(select = "com.neuedu.dao.EasybuyOrderDetailMapper.selectByOid"))
    })
    ArrayList<EasybuyOrder> selectByUId(Integer uid);


    @UpdateProvider(type=EasybuyOrderSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(EasybuyOrder record);



    @Update({
        "update easybuy_order",
        "set userId = #{userid,jdbcType=INTEGER},",
          "loginName = #{loginname,jdbcType=VARCHAR},",
          "userAddress = #{useraddress,jdbcType=VARCHAR},",
          "createTime = #{createtime,jdbcType=TIMESTAMP},",
          "cost = #{cost,jdbcType=REAL},",
          "serialNumber = #{serialnumber,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(EasybuyOrder record);
}