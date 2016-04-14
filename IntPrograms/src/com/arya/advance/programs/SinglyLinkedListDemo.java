package com.arya.advance.programs;

class Node<T> implements Comparable<T> {

	private T data;
	private Node<T> next;
	
	public Node(T data) {
	    this(data, null);
	}
	
	public Node(T data, Node<T> next) {
	    this.next = next;
	    this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	@Override
	public int compareTo(T arg) {
		if (arg == this.data) {
			return 0;
		} else {
			return 1;
		}
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	
	
}


public class SinglyLinkedListDemo<T> {

	private Node<T> head;
	private int size;

	public SinglyLinkedListDemo() {
		head = null;
		size = 0;
	}

	public void add(Object data) {

		Node<T> temp = new Node(data);
		Node<T> curr = head;

		if (head == null) {
			head = temp;
		} else {
			while (curr.getNext() != null) {
				curr = curr.getNext();
			}

			curr.setNext(temp);
		}
		
		this.size++;
	}

	public void add(int index, Object data) {

		Node<T> temp = new Node(data);
		Node<T> curr = head;

		if (index == 0) {
			temp.setNext(head);
			this.head = temp;
		} else {
			for (int i = 1; i < index; i++) {
				curr = curr.getNext();
			}
			temp.setNext(curr.getNext());
			curr.setNext(temp);
		}

		this.size++;
	}

	public void replace(T data, int index) {
		Node<T> curr = head;
		for (int i = 0; i < 0; i++) {
			curr = curr.getNext();
		}

		curr.setData(data);
	}

	public Object get(int index) {

		Node<T> curr = head;
		for (int i = 0; i < index; i++) {
			curr = curr.getNext();
		}

		return curr.getData();
	}

	public void remove(int index) {

		Node<T> curr = head;

		if (index == 0) {
			head = head.getNext();
		} else {
			for (int i = 1; i < index; i++) {
				curr = curr.getNext();
			}

			curr.setNext(curr.getNext().getNext());
		}

		this.size--;
	}
	
	public void remove(Object object) {

		Node<T> curr = head;
		
		for (int i = 0; i < this.size; i++) {
			
			System.out.println("==============");
			System.out.println(object.toString()+"     "+curr.getData());
			
			if(object.toString().equals(curr.getData().toString()))
			{
				curr = curr.getNext();
			}
			else
			{
				
			}
			curr = curr.getNext();
				
		}
		

		this.size--;
	}
	
	
	public void iterate()
	{
		
		 Node<T> tmp = head;
	        while(true){
	            if(tmp == null){
	                break;
	            }
	            System.out.println(tmp.getData());
	            tmp = tmp.getNext();
	        }
		
	}

	public int size() {
		return this.size;
	}

	public String toString() {
		String list = "";
		list += "[" + this.head.getData() + "]";

		Node<T> curr = head.getNext();
		while (curr != null) {
			list += "[" + curr.getData() + "]";
			curr = curr.getNext();
		}

		return list;

	}
	
	public static void main(String[] args) {
		
		SinglyLinkedListDemo<Integer> list = new SinglyLinkedListDemo<Integer>();
		list.add(3);
		list.add(2);
		list.add(1);
		
		
		list.iterate();
		list.add(1,10);
		System.out.println("---------------");
		//list.remove(new Integer(2));
		list.iterate();
	}

}

