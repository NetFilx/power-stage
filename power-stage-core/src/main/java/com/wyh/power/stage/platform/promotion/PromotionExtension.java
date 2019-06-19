package com.wyh.power.stage.platform.promotion;

import com.wyh.power.stage.core.ExtensionPoint;

/**
 * 促销的扩展点
 * @author lianzhao
 * @version 1.0
 * @date 2019/6/19
 */
public interface PromotionExtension extends ExtensionPoint {

    Long getDiscount();

}
