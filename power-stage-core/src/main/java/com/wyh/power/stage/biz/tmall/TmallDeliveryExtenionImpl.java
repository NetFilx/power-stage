package com.wyh.power.stage.biz.tmall;

import com.wyh.power.stage.core.annotation.BizIdentity;
import com.wyh.power.stage.platform.delivery.DeliveryExtension;

/**
 * @author lianzhao
 * @version 1.0
 * @date 2019/6/19
 */
@BizIdentity("tmall")
public class TmallDeliveryExtenionImpl implements DeliveryExtension {
    @Override
    public String getTransportMethod() {
        return "OneDayExpress";
    }

    @Override
    public String getReceiveMethod() {
        return "receiveAtHome";
    }
}
