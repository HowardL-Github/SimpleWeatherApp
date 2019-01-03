package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {  //从服务器获取全国省市县数据

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {  //调用sendOkHttpRequest()方法
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();  //传入请求地址
        client.newCall(request).enqueue(callback);  //注册回调处理服务器响应
    }

}
