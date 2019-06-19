package com.wyh.power.stage.start;

import com.wyh.power.stage.core.ExtensionInvoker;
import com.wyh.power.stage.core.ExtensionPointManager;
import com.wyh.power.stage.platform.delivery.DeliveryExtension;
import com.wyh.power.stage.platform.delivery.DeliveryItem;
import com.wyh.power.stage.platform.promotion.PromotionExtension;
import com.wyh.power.stage.platform.promotion.PromotionItem;

/**
 * @author lianzhao
 * @version 1.0
 * @date 2019/6/19
 */
public class Main {

    public static void main(String[] args) {
        ExtensionPointManager.getInstance().scan();

        ExtensionInvoker<DeliveryExtension> deliveryInvoker = new ExtensionInvoker<>(DeliveryExtension.class);
        DeliveryItem deliveryItem = new DeliveryItem();
        deliveryItem.setBizCode("taobao");
        String transportMethod = deliveryInvoker.execute(deliveryItem, DeliveryExtension::getTransportMethod);
        String receiveMethod = deliveryInvoker.execute(deliveryItem, DeliveryExtension::getReceiveMethod);
        System.out.println("transport method:    " + transportMethod);
        System.out.println("receive method:    " + receiveMethod);
        System.out.println("------------------------");

        ExtensionInvoker<PromotionExtension> promotionInvoker = new ExtensionInvoker<>(PromotionExtension.class);
        PromotionItem promotionItem = new PromotionItem();
        promotionItem.setBizCode("tmall");
        Long discount = promotionInvoker.execute(promotionItem, PromotionExtension::getDiscount);
        System.out.println("discount:      " + discount);

    }

}
