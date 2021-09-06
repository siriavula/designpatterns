/**
 * This is the QueueStore class that implements Queue class all used in the Store class
 */
public class QueueStore <T>  implements Queue<T> {
	private class ListNode {
		T data;
		ListNode link;
		public ListNode(T aData, ListNode aLink)
		{
			data = aData;
			link = aLink;
		}
	}
	
	private ListNode head;
	private ListNode tail;
	
	/**
	 * Defining variables
	 */
	public QueueStore() {
		head = tail = null;
	}
	
	/**
	 * This is the enqueue method that will add each element into the wish list in the Store class
	 */
	public void enqueue(T aData) {
		ListNode newNode = new ListNode(aData,null);
		if(head == null)
		{
			head = tail = newNode;
			return;
		}
		tail.link = newNode;
		tail = tail.link;
		
	}
	
	/**
	 * This is the print method which will be used in the Store class to print the display
	 */
	public void print() {
		for(ListNode temp = head; temp!=null; temp = temp.link)
			System.out.println(temp.data);
	}
	
}
