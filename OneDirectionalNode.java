
public class OneDirectionalNode {

	String content;
	OneDirectionalNode next = null;
		
	OneDirectionalNode(String content) { this.content = content; }
		
	void next(OneDirectionalNode n) { this.next = n; }
	
}
