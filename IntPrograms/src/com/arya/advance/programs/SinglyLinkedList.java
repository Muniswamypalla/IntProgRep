package com.arya.advance.programs;

class Nodes<T>
{
	private T data;
	
	private Nodes<T> nextNode;
	
	Nodes()
	{
		
	}
	
	Nodes(T data)
	{
		this.data = data;
		this.nextNode = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Nodes<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Nodes<T> nextNode) {
		this.nextNode = nextNode;
	}
	
}

public class SinglyLinkedList<E> {
	
	private Nodes<E> head;
	
	private int size;
	
	public static void main(String[] args) {
		
		SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<Integer>();
		
		singlyLinkedList.add(1);
		singlyLinkedList.add(2);
		singlyLinkedList.add(3);
		//singlyLinkedList.add(singlyLinkedList.size, 4);
		singlyLinkedList.iterator();
		
		//removing based on index
		//singlyLinkedList.remove(3);
		//singlyLinkedList.iterator();
		
		//removing based on object
		System.out.println(singlyLinkedList.remove(new Integer(1)));
		singlyLinkedList.iterator();
	}
	
	public boolean add(E data) {

		Nodes<E> temp = new Nodes<E>(data);
		Nodes<E> cur = head;

		if (head == null) {
			//head is null add temp node to head.
			head = temp;
			
			this.size++;
			return true;
		} else {
			
			//traversing to last node which is points next node as null.
			while (cur.getNextNode() != null)
				cur = cur.getNextNode();
			
			//set last node to point temp node.
			cur.setNextNode(temp);
			this.size++;
			return true;
		}
	}
	
	public boolean add(int index, E data) {
		
		Nodes<E> temp = new Nodes<E>(data);
		Nodes<E> cur = head;

		if (index == 0) {
			temp.setNextNode(head);
			this.head = temp;//assign updated temp to head
			this.size++;
			return true;
		} else {
			
			for (int i = 1; i < index; i++) {
				cur = cur.getNextNode();
			}
			
			temp.setNextNode(cur.getNextNode());
			cur.setNextNode(temp);
			
			this.size++;
			return true;
		}

	}
	
	public E remove(int index)
	{
		Nodes<E> cur = head;
		E dElement = null;
		
		if(index == 0)
		{
			dElement = cur.getData();
			cur = cur.getNextNode();
		}
		else
		{
			for (int i = 1; i < index; i++) {
				cur = cur.getNextNode();
			}
			
			dElement = cur.getData();
			cur.setNextNode(cur.getNextNode().getNextNode());
		}
		
		return dElement;
	}
	
	public E remove(E data)
	{
		Nodes<E> cur = head;
		Nodes<E> pre = head;
		E dElement = null;
		

		for (int i = 0; i < this.size; i++)
		{
			if(i == 0)
			{
				if(data.toString().equals(cur.getData().toString()))
				{
					dElement = cur.getData();
					pre = cur.getNextNode();
					head = pre;
					break;
				}
			}
			else
			{
				pre = cur;
				cur = cur.getNextNode();
				
				if(data.toString().equals(cur.getData().toString()))
				{
					dElement = cur.getData();
					pre.setNextNode(cur.getNextNode());
					break;
				}
				
			}
		}
		
		return dElement;
		
	}
	
	public void iterator()
	{
		Nodes<E> cur = head;
		StringBuilder sb = new StringBuilder();
		
		while(true)
		{
			sb.append(cur.getData());
			sb.append(" ");
			
			if(cur.getNextNode() == null)
				break;
			cur = cur.getNextNode();
		}
		
		System.out.println(sb.toString());
	}

	@Override
	public String toString() {
		return ""+head;
	}
	
	
}
