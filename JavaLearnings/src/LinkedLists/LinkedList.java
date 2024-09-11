package LinkedLists;


import com.sun.jdi.connect.spi.TransportService;
import org.w3c.dom.Node;

import javax.swing.*;
import java.security.PublicKey;

public class LinkedList {

    private Node head;
    private  Node tail;
    private int length;

     class Node{  // Nested class

        int value ;
        Node next;

         Node(int value) {
             this.value = value;
         }
    }
    public LinkedList(int value)
    {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length =1;

    }

    public  void printList()
    {
        Node temp = head;

        while(temp!= null)
        {
            System.out.println(temp.value);
            temp=temp.next;

        }
    }
    public void getHead()
    {
        System.out.println("The Head value is " + head.value);
    }
    public void getTail()
    {
        System.out.println("The Tail value is "+ tail.value);
    }

    public void Append(int value)
    {
       Node newNode = new Node(value);
       if(length==0)
       {
           head = newNode;
           tail = newNode;
       }
       else {
           tail.next=newNode;
           tail=newNode;
       }
       length++;
    }


    public Node removeLast()
    {
        if(length==0) return null;

        Node temp = head;
        Node Pre = head;

        while(temp.next!=null)
        {
            Pre=temp;
            temp =temp.next;

        }
        tail= Pre;
        tail.next=null;
        length--;
        if(length==0) head=null; tail=null;

        return temp;
    }
    public  void prePend(int value)
    {
        Node newNode = new Node(value);

        if(length==0)
        {head=newNode; tail = newNode;}
        else{
            newNode.next= head;
            head= newNode;
           }
        length++;
    }

    public Node removeFirst()
    {
        if(length==0) return null;

        Node temp = head;
        head=head.next;
        temp.next=null;
        length--;

        if(length==0)  tail=null;

        return temp;

    }

    public Node get(int index)
    {
        if(index<0 || index>=length) return null;

        Node temp = head;
        for(int i =0;i<index;i++)
        {
            temp=temp.next;
        }
        return temp;
    }

    public  boolean set(int index , int value)
    {
        Node temp = get(index);

        if(temp!=null)
        {
            temp.value=value;
            return  true;
        }
        return false;
    }
    }



