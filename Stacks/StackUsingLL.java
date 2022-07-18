package demojava;

public class StackUsingLL {

	private Node<Integer> head;
	private Integer count;

	public StackUsingLL() {
		count=0;
	}

	public void Push(int value) {
    Node currentNode=new Node(value);
    if(head==null)
    {
        head=currentNode;
    }
    else
    {
      Node tempNode=head;
      head=currentNode;
      head.next=tempNode;
    }
	}

	public int Pop() {
    int data=-1;
		if(head!=null)
      {
         data=head.data;
         head=head.next;
      }
      return data;
	}

	public int Top() {
		if (topNode!=null) {
			return topNode.data;
		}
		else {
		
			return -1;
		}
		
	}

	public int Length() {
		return count;
	}

	public boolean IsEmpty() {
		if (count<=0) {
			return true;
		}
		else {
			return false;
		}
	}

	public void PrintStack() {
		Node<Integer> tempNode=head;
		while (tempNode!=null) {
			System.out.println(tempNode.data);
			tempNode=tempNode.next;
		}   
	}
}