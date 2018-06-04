package com.example.paramedics.myrxjava;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Taxi {

    @SerializedName("taxi")
    @Expose
    private List<Driver> drivers = null;

    @SerializedName("success")
    @Expose
    private int success;

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public Boolean isSuccess() {
        return (this.getDrivers().size() > 0);
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "drivers=" + drivers +
                ", success=" + success +
                '}';
    }
}