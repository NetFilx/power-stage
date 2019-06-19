package com.wyh.power.stage.core.annotation;

import java.lang.annotation.*;

/**
 * 表示这个是具体的那个业务的
 * @author lianzhao
 * @version 1.0
 * @date 2019/6/19
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface BizIdentity {
    String value() ;
}
