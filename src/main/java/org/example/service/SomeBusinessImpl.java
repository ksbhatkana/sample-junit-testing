package org.example.service;


import org.example.dao.SomeDao;

public class SomeBusinessImpl {
    private SomeDao someDao;

    public SomeBusinessImpl(SomeDao someDao) {
        this.someDao = someDao;
    }

    public int findTheGreatestFromAllData() {
        int[] data = someDao.retrieveAllData();
        int greatestValue = Integer.MIN_VALUE;

        for(int value:data) {
            if(value > greatestValue) {
                greatestValue = value;
            }
        }
        return greatestValue;
    }
}

