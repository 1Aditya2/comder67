package com.company;

//1.
import java.util.Scanner;
 class car{//creating the class of car
     double price;
     String manf;
     car(){
        Scanner obj=new Scanner(System.in);
         price= obj.nextDouble();
         manf= obj.next();
     }
}
 public class execution {
     car arr[]=new car[3];//Creating array and initializing it of the class car
    public void init() {
         for (int i = 0; i < arr.length; i++) {
            arr[i]=new car();
        }
     }
    public void sort(){
         double t;
         for (int i = 1; i <arr.length-1 ; i++) {
             for (int j = 0; j < arr.length-1-i; j++) {//Sorting the array with respect to price
                if(arr[j].price>arr[j+1].price){
                     t=arr[j].price;
                   arr[j].price=arr[j+1].price;
                     arr[j+1].price=t;
                }
           }
        }
    }
    public static void main(String[] args) {
         execution obj=new execution();
        obj.init();
        obj.sort();
         for (int i = 0; i < obj.arr.length; i++) {
        System.out.println(obj.arr[i].manf+"  "+obj.arr[i].price);
         }
     }
 }



//2.
class room {
    boolean acon;
    boolean homethon;
    boolean fanon;
    boolean lighton;
    room() {
        String sig;
        String app;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Which appliance you want  to turn ON/OFF");
            app = sc.nextLine();
            System.out.println("Enter ON/OFF");
            sig = sc.nextLine();
            if (app.equals("ac")) {
                if (sig.equals( "on")) {
                    acon = true;
                }
                else {
                    acon = false;
                }
            }
            else if (app.equals("home theatre")) {
                if (sig.equals("on")) {
                    homethon = true;
                }
                else {
                    homethon = false;
                }
            }
            else if (app.equals("light")) {
                if (sig.equals("on")) {
                    lighton = true;
                }
                else {
                    lighton = false;
                }
            }
            else if (app.equals("fan")) {
                if (sig.equals("on")) {
                    fanon = true;
                }
                else {
                    fanon = false;
                }
            }
        }
    }
    public void bill(){
        int bil=0;
        if(acon==true){
            bil=bil+1200;
        }
        if(homethon==true){
            bil=bil+600;
        }
        if(fanon==true){
            bil=bil+400;
        }
        if(lighton==true){
            bil=bil+100;
        }
        System.out.println(bil);
        if(bil>2000){
            System.out.println("Overload");
        }
        else{
            System.out.println("good");
        }
    }

}
public class Main {
    public static void main(String[] args) {
        room obj=new room();
        obj.bill();
    }
}



//4.
class stud{
    String name;
    double perce;
    stud(String a,double b){
        name=a;
        perce=b;
    }
}
class test{
    stud arr[]=new stud[3];
    test(){
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new stud(sc.nextLine(),sc.nextDouble());
            sc.nextLine();
        }
    }
    public void toppr(){
        double max=arr[0].perce;
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i].perce){
                max=arr[i].perce;
                c=i;
            }
        }
        System.out.println(max+" "+arr[c].name);
    }
}
public class Main {
    public static void main(String[] args) {
        test obj=new test();
        obj.toppr();
    }
}



//5.
class stud{
    String name;
    int age;
    String address;
    stud(){
        name="unknown";
        age=0;
        address="not available";
    }
    public void setinfo(String n,int a){
        name=n;
        age=a;
    }
    public void setinfo(String n,int a,String ad){
        name=n;
        age=a;
        address=ad;
    }
}

public class Main {
    public static void main(String[] args) {
        stud arr[]=new stud[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new stud();
        }
        Scanner sc=new Scanner(System.in);
        arr[0].setinfo(sc.nextLine(), sc.nextInt());
        sc.nextLine();
        arr[1].setinfo(sc.nextLine(), sc.nextInt(),sc.nextLine());
        sc.nextLine();
        arr[2].setinfo(sc.nextLine(), sc.nextInt(), sc.nextLine());
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].name);
            System.out.println(arr[i].age);
            System.out.println(arr[i].address);
        }
    }
}






//6.
class addamt{
    int amt=50;
    addamt(){
    }
    addamt(int n){
        amt=amt+n;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        addamt obj=new addamt(sc.nextInt());
        obj = new addamt();
        System.out.println(obj.amt);
    }
}




//3.
class stud{
    int mn;
    static  int n=0;
    {
        n++;
    }
    stud(){
        mn++;
    }
    stud(int a){
        mn=mn+a;
    }
}
public class Main {
    public static void main(String[] args) {
        stud obj=new stud();
        stud obj1=new stud(123);
        stud obj2=new stud(12);
        System.out.println(stud.n);
    }
}



//7.
class programming{
    programming(){
        System.out.println("I love programming");
    }
    programming(String s){
        System.out.println("I love "+s);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        programming obj=new programming();
        programming obj1=new programming(sc.nextLine());
    }
}



//8.
import java.math.*;
class caculator{
    public static void powerint(int num1,int num2){
        System.out.println(Math.pow((double) (num1),(double) (num2)));
    }
    public static void powerdouble(double num1,int num2){
        System.out.println(Math.pow(num1,(double) (num2)));
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        caculator.powerint(sc.nextInt(), sc.nextInt());
        caculator.powerdouble(sc.nextDouble(), sc.nextInt());
    }
}





//9.
class number {
    private int n;

    number(int n) {
        this.n = n;
    }

    public boolean iszero() {
        if (n == 0) {
            System.out.println(1233);
            return true;
        } else {
            return false;
        }
    }

    public boolean ispositive() {
        if (n > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isnegative() {
        if (n < 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean iseven() {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isodd() {
        if (n % 2 != 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isprime(){
        int c=0;
        for (int i = 2; i <n ; i++) {
            if(n%i==0){
                c=c+1;
                break;
            }
        }
        if(c==0){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isarm(){
        int c=0;
        for (int i = n; i!=0 ;) {
            c++;
            i=i/10;
        }
        int s=0;
        int r;
        for (int i = n; i!=0 ;) {
            r=i%10;
            s= (int) (s+Math.pow(r,c));
            i=i/10;
        }
        if(s==n){
            return true;
        }
        else {
            return false;
        }
    }
    public int getfact(){
        int c=1;
        for (int i = n; i!=0 ; i--) {
            c=i*c;
        }
        return c;
    }
    public int getsqrt(){
        return (int) Math.sqrt(n);
    }
    public int getsqr(){
        return n*n;
    }
    public int sumdig(){
        int s=0;
        for (int i = n; n!=0;) {
            s=s+i%10;
            i=i/10;
        }
        return s;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        number obj=new number(sc.nextInt());
        obj.iseven();
        obj.sumdig();
    }
}



//10.
class scc{
    int arr[]={10,20,30,40,50};
    public boolean search(int arr[], int se){
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            if(se==arr[i]){
                c++;
            }
        }
        if(c!=0){
            return true;
        }
        else {
            return false;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        scc obj=new scc();
        obj.search(obj.arr, 10);
    }
}
