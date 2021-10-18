package com.automobile;
//1.
import com.automobile.twowheeler.*;
public class test {
    public static void main(String[] args) {
        Hero obj1=new Hero();
        System.out.println(obj1.getmodelname());
        System.out.println(obj1.getregistrationnumber());
        System.out.println(obj1.getownername());
        System.out.println(obj1.getspeed());
        obj1.radio();
        Honda obj2=new Honda();
        System.out.println(obj2.getmodelname());
        System.out.println(obj2.getregistrationnumber());
        System.out.println(obj2.getownername());
        System.out.println(obj2.getspeed());
        obj2.cdplayer();
    }
}
