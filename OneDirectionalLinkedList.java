
public class OneDirectionalLinkedList {

	OneDirectionalNode head;
	
	void add(OneDirectionalNode newNode) {
		if (null==head) { head = newNode; return; }
		add(head,newNode);
	}

	void add(OneDirectionalNode tail, OneDirectionalNode newNode) {
		if (null!= tail.next) {
			add(tail.next,newNode);
		} else {
			tail.next = newNode;
		}
	}

	void insertAfter(String content, OneDirectionalNode newNode) {
		if (null==head) { head = newNode; return; }
		OneDirectionalNode next = head;
		while (null!=next && !next.content.equals(content) && null!=next.next) {
				next = next.next;
		}

		newNode.next = next.next;
		next.next = newNode;
	}

	
	void removeFirstOccurrenceOf(String content) {

		OneDirectionalNode next = head;
		OneDirectionalNode prev = null;
		while (null!=next && !next.content.equals(content) && null!=next.next) {
				prev = next;
				next = next.next;
		}
		if (next.content.equals(content)) {
			if (null!=prev) prev.next = next.next;
			else head = next.next;
		}
	}

	void display() {
		
		if (null!=head) {
			System.out.print(head.content);
			OneDirectionalNode next = head.next;
			while (null!=next)  { System.out.print("->" + next.content); next = next.next; }
			System.out.println();
		} else {
			System.out.println("Empty List");
		}
	}

	public static void main(String[] args) {
		
		OneDirectionalLinkedList list = new OneDirectionalLinkedList();
		
		list.add(new OneDirectionalNode("n1"));
		list.add(new OneDirectionalNode("n2"));
		list.add(new OneDirectionalNode("n3"));
		list.add(new OneDirectionalNode("n4"));
		list.add(new OneDirectionalNode("n5"));
		list.display();
		System.out.println("=================================================");
		list.insertAfter("n3", new OneDirectionalNode("n3b"));
		list.display();
		list.insertAfter("n2", new OneDirectionalNode("n2b"));
		list.display();
		list.insertAfter("n4", new OneDirectionalNode("n4b"));
		list.display();
		list.insertAfter("n5", new OneDirectionalNode("n5b"));
		list.display();
		System.out.println("=================================================");
		list.removeFirstOccurrenceOf("n3b");
		list.display();
		list.removeFirstOccurrenceOf("n5b");
		list.display();
		list.removeFirstOccurrenceOf("n1");
		list.display();
		list.removeFirstOccurrenceOf("n1");//should look same ; no match
		list.display();
		list.removeFirstOccurrenceOf("n2b");
		list.display();
		list.removeFirstOccurrenceOf("n4b");
		list.display();
		list.removeFirstOccurrenceOf("n3");
		list.removeFirstOccurrenceOf("n4");
		list.display();
		list.removeFirstOccurrenceOf("n5");
		list.display();
		list.removeFirstOccurrenceOf("n2");
		list.display();
		
	}
}
