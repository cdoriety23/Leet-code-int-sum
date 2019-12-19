public class perfectSquare {
    public static void main(String args[])
    {
        System.out.println(perfSquare(144));//true
        System.out.println(perfSquare(36));//true
        System.out.println(perfSquare(122));//false

    }

    public static  boolean perfSquare(int num)
    {
        if(Math.pow(num,.5) % 1 !=0)// if there is a remainder
        {
            return false;
        }
        return true;
    }



}
