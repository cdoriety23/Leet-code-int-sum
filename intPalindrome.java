public class intPalindrome {


    public static void main(String args[])
    {
        System.out.println(intPal(3445));//false
        System.out.println(intPal(13731));//true
    }

    public static boolean intPal(int n) {
        int rem, temp, rev = 0;
        temp=n;
        while (temp > 0) ;
        {
            rem = temp % 10;
            rev = rev* 10 + rem;
            temp = temp / 10;

    }return n==rev;

}
}

