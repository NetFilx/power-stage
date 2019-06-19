package com.wyh.power.stage.biz.taobao;

import com.wyh.power.stage.core.annotation.BizIdentity;
import com.wyh.power.stage.platform.promotion.PromotionExtension;

/**
 * @author lianzhao
 * @version 1.0
 * @date 2019/6/19
 */
@BizIdentity("taobao")
public class TaobaoPromotionExtensionImpl implements PromotionExtension {
    @Override
    public Long getDiscount() {
        return 10L;
    }
}
