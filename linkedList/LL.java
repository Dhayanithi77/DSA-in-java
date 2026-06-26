package linkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void InsertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size +=1;

    }
    public void InsertLast(int val){
        if(tail==null){
            InsertFirst(val);
            return;
        }
        Node node =new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    public void Insert(int val,int index){
        if(index==0){
            InsertFirst(val);
            return;
        }
        if(index==size){
            InsertLast(val);
        return;
            }
            Node temp=head;
            for(int i=1;i<index;i++){
                temp =temp.next;
}
Node node=new Node(val,temp.next);
temp.next=node;
size++;
    }
    public void insertRec(int val,int index){
        head=insertRec(val, index, head);

    }
private Node insertRec(int val,int index,Node node){
    if(index == 0){
        
        size++;
        return new Node(val,node);
    }
    node.next=insertRec(val, index-1, node.next);
    return node;
}





    public int DeleteFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    public int DeleteLast(){
      if(size <= 1){
        return DeleteFirst();
      }
      Node secondLast=get(size-2);
      int val=tail.value;
tail=secondLast;
tail.next=null;
size--;
return val;
    }
    public int Delete(int index){
     if(index==0){
        return DeleteFirst();
     }
     if(index==size-1){
        return DeleteLast();
     }
     Node prev=get(index-1);
  int val=prev.next.value;

  prev.next=prev.next.next;
  return val;
     }

     public Node find(int value){
        Node node=head;
        while(node != null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        
        return node;
    }
    public Node get(int index){
        Node node=head;
        for(int i=0;i< index;i++){
            node=node.next;
        }
        return node;
    }
    public void display(){
        Node temp=head;
    while(temp!=null){
            System.out.print(temp.value + "->");
            temp=temp.next;
        }
        System.out.println("End");
        
    }
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}