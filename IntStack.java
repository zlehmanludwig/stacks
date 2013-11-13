import java.util.*;

public class IntStack{
	int[] stack;
	int top;

	public IntStack(int size)   //param optional: size of stack}
	{
		stack = new int[size];
		top=0;
	}
	boolean isEmpty()
	{
		return top==0;
	}
	void push(int num)
	{
		stack[top++]=num;
	}
	/**
       Search in the int stack for an input
       @author Henry Woods
       @param number to find
       @param stack array
	 */
	void search(int input, int[] stack)
	{
		int occurence = 0;
		//search
		for (int x = 0; x < stack.length; x++)
		{
			if (stack[x] == input);
			occurence++;
		}


		System.out.println("There are " + occurence + " " + input + "s in this stack");
	}

	int pop()
	{
		return stack[--top];
	}
	/**
       ima build popple right bout ur sgon pop allll o dem thangs
       @author THEOLLIELLAMA (Oliver Kafka)
	 */
	void  popAll()
	{
		popMultiple(top);        
	}
	/**
       ima build pop multiple right bout hur is gon pop mo than wun
       @author THEOLLIELLAMA (Oliver Kafka)
       @param number of items to pop
	 */
	void  popMultiple(int pops)
	{
		for (int i = pops;i>0; i --)
		{
			System.out.println( pop());
		}
	}

	int peek()  //sometimes
	{
		return stack[top-1];
	}
	/**
       listen up! this gon be peak all right round hur. S'gonna peak all o dem numbers.
       @author THEOLLIELLAMA (Oliver Kafka)
	 */
	void peekAll()
	{
		for (int i = top;i>0; i --)
		{
			System.out.println(stack[i-1]);
		}
	}  

	/**
      Function to peek at a specific depth
      @author Henry Screen
      @param depth the distance from the top
	 */
	int peekDepth(int depth)      
	{
		if (depth<=top) return stack[top-depth];
		else
		{
			return -1;
		}
	}

	/**
       Function to return the size of the stack
       @author Henry Screen
	 */
	int stackSize()
	{
		return top;
	}

	/**
       Function to resize the array when it gets to big for the amount of things pushed into it (by default  a factor of 10)
       @auther Henry Screen
       @param Takes the IntStack in order to change the size of the stack that is within it 
	 */
	IntStack resizeStack(IntStack is)
	{
		int [] newStackSize = new int[stack.length*10];
		for (int i = 0; i < stack.length; i++)
			newStackSize[i] = stack[i];
		stack = newStackSize;
		return is;

	}

	/**
	Function to shuffle the stack and print the new order
	@author Zachary Lehman-Ludwig
	 */
	void stackShuffle() {
		List<Integer> st = new ArrayList<Integer>();
		for(int i = 0; i<stack.length; i++) {
			st.add(stack[i]);
		}
		Collections.shuffle(st);
		System.out.println(st.toString());
		for (int i = 0; i<stack.length; i++) {
			stack[i] = st.get(i);
		}
		//System.out.println("just shuffled");
		//for(int x = 0; x<stack.length; x++) {
		//	System.out.println("in for loop");
		//	stack[x] = st.get(x);
		//	System.out.println(stack[x]);
		//	}
	}


	public static void main (String[] args){
		IntStack is = new IntStack(13);
		is.push(4);
		is.push(5);
		is.push(6);
		is.push(7);
		is.push(8);
		is.push(9);
		is.push(10);
		is.push(11);
		is.push(12);
		is.push(13);
		is.push(14);
		is.push(15);
		is.push(16);
		System.out.println("The stack contains: "); 
		is.peekAll();

		//tests for peekDepth:
		System.out.println("the first '5' in the stack appears at position " + is.peekDepth(5));

		//test for stackSize
		System.out.println("The stack has " + is.stackSize() + " items.");

		//test for resizeStack
		//System.out.println("The stack length is: " +  is.stack.length);
		//is.resizeStack(is);
		//System.out.println("The new stack max length is: " +  is.stack.length);

		int val = is.pop();

		//Test for popMultiple
		System.out.println("The top three items in the stack are:");
		is.popMultiple(3);
		
		//Test for popAll
		System.out.println("The rest of the stack is: ");
		is.popAll();
		System.out.println("the top item on the stack is " + val);
		
		//test for shuffle
		System.out.println("shuffle the stack:");
		is.stackShuffle();
		is.peekAll();
	}
}
