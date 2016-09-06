package com.example.nezar.firefightapp2;

/**
 * Created by Nezar Saleh on 4/3/2016.
 */
public class DataModel {
    private String sensor1;
    private String sensor2;
    private String sensor3;

    public DataModel(String sensor1, String sensor2, String sensor3) {
        this.sensor1 = sensor1;
        this.sensor2 = sensor2;
        this.sensor3 = sensor3;
    }

    public DataModel() {
    }

    public String getSensor3() {
        return sensor3;
    }

    public void setSensor3(String sensor3) {
        this.sensor3 = sensor3;
    }

    public String getSensor2() {
        return sensor2;
    }

    public void setSensor2(String sensor2) {
        this.sensor2 = sensor2;
    }

    public String getSensor1() {
        return sensor1;
    }

    public void setSensor1(String sensor1) {
        this.sensor1 = sensor1;
    }

}
