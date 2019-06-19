package com.wyh.power.stage.core;

import com.wyh.power.stage.core.annotation.BizIdentity;
import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 扩展点管理器
 *
 * @author lianzhao
 * @version 1.0
 * @date 2019/6/19
 */
public class ExtensionPointManager {

    private static final ExtensionPointManager INSTANCE = new ExtensionPointManager();

    /**
     * 存放扩展点及其映射
     * 扩展点class -> (扩展点code, 具体的扩展点实现类)
     */
    private Map<Class, Map<String, Class>> extMap = new ConcurrentHashMap<>();

    /**
     * singleton
     */
    private ExtensionPointManager() {
    }

    public static ExtensionPointManager getInstance() {
        return INSTANCE;
    }

    /**
     * 扫描扩展点注解以及接口
     */
    public void scan() {

        Reflections extPointReflections = new Reflections("com.wyh.power.stage.platform");
        Reflections bizIdentityReflections = new Reflections("com.wyh.power.stage.biz");
        Set<Class<? extends ExtensionPoint>> extPointClass = extPointReflections.getSubTypesOf(ExtensionPoint.class);
        Set<Class<?>> bizIdentityClass = bizIdentityReflections.getTypesAnnotatedWith(BizIdentity.class);
        for (Class<?> c : extPointClass) {
            Map<String, Class> map = new HashMap<>();
            for (Class<?> id : bizIdentityClass) {
                if (c.isAssignableFrom(id)) {
                    BizIdentity[] identities = id.getAnnotationsByType(BizIdentity.class);
                    if (identities != null && identities.length > 0) {
                        BizIdentity identity = identities[0];
                        map.put(identity.value(), id);
                    }
                }
            }
            extMap.put(c, map);
        }
    }

    /**
     * 根据扩展点类型以及业务身份获取扩展点实例
     *
     * @param extClass
     * @param bizId
     * @param <Ext>
     * @return
     */
    public <Ext> Ext getExt(Class<Ext> extClass, String bizId) {
        try {
            return (Ext) extMap.get(extClass).get(bizId).newInstance();
        } catch (Exception e) {

        }
        return null;
    }

}
