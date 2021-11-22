public class deletion{
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(){
            this.data=data;
            this.next=null;
        }
    }

    public void display(){
        ListNode current=head;
        while(current.next!=null){
            System.out.print(current.data +"--->")
            current=current.next;
        }
        System.out.print("null");
    }

    public ListNode deleteFirst(){
        if(head==null){
            return null;
        }
        ListNode current=head;
        head=head.next;
        current.next=null;
        return current;
    }

    public ListNode deleteLast(){
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode current=head;
        ListNode previous=null;
        while(current.next!=null){
            previous=current;
            current=current.next;
        }
        previous.next=null;
        return current;
    }

    public void deleteAtGivenPosition(int position){
        if(position==1){
            head=head.next;
        }
        else{
            ListNode previous=head;
            int count=1;
            while(count<position-1){
                previous=previous.next;
                count++;
            }
            ListNode current=previous.next;
            previous.next=current.next;
        }
    }

    public static void main(String[] args) {
        deletion sll=new deletion();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        sll.head.next=second;
        second.next=third;
        third.next=fouth;

        sll.deleteFirst();
        sll.deleteLast();
        sll.deleteAtGivenPosition(3);
        sll.display();
        
    }
}