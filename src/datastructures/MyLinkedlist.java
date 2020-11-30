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
	
	

}
