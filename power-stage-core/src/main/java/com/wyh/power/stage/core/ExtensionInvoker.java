package com.wyh.power.stage.core;

/**
 * 扩展点的具体执行器
 *
 * @author lianzhao
 * @version 1.0
 * @date 2019/6/19
 */
public class ExtensionInvoker<Ext> {

    /**
     * 扩展点的class
     */
    private Class<Ext> extClass;


    public ExtensionInvoker(Class<Ext> extClass) {
        this.extClass = extClass;
    }

    /**
     * 执行扩展点
     *
     * @param <T>
     * @param <R>
     * @return
     */
    public <T extends BizInstance, R> R execute(T item, ExtensionCallback<Ext, R> callback) {
        String bizCode = item.getBizCode();
        Ext ext = ExtensionPointManager
                .getInstance()
                .getExt(this.extClass, bizCode);
        return callback.apply(ext);
    }

}
