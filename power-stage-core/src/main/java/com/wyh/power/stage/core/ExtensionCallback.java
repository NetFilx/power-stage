package com.wyh.power.stage.core;

/**
 * 扩展点回调
 *
 * @author lianzhao
 * @version 1.0
 * @date 2019/6/19
 */
public interface ExtensionCallback<Ext, R> {

    R apply(Ext ext);

}
