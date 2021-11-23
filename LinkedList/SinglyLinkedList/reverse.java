public class reverse{
    private ListNode head;  //instance of head

    private static class ListNode{
        private int data;   //Generic Type
        private ListNode next;//Reference of next node 

    public ListNode(int data){
        this.data=data;
        this.next=null;
    }
    }
    public void display(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data + "--->");
            current=current.next;
        }
        System.out.print("null");
    }

   //Reverse an SLL
   public static ListNode reverse(ListNode head){
    if(head==null){
        return head;
    }
    ListNode current= head;
    ListNode previous = null;
    ListNode next = null;
    while(current!=null){
        next=current.next;
        current.next=previous;
        previous=current;
        current=next;
    }
    return previous;
}

    public static void main(String[] args) {
        reverse sll=new reverse();
        sll.head=new ListNode(10); //10--->null
        ListNode second=new ListNode(1);//10--->1--->null
        ListNode third = new ListNode(8);//10--->1--->8--->null
        ListNode fourth = new ListNode(11);//10--->1--->8--->11--->null

        //Now we need to connect all the nodes to form a chain
        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        //To traverse or display the SLL
        sll.display();

        //Reverse a SLL
        ListNode reverseListHead = sll.reverse(head);
        sll.display(reverseListHead);

        
    }
}