package com.example.paramedics.myrxjava;

public class Utils {

    public static final String url = "http://10.0.2.2/";

    public static ApiInterface getApiInterface() {
        return RetrofitClient.getClient(url).create(ApiInterface.class);
    }
}
