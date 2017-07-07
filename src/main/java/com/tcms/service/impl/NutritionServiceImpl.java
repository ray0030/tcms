package com.tcms.service.impl;

import com.db.dao.NutritioninfoMapper;
import com.db.model.Nutritioninfo;
import com.db.model.NutritioninfoExample;
import com.tcms.service.NutritionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 01 on 七月 05 0005 .
 */
@Service("nutritionService")
public class NutritionServiceImpl implements NutritionService{

    @Resource
    NutritioninfoMapper nutritioninfoMapper;

    public int queryNutCountByText(String searchText) {
        NutritioninfoExample nutritioninfoExample = new NutritioninfoExample();
        nutritioninfoExample.or().andIdLike(searchText).andNameLike(searchText).andNrvvalueLike(searchText)
                .andMeasurementLike(searchText).andRoundingLike(searchText).andContrastmarkLike(searchText)
                .andCriticalvalueLike(searchText).andEnergyrateLike(searchText);
        return nutritioninfoMapper.selectByExample(nutritioninfoExample).size();
        //return 0;
    }

    public List<Nutritioninfo> queryNutList(Integer pageSize, Integer pageNumber, String searchText) {
        NutritioninfoExample nutritioninfoExample = new NutritioninfoExample();
        nutritioninfoExample.or().andIdLike(searchText).andNameLike(searchText).andNrvvalueLike(searchText)
                .andMeasurementLike(searchText).andRoundingLike(searchText).andContrastmarkLike(searchText)
                .andCriticalvalueLike(searchText).andEnergyrateLike(searchText);
        //return nutritioninfoMapper.selectByExample(nutritioninfoExample);
        return nutritioninfoMapper.selectByExample(nutritioninfoExample);
        //return null;
    }

    public List<Nutritioninfo> queryNutByPage(int pageStart,int limit){
        return nutritioninfoMapper.selectByPage(pageStart,limit);
    }

    public int queryNuCount(){
        return nutritioninfoMapper.selectCount();
    }

    public Boolean insertNutrition(Nutritioninfo nutritioninfo) {
        int recordNum = nutritioninfoMapper.insert(nutritioninfo);
        if( recordNum != 1 ){
            return false;
        }else{
            return true;
        }
    }

    public Boolean deleteNutrition(String id) {
        int recordNum = nutritioninfoMapper.deleteByPrimaryKey(id);
        if(recordNum != 1){
            return false;
        }else {
            return true;
        }
    }

    public Boolean updateNutrition(Nutritioninfo nutritioninfo) {
        NutritioninfoExample nutritioninfoExample = new NutritioninfoExample();
        nutritioninfoExample.or().andIdEqualTo(nutritioninfo.getId());
        int recordNum = nutritioninfoMapper.updateByExampleSelective(nutritioninfo,nutritioninfoExample);
        if(recordNum != 1){
            return false;
        }
        return true;
    }

}
