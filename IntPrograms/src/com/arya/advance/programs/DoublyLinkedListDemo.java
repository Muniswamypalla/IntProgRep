package com.arya.advance.programs;

public class DoublyLinkedListDemo {
	
	static DNode root;
	static DNode temp;
	static DNode current;
	int size;
	
	
public static void main(String[] args){
		
		DoublyLinkedListDemo list = new DoublyLinkedListDemo();
		
		list.addNodes(1);
		list.addNodes(2);
		list.addNodes(3);
		list.addNodes(3,4);
		//list.addNodes(5);
		//list.addNodes(6);
		
		list.printForword();
		
		System.out.println();
		list.printBackwards();
		
		/*list.deleteNode(3);
		System.out.println();
		System.out.println("forword:");
		list.printForword();
		System.out.println();
		System.out.println("backword:");
		list.printBackwards();*/
		
	}
	
	
	public void addNodes(int data){
		
		DNode temp = new DNode(data);
		
		if(root==null){
			
			root = temp;
			//root.previousNode = null;
			//root.nextNode = null;
			
		}else{
			
			current = root;
			
			while(current.nextNode!=null){
				
				current = current.nextNode;
				
			}
			
			current.nextNode = temp;
			temp.previousNode = current;
			
		}
		this.size++;
		
	}
	
	public void addNodes(int afterIndex, int data){
		
		DNode temp = new DNode(data);
		
		if(afterIndex == 0)
		{
			temp.nextNode = root;
			root.previousNode = temp;
			root = temp;
		}
		else
		{
			current = root;
			
			for (int i = 1; i < afterIndex; i++) {
				current = current.nextNode;
			}
			
			if(current.nextNode != null)
			{
				temp.nextNode = current.nextNode;
				current.nextNode.previousNode = temp;
				
			}
			
			current.nextNode = temp;
			temp.previousNode = current;
			
			
			
		}
		
		this.size++;
		
	}

	public void deleteNode(int index){
		
		current = root;
		
		if(index==0){
			
			root = current.nextNode;
			//current.nextNode = null;
			//current.previousNode = null;
			
		}else{
			
			for (int i=1; i < index; i++) {
				
				current = current.nextNode;
				
			}
			
			current.nextNode = current.nextNode.nextNode;
			if(current.nextNode != null)
				current.nextNode.previousNode = current;
			
		}
		
	}
	
	public void printForword(){
		
		current = root;
		boolean arrow = true;
		
		do{
			
			System.out.print((arrow) ? "|" + current.data + "|" : " --> " + "|" + current.data + "|" );
			
			arrow = false;	
			
			current = current.nextNode;
			
		}while(current!=null);
		
	}
	
	public void printBackwards(){
		
		current = root;
		boolean arrow = true;
		
		while(current.nextNode!=null){
			
			current = current.nextNode;
			
		}
		
		do{
			
			System.out.print((arrow) ? "|" + current.data + "|" : " --> " + "|" + current.data + "|" );
			
			arrow = false;	
			
			current = current.previousNode;
			
		}while(current.previousNode!=null);
		
		System.out.print(" --> " + "|" + current.data + "|" );
		
	}
	
	
}


class DNode {

	int data;
	
	DNode previousNode;
	DNode nextNode;
	
	DNode(int data){
		
		this.data = data;
		this.nextNode = null;
		this.previousNode = null;
		
	}

}
