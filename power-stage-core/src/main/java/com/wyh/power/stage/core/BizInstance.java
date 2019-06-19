package com.wyh.power.stage.core;

/**
 * 业务实体的抽象父类
 * @author lianzhao
 * @version 1.0
 * @date 2019/6/19
 */
public abstract class BizInstance {

    /**
     * 业务身份
     */
    private String bizCode;

    public String getBizCode() {
        return bizCode;
    }

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }
}
