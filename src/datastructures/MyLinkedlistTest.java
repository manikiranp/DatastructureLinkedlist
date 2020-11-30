package datastructures;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedlistTest {
	@Test
	public void given3numwhenaddedtolinkedlistshouldaddedtotop() {
		MyNode<Integer> myfirstnode = new MyNode<>(70);
		MyNode<Integer> mysecondnode = new MyNode<>(30);
		MyNode<Integer> mythirdnode = new MyNode<>(56);
		MyLinkedlist myLinkedlist = new MyLinkedlist();
		myLinkedlist.add(myfirstnode);
		myLinkedlist.add(mysecondnode);
		myLinkedlist.add(mythirdnode);
		
		boolean result = myLinkedlist.head.equals(mythirdnode) &&
				myLinkedlist.head.getNext().equals(mysecondnode) &&
				myLinkedlist.tail.equals(myfirstnode);
		Assert.assertTrue(result);
	
	}
}
