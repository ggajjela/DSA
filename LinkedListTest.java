public class LinkedListTest {
    public static void main(String[] args) {

        LinkedListMethods ListHead = new LinkedListMethods();
        ListHead.addAtHead(5);
        ListHead.addAtHead(16);
        ListHead.addAtHead(8);
        System.out.print("ListHead: ");
        ListHead.printList();

        LinkedListMethods ListTail = new LinkedListMethods();
        ListTail.addAtTail(4);
        ListTail.addAtTail(8);
        ListTail.addAtTail(15);
        ListTail.addAtTail(16);
        System.out.print("ListTail: ");
        ListTail.printList();

        ListTail.addAtIndex(0, -1);

        ListTail.addAtIndex(20, -7);
        ListTail.addAtIndex(4, 40);
        ListTail.printList();

        ListTail.search(8);
        ListTail.search(100);

        ListTail.remove(-1);
        ListTail.printList();
        ListTail.remove(15);
        ListTail.printList();
        ListTail.remove(16);
        ListTail.printList();
        ListTail.remove(100);

//        ListTail.removeAtIndex(0);
//        ListTail.removeAtIndex(2);
//        ListTail.removeAtIndex(3);
//        ListTail.removeAtIndex(30);
//        ListTail.printList();




        System.out.println("len of list: " + ListTail.listLen());
    }
}