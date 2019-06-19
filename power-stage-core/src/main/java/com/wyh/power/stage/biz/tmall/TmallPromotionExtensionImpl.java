package com.wyh.power.stage.biz.tmall;

import com.wyh.power.stage.core.annotation.BizIdentity;
import com.wyh.power.stage.platform.promotion.PromotionExtension;

/**
 * @author lianzhao
 * @version 1.0
 * @date 2019/6/19
 */
@BizIdentity("tmall")
public class TmallPromotionExtensionImpl implements PromotionExtension {
    @Override
    public Long getDiscount() {
        return 20L;
    }
}
