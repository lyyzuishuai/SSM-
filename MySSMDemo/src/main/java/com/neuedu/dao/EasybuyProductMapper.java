package com.neuedu.dao;

import com.neuedu.entity.EasybuyProduct;
import com.neuedu.entity.Page;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.ArrayList;
import java.util.List;

public interface EasybuyProductMapper {
    @Delete({
            "delete from easybuy_product",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
            "insert into easybuy_product (name, ",
            "description, price, ",
            "stock, categoryLevel1Id, ",
            "categoryLevel2Id, categoryLevel3Id, ",
            "fileName, isDelete)",
            "values (#{name,jdbcType=VARCHAR}, ",
            "#{description,jdbcType=VARCHAR}, #{price,jdbcType=REAL}, ",
            "#{stock,jdbcType=INTEGER}, #{categorylevel1id,jdbcType=INTEGER}, ",
            "#{categorylevel2id,jdbcType=INTEGER}, #{categorylevel3id,jdbcType=INTEGER}, ",
            "#{filename,jdbcType=VARCHAR},0)"
    })
    int insert(EasybuyProduct record);

    @InsertProvider(type = EasybuyProductSqlProvider.class, method = "insertSelective")
    int insertSelective(EasybuyProduct record);

    @Select({
            "select",
            "id, name, description, price, stock, categoryLevel1Id, categoryLevel2Id, categoryLevel3Id, ",
            "fileName, isDelete",
            "from easybuy_product",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "description", property = "description", jdbcType = JdbcType.VARCHAR),
            @Result(column = "price", property = "price", jdbcType = JdbcType.REAL),
            @Result(column = "stock", property = "stock", jdbcType = JdbcType.INTEGER),
            @Result(column = "categoryLevel1Id", property = "categorylevel1id", jdbcType = JdbcType.INTEGER),
            @Result(column = "categoryLevel2Id", property = "categorylevel2id", jdbcType = JdbcType.INTEGER),
            @Result(column = "categoryLevel3Id", property = "categorylevel3id", jdbcType = JdbcType.INTEGER),
            @Result(column = "fileName", property = "filename", jdbcType = JdbcType.VARCHAR),
            @Result(column = "isDelete", property = "isdelete", jdbcType = JdbcType.INTEGER)
    })
    EasybuyProduct selectByPrimaryKey(Integer id);


    @Select("<script>"
            +"select"
            +" id,name, description, price, stock, categoryLevel1Id, categoryLevel2Id,categoryLevel3Id, "
            +"fileName, isDelete"
            +" from easybuy_product"
            +" where isDelete=0"
            +"<if test='key !=null'>"
            +"and name = #{key}"
            +"</if>"
            +"</script>"
    )
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "description", property = "description", jdbcType = JdbcType.VARCHAR),
            @Result(column = "price", property = "price", jdbcType = JdbcType.REAL),
            @Result(column = "stock", property = "stock", jdbcType = JdbcType.INTEGER),
            @Result(column = "categoryLevel1Id", property = "categorylevel1id", jdbcType = JdbcType.INTEGER),
            @Result(column = "categoryLevel2Id", property = "categorylevel2id", jdbcType = JdbcType.INTEGER),
            @Result(column = "categoryLevel3Id", property = "categorylevel3id", jdbcType = JdbcType.INTEGER),
            @Result(column = "fileName", property = "filename", jdbcType = JdbcType.VARCHAR),
            @Result(column = "isDelete", property = "isdelete", jdbcType = JdbcType.INTEGER)
    })
    ArrayList<EasybuyProduct> selectByPage(Page<EasybuyProduct> page);

    @UpdateProvider(type = EasybuyProductSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(EasybuyProduct record);

    @Select("<script>select id, name, description, price, stock, categoryLevel1Id, categoryLevel2Id, categoryLevel3Id,fileName " +
            " from easybuy_product " +
            " where isDelete = 0 and id in " +
            "<foreach item='pid' index='index' collection='pids' open='(' separator=',' close=')'>#{pid}" +
            "</foreach>" +
            "</script>")
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "description", property = "description", jdbcType = JdbcType.VARCHAR),
            @Result(column = "price", property = "price", jdbcType = JdbcType.REAL),
            @Result(column = "stock", property = "stock", jdbcType = JdbcType.INTEGER),
            @Result(column = "categoryLevel1Id", property = "categorylevel1id", jdbcType = JdbcType.INTEGER),
            @Result(column = "categoryLevel2Id", property = "categorylevel2id", jdbcType = JdbcType.INTEGER),
            @Result(column = "categoryLevel3Id", property = "categorylevel3id", jdbcType = JdbcType.INTEGER),
            @Result(column = "fileName", property = "filename", jdbcType = JdbcType.VARCHAR),
            @Result(column = "isDelete", property = "isdelete", jdbcType = JdbcType.INTEGER)
    })
    ArrayList<EasybuyProduct> selectByIds(@Param("pids") List<String> pids);

    @Update({
            "update easybuy_product",
            "set name = #{name,jdbcType=VARCHAR},",
            "description = #{description,jdbcType=VARCHAR},",
            "price = #{price,jdbcType=REAL},",
            "stock = #{stock,jdbcType=INTEGER},",
            "categoryLevel1Id = #{categorylevel1id,jdbcType=INTEGER},",
            "categoryLevel2Id = #{categorylevel2id,jdbcType=INTEGER},",
            "categoryLevel3Id = #{categorylevel3id,jdbcType=INTEGER},",
            "fileName = #{filename,jdbcType=VARCHAR},",
            "isDelete = #{isdelete,jdbcType=INTEGER}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(EasybuyProduct record);

    @Select({
            "select",
            "id, name, description, price, stock, categoryLevel1Id, categoryLevel2Id, categoryLevel3Id, ",
            "fileName, isDelete",
            "from easybuy_product",
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "description", property = "description", jdbcType = JdbcType.VARCHAR),
            @Result(column = "price", property = "price", jdbcType = JdbcType.REAL),
            @Result(column = "stock", property = "stock", jdbcType = JdbcType.INTEGER),
            @Result(column = "categoryLevel1Id", property = "categorylevel1id", jdbcType = JdbcType.INTEGER),
            @Result(column = "categoryLevel2Id", property = "categorylevel2id", jdbcType = JdbcType.INTEGER),
            @Result(column = "categoryLevel3Id", property = "categorylevel3id", jdbcType = JdbcType.INTEGER),
            @Result(column = "fileName", property = "filename", jdbcType = JdbcType.VARCHAR),
            @Result(column = "isDelete", property = "isdelete", jdbcType = JdbcType.INTEGER)
    })
    List<EasybuyProduct> selectByAll();
}