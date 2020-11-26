package mian.day01;

public class subject01 {
    public static void main(String[] args) {

    }
}
class solution{

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        int carry = 0;
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        while (l1 !=null || l2 !=null){
            int x = l1 ==null?0:l1.val;
            int y = l2 ==null?0:l2.val;
            int sum = x+y+carry;
            carry = sum/10;
            sum = sum%10;
            cur.next = new ListNode(sum);
            cur = cur.next;
            if (l1 !=null){
                l1 = l1.next;
            }
            if (l2 !=null){
                l2 = l2.next;
            }

        }
        if (carry ==1){
            cur.next = new ListNode(carry);
        }
        return pre;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

