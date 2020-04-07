package dev.sanggi.mask.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import lombok.Data;

@Data
public class StoresResponse {
    private int count;
    private int page;
    private ArrayList<Store> stores;

    @Data
    public class Store {

        @SerializedName("addr")
        private String adress;
        private String code;
        private double lng;
        private double lat;
        @SerializedName("remain_stat")
        private String remainStat;
        @SerializedName("stock_at")
        private String stockAt;
        private String name;
        private String type;
    }
}
