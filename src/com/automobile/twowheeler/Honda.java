package com.automobile.twowheeler;
//1.
import com.automobile.Vehicle;

public class Honda extends Vehicle {
    @Override
    public String getmodelname() {
        return "Honda";
    }
    @Override
    public String getregistrationnumber() {
        return "21345";
    }
    @Override
    public String getownername() {
        return "Joginder";
    }
    public int getspeed(){
        return 90;
    }
    public void cdplayer(){
        System.out.println("Control the cdplayer available in the car");
    }
}
