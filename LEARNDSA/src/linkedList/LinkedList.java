package linkedList;
import java.util.*;
public class LinkedList<T> {
	
	Node<T> head;
	LinkedList()
	{
		this.head=null;
	}
	
	static class Node<T>
	{
		T data;
		Node<T> next;
		
		
		
		Node(T data)
		{
			this.data=data;
			this.next=null;
		}
		
	}
	
	
	 //insert element at the begining of the linked list 
	void add(T data)
	{
		Node<T> newElement = new Node<T>(data);
		if(head==null)
		{
			head=newElement;
		}
		else
		{
			newElement.next=head;
			head=newElement;
		}
	}
	
	// printing Linked List
	void print()
	{
		Node<T> temp = head;
		while(temp!=null)
		{
			
			System.out.print(temp.data+ "--->");
			temp=temp.next;
		}
		System.out.print("null");
	}
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.print();
		
		
		
	}

}
