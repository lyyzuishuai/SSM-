package com.neuedu.dao;

import com.neuedu.entity.EasybuyUserAddress;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

import java.util.ArrayList;

public interface EasybuyUserAddressMapper {
    @Delete({
            "delete from easybuy_user_address",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
            "insert into easybuy_user_address (id, userId, ",
            "address, createTime, ",
            "isDefault, remark)",
            "values (#{id,jdbcType=INTEGER}, #{userid,jdbcType=INTEGER}, ",
            "#{address,jdbcType=VARCHAR}, #{createtime,jdbcType=TIMESTAMP}, ",
            "#{isdefault,jdbcType=INTEGER}, #{remark,jdbcType=VARCHAR})"
    })
    int insert(EasybuyUserAddress record);

    @InsertProvider(type = EasybuyUserAddressSqlProvider.class, method = "insertSelective")
    int insertSelective(EasybuyUserAddress record);

    @Select({
            "select",
            "id, userId, address, createTime, isDefault, remark",
            "from easybuy_user_address",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "userId", property = "userid", jdbcType = JdbcType.INTEGER),
            @Result(column = "address", property = "address", jdbcType = JdbcType.VARCHAR),
            @Result(column = "createTime", property = "createtime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "isDefault", property = "isdefault", jdbcType = JdbcType.INTEGER),
            @Result(column = "remark", property = "remark", jdbcType = JdbcType.VARCHAR)
    })
    EasybuyUserAddress selectByPrimaryKey(Integer id);

    @Select({
            "select",
            "id, userId, address, createTime, isDefault, remark",
            "from easybuy_user_address",
            "where userId = #{uid,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "userId", property = "userid", jdbcType = JdbcType.INTEGER),
            @Result(column = "address", property = "address", jdbcType = JdbcType.VARCHAR),
            @Result(column = "createTime", property = "createtime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "isDefault", property = "isdefault", jdbcType = JdbcType.INTEGER),
            @Result(column = "remark", property = "remark", jdbcType = JdbcType.VARCHAR)
    })
    ArrayList<EasybuyUserAddress> selectByUserId(Integer uid);

    @UpdateProvider(type = EasybuyUserAddressSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(EasybuyUserAddress record);

    @Update({
            "update easybuy_user_address",
            "set userId = #{userid,jdbcType=INTEGER},",
            "address = #{address,jdbcType=VARCHAR},",
            "createTime = #{createtime,jdbcType=TIMESTAMP},",
            "isDefault = #{isdefault,jdbcType=INTEGER},",
            "remark = #{remark,jdbcType=VARCHAR}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(EasybuyUserAddress record);
}