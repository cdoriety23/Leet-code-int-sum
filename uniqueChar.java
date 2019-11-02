
import java.util.HashMap;

public class uniqueChar {

    public static void main(String args[])
    {
        String a= "leetcode"; //answer 0 because l isn't repeated
        String b= "loveleetcode"; // return 2 because of v
        System.out.println(UniqueChar(a));
        System.out.println(UniqueChar(b));



    }


        public static int UniqueChar(String s)
        {
           HashMap<Character,Integer> tracker = new HashMap<Character,Integer>();
            // using hashmap to find track the count of each character
            {
                for(int i = 0; i<s.length(); i++) {
                    char c = s.charAt(i);
                    if (tracker.containsKey(c)) {
                        tracker.put(c, tracker.get(c) + 1);
                    } else {
                        tracker.put(c, 1);
                    }
                }

                    for(int i=0; i<s.length(); i++)
                    {
                        char c= s.charAt(i);
                        if(tracker.get(c)==1)
                        {
                            return i;
                        }


                }
            }return -1;
        }

    }


