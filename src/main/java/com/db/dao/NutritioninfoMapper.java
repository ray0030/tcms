package com.db.dao;

import com.db.model.Nutritioninfo;
import com.db.model.NutritioninfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NutritioninfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nutritioninfo
     *
     * @mbggenerated
     */
    int countByExample(NutritioninfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nutritioninfo
     *
     * @mbggenerated
     */
    int deleteByExample(NutritioninfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nutritioninfo
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nutritioninfo
     *
     * @mbggenerated
     */
    int insert(Nutritioninfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nutritioninfo
     *
     * @mbggenerated
     */
    int insertSelective(Nutritioninfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nutritioninfo
     *
     * @mbggenerated
     */
    List<Nutritioninfo> selectByExample(NutritioninfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nutritioninfo
     *
     * @mbggenerated
     */
    Nutritioninfo selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nutritioninfo
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Nutritioninfo record, @Param("example") NutritioninfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nutritioninfo
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Nutritioninfo record, @Param("example") NutritioninfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nutritioninfo
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Nutritioninfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nutritioninfo
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Nutritioninfo record);

    List<Nutritioninfo> selectByPage(Integer pageStart,Integer limit);

    int selectCount();
}