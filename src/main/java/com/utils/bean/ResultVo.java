package com.utils.bean;

/**
 * Created by 01 on 七月 06 0006 .
 */
public class ResultVo {
    private boolean result;
    private String msg;


    public ResultVo() {
        this.result = true;
        this.msg = "operation success";
    }

    public boolean isResult() {
        return result;
    }

    public ResultVo(boolean result, String msg) {
        this.result = result;
        this.msg = msg;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
