package com.wyh.power.stage.platform.delivery;

import com.wyh.power.stage.core.ExtensionPoint;

/**
 * 配送的扩展点
 *
 * @author lianzhao
 * @version 1.0
 * @date 2019/6/19
 */
public interface DeliveryExtension extends ExtensionPoint {

    String getTransportMethod();

    String getReceiveMethod();

}
