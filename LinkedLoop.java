public class LinkedLoop {

        public boolean isLoop(ListNode head) {


            ListNode p1 = head;// first pointer
            ListNode p2 = head;// second pointer

            while(p2 != null && p2.next !=null)
            {
                p1 = p1.next;
                p2 = p2.next.next;

                if(p1 == p2)
                {
                    return true;
                }
            }return false;
        }
    }





}
