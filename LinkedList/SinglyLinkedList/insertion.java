public class insertion{
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

    //To insert node at begining of SLL
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    //To insert node at last of SLL
    public void insertLast(int value){
        ListNode newNode=new ListNode(value);
        if(head==null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(null!=current.next){
            current=current.next;
        }
        current.next = newNode;
    }

    //To insert a node at given position
    public void insertAtPosition(int position;int value){
        ListNode newNode = new ListNode(value);
        if(position==1){
            newNode.next= head;
            head = newNode;
        }
        else{
            int count = 1;
            ListNode previous = head;
            while(count<position-1){
                previous=previous.next;
                count++;
            }
            ListNode current=previous.next;
            previous.next=newNode;
            newNode.next=current;
        }
    }
    public static void main(String[] args) {
        insertion sll=new insertion();
        sll.head=new ListNode(10); //10--->null
        ListNode second=new ListNode(1);//10--->1--->null
        ListNode third = new ListNode(8);//10--->1--->8--->null
        ListNode fourth = new ListNode(11);//10--->1--->8--->11--->null

        //Now we need to connect all the nodes to form a chain
        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        //To insert a node at first SLL
        sll.insertFirst(3); //3--->10--->1--->8--->11--->null

        //To insert a node at last of SLL
        sll.insertLast(7);//10--->1--->8--->11--->7--->null

        //To insert a node at any position of SLL
        sll.insertAtPosition(2,5) //10--->5--->1--->8--->11--->7--->

        //To traverse or display the SLL
        sll.display();
 
    }
}