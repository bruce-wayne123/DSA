package demojava;

public class StackArray
{
	private int[]data; 
	private int topIndex; 
	public StackArray()
	{
		data=new int[10];
		topIndex=-1;
	}

	public void Push(int value) {
		if (topIndex==data.length-1) {
			doubleCapacity();
		}
		topIndex++;
		data[topIndex]=value;
	}

	private void doubleCapacity() {
		// TODO Auto-generated method stub
		int temp[]=data;
		data=new int[] {temp.length*2};
		for(int i=1;i<temp.length;i++)
		{
			data[i]=temp[i];
		}
		
	}

	public int Pop() throws StackEmptyException {
		if(topIndex==-1)
		{
			System.out.println("Stack is empty");
			throw new StackEmptyException();
		}
		int temp=data[topIndex];
		topIndex--;
		return temp;
	}

	public int Top() {
		if (topIndex==-1) {
			System.out.println("Stack is empty");
			return 0;
		}
		return data[topIndex];
	}

	public boolean IsEmpty() {

		if (topIndex<0) {

			return true;
		}
		else {
			return false;
		}
	}

	public void PrintStack() {
		for (int i = topIndex; i >= 0; i--) {
			System.out.println(data[i]);
		}
	}
}