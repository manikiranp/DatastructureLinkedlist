package datastructures;

public class MyLinkedlist {
	public INode head;
	public INode tail;

	public MyLinkedlist() {
		this.head=null;
		this.tail=null;
	}

	public void add(INode node) {
		if(this.tail==null) {
			this.tail=node;
		}
		if(this.head==null) {
			this.head=node;
		} else {
			INode tempnode=this.head;
			this.head=node;
			this.head.setNext(tempnode);
		}
	}

	public void append(INode mynode) {
		if(this.head==null) {
			this.head=mynode;
		}
		if(this.tail==null) {
			this.tail=mynode;
		} else {
			this.tail.setNext(mynode);
			this.tail=mynode;
		}
			
	}

	public void insert(INode mynode, INode newnode) {
		INode tempnode=mynode.getNext();
		mynode.setNext(newnode);
		newnode.setNext(tempnode);
	}

//	public INode pop() {
//		INode tempnode=this.head;
//		this.head=head.getNext();
//		return tempnode;
//				
//	}
	public void pop() {
		INode tempnode =this.head;
		this.head=head.getNext();
	}
	
	public INode poplast() {
		INode tempnode=head;
		while(!tempnode.getNext().equals(tail)) {
			tempnode=tempnode.getNext();
		}
		this.tail=tempnode;
		tempnode=tempnode.getNext();
		return tempnode;
		
		
	}

}
