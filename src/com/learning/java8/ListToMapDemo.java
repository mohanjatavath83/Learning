package com.learning.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMapDemo {


    public static void main(String[] args) {


        List<BuyerModel> buyers = Arrays.asList(new BuyerModel("1", "mohan"), new BuyerModel("2", "ramesh"));

        Map<String, BuyerModel> buyersMap = buyers.stream().collect(Collectors.toMap(BuyerModel::getUid, Function.identity()));
        System.out.println(buyersMap.size());
        System.out.println(buyersMap.get("1").getName());

    }


    static class BuyerModel {
        private String uid;
        private String name;

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public BuyerModel(String uid, String name) {
            this.name = name;
            this.uid = uid;
        }
    }
}
