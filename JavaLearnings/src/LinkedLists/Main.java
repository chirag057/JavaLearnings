package LinkedLists;

public class Main {
    public static void main(String[] args) {
  LinkedList myLinkedList = new LinkedList(4);
myLinkedList.Append(5);
myLinkedList.Append(9);
myLinkedList.Append(8);
//myLinkedList.getHead();
//  myLinkedList.getTail();


  myLinkedList.printList();

//        System.out.println("The removed value is "+ myLinkedList.removeLast().value);
//        System.out.println("The removed value is "+ myLinkedList.removeLast().value);
//        System.out.println("The removed value is "+ myLinkedList.removeLast().value);
//        System.out.println("The removed value is "+ myLinkedList.removeLast().value);
//        System.out.println(myLinkedList.removeLast());

        System.out.println("The removed first value is "+ myLinkedList.removeFirst().value);
        System.out.println(myLinkedList.get(0).value);
        System.out.println(myLinkedList.set(0,5));





    }
}
