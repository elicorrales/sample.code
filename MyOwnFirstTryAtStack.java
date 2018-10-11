
public class MyOwnFirstTryAtStack {

	private int[] _stack = null;
	private int pointer = 0;
	MyOwnFirstTryAtStack(int size) { _stack = new int[size]; }

	void push(int n) {
		if (pointer<_stack.length) {
			_stack[pointer] = n;
			pointer++;
		}
	}

	int pop() {
		pointer = pointer>0?--pointer:pointer;
		int value = _stack[pointer];
		_stack[pointer] = 0;
		return value;
	}

	public String toString() {
		
		StringBuffer buf = new StringBuffer();
		buf.append("[");
		for (int n : _stack) {
			buf.append(n);
			buf.append(",");
		}
		buf.append("]");
		
		return buf.toString();
	}

	public static void main(String[] args) {

		MyOwnFirstTryAtStack stack = new MyOwnFirstTryAtStack(10);
		System.out.println(stack);
		stack.push(3);
		System.out.println(stack);
		stack.push(6);
		stack.push(-2);
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.push(-2);
		stack.push(-2);
		stack.push(-2);
		stack.push(-2);
		System.out.println(stack);
		stack.push(-2);
		stack.push(-2);
		stack.push(-2);
		System.out.println(stack);
		stack.push(-2);
		stack.push(-2);
		System.out.println(stack);
		stack.push(-2);
		System.out.println(stack);
		stack.push(-2);
		System.out.println(stack);

		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
	}

}
