package com.company;
abstract class compartment{
    public abstract String notice();
}
class firstclass extends compartment{
    public String notice(){
        return "firstclass";
    }
}
class ladies extends compartment{
    public String notice(){
        return "ladies";
    }
}
class luggage extends compartment{
    public String notice(){
        return "luggage";
    }
}
class general extends compartment{
    public String notice(){
        return "general";
    }
}
class testcompartment{
    public static void main(String[] args) {
        compartment arr[]=new compartment[10];
        arr[1]=new general();
        arr[2]=new firstclass();
        arr[3]=new ladies();
        arr[4]=new luggage();
        arr[1].notice();
        arr[2].notice();
        arr[3].notice();
        arr[4].notice();
    }
}


















