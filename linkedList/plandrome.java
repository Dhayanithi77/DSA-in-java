package linkedList;

public class plandrome {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    public boolean isPalendrome(ListNode head) {
        ListNode mid = middleNode(head);

        ListNode secondNode = reverseList(mid);

        ListNode reReverseHead = secondNode;

        while (head != null && secondNode != null) {

            if (head.val != secondNode.val) {
                break;
            }

            head = head.next;
            secondNode = secondNode.next;
        }
        reverseList(reReverseHead);
        return secondNode == null;
    }

    private ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode present = head;

        while (present != null) {
            ListNode next = present.next;
            present.next = prev;
            prev = present;
            present = next;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k){
                  if (k < 1 || head == null){
                    return head;
                  }
                  ListNode Current=head;
                  ListNode prev=null;
                  while(true){
                    ListNode last=prev;
                    ListNode newEnd=Current;
                   ListNode next=Current.next;
                   for(int i=0;Current !=null && i<k;i++){
                      Current.next=prev;
                      prev=Current;
                      Current=next;
                      if(next!=null){
                        next=next.next;
                      }
                    }
                    if(last!=null){
                        last.next=prev;
                    }
                    else{
                        head=prev;
                    }
                    newEnd.next=Current;
                    if(Current==null){
                        break;
                    }
                    prev=newEnd;

                   }
                   return head;
                  }

public static void main(String[] args){
       plandrome p = new plandrome();
        ListNode head = p.new ListNode(1);
        head.next = p.new ListNode(2);
        head.next.next = p.new ListNode(3);
        head.next.next.next = p.new ListNode(4);
        head.next.next.next.next = p.new ListNode(5);
           head.next.next.next.next.next= p.new ListNode(6);
              head.next.next.next.next .next.next= p.new ListNode(7);

            int k = 2;

    head = p.reverseKGroup(head, k);

    // Print the list
    while (head != null) {
        System.out.print(head.val + " -> ");
        head = head.next;
    }
    System.out.println("null");
}
}
