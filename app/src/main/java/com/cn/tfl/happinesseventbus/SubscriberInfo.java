package com.cn.tfl.happinesseventbus;

/**
 * Created by Administrator on 2017/3/27.
 */
public interface SubscriberInfo {

    Class<?> getSubscriberClass();

    SubscriberMethod[] getSubscriberMethods();

    SubscriberInfo getSuperSubscriberInfo();

    boolean shouldCheckSuperclass();
}
