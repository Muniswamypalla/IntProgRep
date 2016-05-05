package com.arya.advance.programs;

public class SinglyLinkedList<E> {
	
	private Nodes<E> head;
	
	private int size;
	
	public static void main(String[] args) {
		
		SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<Integer>();
		
		singlyLinkedList.add(1);
		singlyLinkedList.add(2);
		singlyLinkedList.add(3);
		singlyLinkedList.add(4);
		singlyLinkedList.add(5);
		//singlyLinkedList.add(singlyLinkedList.size, 4);
		singlyLinkedList.iterator();
		
		//removing based on index
		//singlyLinkedList.remove(3);
		//singlyLinkedList.iterator();
		//singlyLinkedList.findMidElement();
		//removing based on object
		System.out.println(singlyLinkedList.remove(new Integer(1)));
		singlyLinkedList.iterator();
	}
	
	/*1) Use two pointers fast and slow
	2) Move fast two nodes and slow one node in each iteration
	3) If fast and slow meet then linked list contains cycle
	4) if fast points to null or fast.next points to null then linked list is not cyclic*/


	public boolean isCyclic(){
		
		Nodes<E> fast = head;
		Nodes<E> slow = head;
       
        while(fast!= null && fast.getNextNode() != null){
            fast = fast.getNextNode().getNextNode();
            slow = slow.getNextNode();
           
            //if fast and slow pointers are meeting then LinkedList is cyclic
            if(fast == slow ){
                return true;
            }
        }
        return false;
    }
	
	//finding middle element with one pass
	
	public void findMidElement()
	{
		Nodes<E> current = head;
		Nodes<E> middle = head;
		int length = 0;
		
		while(current.getNextNode() != null){
	          length++;
	          if(length%2 ==0){
	              middle = middle.getNextNode();
	          }
	          current = current.getNextNode();
	      }
	    
	      if(length%2 == 1){
	          middle = middle.getNextNode();
	      }

	      System.out.println("length of LinkedList: " + length);
	      System.out.println("middle element of LinkedList : " + middle.getData());


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
		this.size--;
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
		
		this.size--;
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