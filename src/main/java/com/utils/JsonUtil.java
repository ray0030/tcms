package com.utils;

import com.alibaba.fastjson.JSON;

/**
 * Created by 01 on 七月 05 0005 .
 */
public class JsonUtil {
    public static String toJson(Object object){
        return JSON.toJSONString(object);
    }
}
