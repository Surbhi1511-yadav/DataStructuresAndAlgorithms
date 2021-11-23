public class lengthOfSll{
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

   //To Search a key in Sll:
   public boolean find(ListNode head, int searchKey){
    if(head==null){
        return false;
    }
    ListNode current = head;
    while(current!=null){
        if(current.data==searchKey){
            return true;
        }
        current=current.next;
    }
    return false;
}


    public static void main(String[] args) {
        lengthOfSll sll=new lengthOfSll();
        sll.head=new ListNode(10); //10--->null
        ListNode second=new ListNode(1);//10--->1--->null
        ListNode third = new ListNode(8);//10--->1--->8--->null
        ListNode fourth = new ListNode(11);//10--->1--->8--->11--->null

        //Now we need to connect all the nodes to form a chain
        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        //To search the key
        if(sll.find(head,11)) {
            System.out.println("Search Key found");
        } else {
            System.out.println("Search key not found");
        }

        //To traverse or display the SLL
        sll.display();
    }
}