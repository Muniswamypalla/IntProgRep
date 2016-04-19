package com.arya.advance.programs;

public class StackUsingNode<E> {
	
	private Snode<E> head;
	private int size;
	private int topSize = 5;
	
	public static void main(String[] args) {
		
		StackUsingNode<Integer> stack = new StackUsingNode<Integer>();
		
		try {
			stack.push(4);
			stack.push(8);
			stack.push(3);
			stack.push(89);
			stack.pop();
			stack.push(34);
			stack.push(45);
			stack.push(78);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void push(E data) throws Exception
	{
		Snode<E> temp = new Snode<E>(data);
		Snode<E> cursor = null;
		
		if(isFull())
			throw new Exception("Stack is full.....");
		
		if(head == null)
			head = temp;
		else
		{
			cursor = head;
			
			while(cursor.nextNode != null)
				cursor = cursor.nextNode;
			
			cursor.nextNode = temp;
		}
		
		System.out.println("added: "+data);
			
		this.size++;
	}
	
	public boolean isFull()
	{
		return (size == topSize);
	}
	
	public boolean isEmpty()
	{
		return (size <= 0);
	}
	
	public E pop()throws Exception
	{
		E ele = null;
		Snode<E> cursor = head;
		
		if(isEmpty())
			throw new Exception("Stack is empty.....");
		
		if(this.size == 1)
		{
			ele = head.data;
			head = null;
		}
		else
		{
			for (int i = 0; i < this.size-2; i++) {
				cursor = cursor.nextNode;
			}
			
			ele = cursor.nextNode.data;
			cursor.nextNode = null;
		}
		
		System.out.println("removed: "+ele);
		this.size--;
		return ele;
	}
	
}

class Snode<E> {
	
	public Snode<E> nextNode;
	public E data;

	
	public Snode() {
		super();
	}

	public Snode(E data) {
		super();
		this.nextNode = null;
		this.data = data;
	}

	public Snode<E> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Snode<E> nextNode) {
		this.nextNode = nextNode;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

}