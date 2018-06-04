package com.example.paramedics.myrxjava.MVP;

import com.example.paramedics.myrxjava.ApiInterface;
import com.example.paramedics.myrxjava.Utils;

public class Singleton {

    private static ApiInterface apiInterface = null;

    public static ApiInterface getApiInterface() {
        if (apiInterface == null){
            apiInterface = Utils.getApiInterface();
        }
        return apiInterface;
    }
}
