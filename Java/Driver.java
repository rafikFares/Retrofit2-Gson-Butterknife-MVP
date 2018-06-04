package com.example.paramedics.myrxjava;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Driver {

    @SerializedName("tid")
    @Expose
    private int tid;
    @SerializedName("valide")
    @Expose
    private int valide;
    @SerializedName("code")
    @Expose
    private int code;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("pass")
    @Expose
    private String pass;
    @SerializedName("tel")
    @Expose
    private String tel;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("statut")
    @Expose
    private String statut;
    @SerializedName("updating")
    @Expose
    private String updating;
    @SerializedName("created_at")
    @Expose
    private String createdAt;


    public Driver() {
    }

    public Driver(int tid, int valide, int code, String name, String tel, String city, String longitude, String latitude, String statut, String updating, String createdAt) {
        this.tid = tid;
        this.valide = valide;
        this.code = code;
        this.name = name;
        this.tel = tel;
        this.city = city;
        this.longitude = longitude;
        this.latitude = latitude;
        this.statut = statut;
        this.updating = updating;
        this.createdAt = createdAt;
    }

    public Driver(String name, String tel, int code, String pass) {
        this.code = code;
        this.name = name;
        this.tel = tel;
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public int getValide() {
        return valide;
    }

    public void setValide(int valide) {
        this.valide = valide;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getUpdating() {
        return updating;
    }

    public void setUpdating(String updating) {
        this.updating = updating;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "tid=" + tid +
                ", valide=" + valide +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                ", tel='" + tel + '\'' +
                ", city='" + city + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", statut='" + statut + '\'' +
                ", updating='" + updating + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}
