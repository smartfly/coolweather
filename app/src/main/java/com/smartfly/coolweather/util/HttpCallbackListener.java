package com.smartfly.coolweather.util;

/**
 * Created by public on 2016/4/18.
 */
public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
