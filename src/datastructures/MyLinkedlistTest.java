package datastructures;

import org.junit.Assert;
import org.junit.Test;


public class MyLinkedlistTest {
	@Test
	public void given3numwhenaddedtolinkedlistshouldaddedtotop() {
		MyNode<Integer> myfirstnode = new MyNode<>(70);
		MyNode<Integer> mysecondnode = new MyNode<>(30);
		MyNode<Integer> mythirdnode = new MyNode<>(56);
		MyLinkedlist myLinkedlist =new MyLinkedlist();
		myLinkedlist.add(myfirstnode);
		myLinkedlist.add(mysecondnode);
		myLinkedlist.add(mythirdnode);
		
		boolean result = myLinkedlist.head.equals(mythirdnode) &&
				myLinkedlist.head.getNext().equals(mysecondnode) &&
				myLinkedlist.tail.equals(myfirstnode);
		Assert.assertTrue(result);
	
	}
	@Test
	public void given3numwhenaddedtolinkedlistshouldaddedtobottom() {
		MyNode<Integer> myfirstnode = new MyNode<>(56);
		MyNode<Integer> mysecondnode = new MyNode<>(30);
		MyNode<Integer> mythirdnode = new MyNode<>(70);
		MyLinkedlist myLinkedlist = new  MyLinkedlist();
		myLinkedlist.add(myfirstnode);
		myLinkedlist.append(mysecondnode);
		myLinkedlist.append(mythirdnode);
		
		boolean result = myLinkedlist.head.equals(myfirstnode) && 
						myLinkedlist.head.getNext().equals(mysecondnode) &&
						myLinkedlist.tail.equals(mythirdnode);
		Assert.assertTrue(result);
	}
	@Test
	public void given3numwhenaddedtolinkedlistinsertinginbetween() {
		MyNode<Integer> myfirstnode = new MyNode<>(56);
		MyNode<Integer> mysecondnode = new MyNode<>(30);
		MyNode<Integer> mythirdnode = new MyNode<>(70);
		MyLinkedlist myLinkedlist = new  MyLinkedlist();
		myLinkedlist.add(myfirstnode);
		myLinkedlist.append(mythirdnode);
		myLinkedlist.insert(myfirstnode,mysecondnode);
		
		boolean result = myLinkedlist.head.equals(myfirstnode) && 
						myLinkedlist.head.getNext().equals(mysecondnode) &&
						myLinkedlist.tail.equals(mythirdnode);
		Assert.assertTrue(result);
	}
	@Test
	public void given3numwhenremovingfirstnodeshouldpass() {
		MyNode<Integer> myfirstnode = new MyNode<>(56);
		MyNode<Integer> mysecondnode = new MyNode<>(30);
		MyNode<Integer> mythirdnode = new MyNode<>(70);
		MyLinkedlist myLinkedlist = new  MyLinkedlist();
		myLinkedlist.add(myfirstnode);
		myLinkedlist.append(mysecondnode);
		myLinkedlist.append(mythirdnode);
		myLinkedlist.pop();
		
		boolean result = myLinkedlist.head.equals(mysecondnode) && 
						myLinkedlist.head.getNext().equals(mythirdnode) &&
						myLinkedlist.tail.equals(mythirdnode);
		Assert.assertTrue(result);
	}
	@Test
	public void removinglastelementinlinkedlistshouldpass() {
		MyNode<Integer> myfirstnode = new MyNode<>(56);
		MyNode<Integer> mysecondnode = new MyNode<>(30);
		MyNode<Integer> mythirdnode = new MyNode<>(70);
		MyLinkedlist myLinkedlist = new  MyLinkedlist();
		myLinkedlist.add(myfirstnode);
		myLinkedlist.append(mysecondnode);
		myLinkedlist.append(mythirdnode);
		myLinkedlist.poplast();
		
		boolean result = myLinkedlist.head.equals(myfirstnode) && 
						myLinkedlist.head.getNext().equals(mysecondnode) &&
						myLinkedlist.tail.equals(mysecondnode);
		Assert.assertTrue(result);
	}
	
	
	
}

