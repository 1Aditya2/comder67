package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

//1.
class Exception1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        try {
            for (int i = 0; i < n; i++) {
                arr[i]= sc.nextInt();
            }
            System.out.println("Input an index");
            int in= sc.nextInt();
            System.out.println(arr[in]);
        }
        catch (ArrayIndexOutOfBoundsException obj){
            System.out.println(obj);
        }
        catch (InputMismatchException obj1){
            System.out.println(obj1);
        }
    }
}

//2.

class Mathoperation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int s=0;
            int n=sc.nextInt();//Input mismatch exception
            int arr[]=new int[n];
            for (int i = 0; i <n; i++) {
                arr[i]= Integer.parseInt(args[i]);//Number format exception and array index out of bounds exception
                s=s+arr[i];//
            }
            System.out.println(s);
            System.out.println(s/2);//Arithmetic exception
        }
        catch (InputMismatchException obj){
            System.out.println(obj);
        }
        catch (NumberFormatException obj3){
            System.out.println(obj3);

        }
        catch (ArrayIndexOutOfBoundsException obj1){
            System.out.println(obj1);
        }
        catch (ArithmeticException obj2){
            System.out.println(obj2);
        }
    }
}



//3.

class stud{
    String name;
    int s1,s2,s3;
}
class negativenumber extends Exception{
    negativenumber(String s){
        System.out.println(s);
    }
}
class outofrange1 extends Exception{
    outofrange1(String s){
        System.out.println(s);
    }
}
 class Exception2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        stud arr[]=new stud[2];
        try{
            for (int i = 0; i < 2; i++) {
                arr[i]=new stud();
                arr[i].name= sc.nextLine();
                arr[i].s1= sc.nextInt();
                if(arr[i].s1<0){
                    throw new negativenumber("Not valid");
                }
                else if(arr[i].s1>100){
                    throw new outofrange1("Not valid");
                }
                arr[i].s2= sc.nextInt();
                if(arr[i].s2<0){
                    throw new negativenumber("Not valid");
                }
                else if(arr[i].s2>100){
                    throw new outofrange1("Not valid");
                }
                arr[i].s3= sc.nextInt();
                if(arr[i].s3>100){
                    throw new outofrange1("Not valid");
                }
                else if(arr[i].s3<0){
                    throw new negativenumber("Not valid");
                }
                System.out.println((float) (arr[i].s1+arr[i].s2+arr[i].s3)/3);
                sc.nextLine();
            }
        }
        catch (NumberFormatException obj){
            System.out.println(obj);
        }
        catch (InputMismatchException obj1){
            System.out.println(obj1);
        }
        catch (negativenumber obj2){
            System.out.println("Exception occurred "+obj2);
        }
        catch (outofrange1 obj3){
            System.out.println("Exception occurred "+obj3);
        }
    }
}


//4.
class Invalidcountryexception extends Exception{
    Invalidcountryexception(String s){
        System.out.println(s);
    }
}
class userregistration{
    private static void registeruser(String username,String usercountry) throws Invalidcountryexception{
        if(usercountry.equals("India")){
            System.out.println("User registration done successfully ");
        }
        else{
            throw new Invalidcountryexception("User outside India cannot be registered");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            registeruser(sc.nextLine(), sc.nextLine());
        }
        catch (Invalidcountryexception obj){
            System.out.println("Exception occurred "+obj);
        }
    }
}

//5.

class outofrange extends Exception{
    outofrange(String s){
        System.out.println(s);
    }
}

 class Exception3{
    public static void main(String[] args) throws outofrange{
        try{
            String name=args[0];
            int age= Integer.parseInt(args[1]);//Numberformat exception
            if(18<=age && age<60){
                System.out.println("Congrats");
            }
            else {
                throw new outofrange("Not valid ");
            }
        }
        catch (outofrange obj){
            System.out.println(obj);
        }
        catch (NumberFormatException obj1){
            System.out.println(obj1);
        }
    }
}

