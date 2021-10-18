package com.automobile.twowheeler;
//1.
import com.automobile.Vehicle;

public class Hero extends Vehicle {
    @Override
    public String getmodelname(){
        return "Hero";
    }
    @Override
    public String getregistrationnumber() {
        return "20155";
    }

    @Override
    public String getownername() {
        return "lakhbir";
    }
    public int getspeed(){
        return 50;
    }
    public void radio(){
        System.out.println("Control radio device by using the digital radio interface");
    }
}
