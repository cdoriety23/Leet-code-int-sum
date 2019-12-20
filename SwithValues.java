public class SwithValues {


    public static void main(String args[])
    {
        int a=30;
       int  b=20;

       a=a+b;// a = now 50
        b= a-b;// b is now 30
       a = a-b;// a is now 20;

        System.out.println("a is now: "+ a);// 20
        System.out.println("b is now: " + b);//30

    }

}
