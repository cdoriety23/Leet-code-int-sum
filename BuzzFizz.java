// This is an easy, but important problem that returns a list, where you must return a string based on index being a multiple
//but order matters


import java.util.ArrayList;
import java.util.List;
    public class BuzzFizz {


            public static void main(String args[])
            {
                List<String> a = new ArrayList<>();//1 ,2, Fizz,4,Buzz,Fizz,7,8,Fizz, Buzz,11,Fizz,13,14,FizzBuzz
                a = fizzBuzz(15);
                for (int i = 0; i < a.size(); i++)
                {
                    System.out.println((i +1)   + " " + a.get(i));
                }
            }
            public static List<String> fizzBuzz(int n){
                List<String> ans = new ArrayList<String>(n);

                for (int i = 1; i <=n; i++) {
                    if ((i % 5== 0) && ( i % 3 == 0)) // this is key, order mattters
                    {
                        ans.add("FizzBuzz");
                    } else if (i % 3 == 0) {
                        ans.add("Fizz");
                    } else if (i % 5 == 0) {
                        ans.add("Buzz");
                    } else {
                        ans.add(String.valueOf(i));
                    }

                }
                return ans;
            }
        }






