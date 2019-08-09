package com.rohitlearns.mysql;

public class Conversion {

    public double tempConv(double temp, String unit) {
        return unit.equals("F")?((temp - 32)*(5.0/9.0)):((temp * (9.0/5.0)) + 32);
    }
}
