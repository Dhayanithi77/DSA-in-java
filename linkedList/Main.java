package linkedList;

public class Main {
    public static void main(String[] args) {

        LL list = new LL();

       list.InsertLast(10);
list.InsertLast(20);
list.InsertLast(30);
list.display();
list.insertRec(15, 1);

list.display();
        
    }
}