package com.controller;

import com.alibaba.fastjson.JSONArray;
import com.db.model.Nutritioninfo;
import com.tcms.service.NutritionService;
import com.utils.JsonUtil;
import com.utils.ResponseUtil;
import com.utils.bean.ResultVo;
import org.apache.commons.io.IOExceptionWithCause;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by 01 on 七月 05 0005 .
 */
@Controller
@RequestMapping("/platform/sys/nutrition/*")
public class NutritionController {

    @Resource
    private NutritionService nutritionService;

    //Log logger = LogFactory.getLog(this.getClass());
    private static Logger logger = LoggerFactory.getLogger(NutritionController.class);


    @RequestMapping(value="/queryNutList")
    public void queryNutList(Integer pageSize, Integer pageNumber, String searchText, HttpServletRequest req,
                             HttpServletResponse resp) throws IOException {
        logger.info("request begin,url is : /platform/sys/nutrition/queryNutList...");
        if(null != searchText){
            try{
                searchText = new String(searchText.getBytes("ISO-8859-1"), "UTF-8");
            }catch(Exception e){
                e.printStackTrace();
                logger.error("encoding searchText error...");
            }
        }
        int total = nutritionService.queryNuCount();
        Integer limit = pageSize;
        Integer pageStart = (pageNumber-1)*limit;
        List<Nutritioninfo> nuList = nutritionService.queryNutByPage(pageStart,limit);
        String jsonStr = JSONArray.toJSONString(nuList);
        String json = "{\"total\":" + total + ",\"rows\":" + jsonStr + "}";
        resp.setContentType("text/json; charset=UTF-8");
        resp.getWriter().print(json);
    }

    @RequestMapping(value= "/insertNutList", produces="text/json;charset=UTF-8")
    public void insertNut(Nutritioninfo nutritioninfo, HttpServletResponse response) throws Exception{
        ResultVo resultVo = new ResultVo();
        try {
            nutritionService.insertNutrition(nutritioninfo);
        }catch (Exception e){
            logger.error("request insertNutList occoured error:error message is :"+e.getMessage());
            resultVo = new ResultVo(false,"operation failure");
            throw e;
        }finally {
            ResponseUtil.outJson(JsonUtil.toJson(resultVo), response);
        }
    }

    @RequestMapping(value = "/delNutri" , produces = "text/json;chartset=UTF-8")
    public void delNut(String id,HttpServletResponse response) throws Exception{
        ResultVo resultVo = new ResultVo();
        try {
            nutritionService.deleteNutrition(id);
        }catch (Exception e){
            logger.error("request delNutri occoured error:error message is :"+ e.getMessage());
            resultVo = new ResultVo(false,"operation failure");
            throw e;
        }finally {
            ResponseUtil.outJson(JsonUtil.toJson(resultVo),response);
        }
    }

    @RequestMapping(value = "/updateNutri" , produces = "text/json;chartset=UTF-8")
    public void updateNutri(Nutritioninfo nutritioninfo,HttpServletResponse response) throws Exception{
        ResultVo resultVo = new ResultVo();
        try {
            nutritionService.updateNutrition(nutritioninfo);
        }catch (Exception e){
            logger.error("request updateNutri occoured error:error message is :"+ e.getMessage());
        }finally {
            ResponseUtil.outJson(JsonUtil.toJson(resultVo),response);
        }
    }
}
