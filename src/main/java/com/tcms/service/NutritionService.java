package com.tcms.service;

import com.db.model.Nutritioninfo;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.List;

/**
 * Created by 01 on 七月 05 0005 .
 */
public interface NutritionService {
    int queryNutCountByText(String searchText);

    List<Nutritioninfo> queryNutList(Integer pageSize,Integer pageNumber,String searchText);

    List<Nutritioninfo> queryNutByPage(int pageStart,int limit);

    int queryNuCount();

    Boolean insertNutrition(Nutritioninfo nutritioninfo);

    Boolean deleteNutrition(String id);

    Boolean updateNutrition(Nutritioninfo nutritioninfo);

}
