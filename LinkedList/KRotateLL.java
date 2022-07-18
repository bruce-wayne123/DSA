      class Node{
          int data;
          Node next;
          Node(int d){
              data=d;
              next=null;
          }
      }

      public Node rotate(Node head, int k) {
        if(head==null)
        return null;
        if(k<=0)
        return head;
        Node oldhead,node,kNode;
        int count=0;
        oldhead=node=head;
        
        while (node.next!=null) {    
          if (count==k) {
            head=node.next;
            temp=node.next;
            node.next=null;
            node=temp;     
            count++;
            continue;     
          }
          node=node.next;
          count++; 
        }
        node.next=oldhead;
        return head;
      }