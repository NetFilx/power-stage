package com.wyh.power.stage.biz.taobao;

import com.wyh.power.stage.core.annotation.BizIdentity;
import com.wyh.power.stage.platform.delivery.DeliveryExtension;

/**
 * @author lianzhao
 * @version 1.0
 * @date 2019/6/19
 */
@BizIdentity("taobao")
public class TaobaoDeliveryExtenionImpl implements DeliveryExtension {
    @Override
    public String getTransportMethod() {
        return "threeDayExpress";
    }

    @Override
    public String getReceiveMethod() {
        return "selfPick";
    }
}
