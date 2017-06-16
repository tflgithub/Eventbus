package com.cn.tfl.happinesseventbus;

/**
 * Created by Happiness on 2017/3/23.
 */
public class EventBusException extends RuntimeException {

    public EventBusException(String detailMessage) {
        super(detailMessage);
    }
}
