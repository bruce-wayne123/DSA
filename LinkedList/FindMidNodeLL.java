    public static Node findMiddle(Node head) 
    {
        // Write your code here
        Node fastNode,slowNode;
        slowNode=fastNode=head;
        while(fastNode!=null && fastNode.next!=null)
        {
            slowNode=slowNode.next;
            fastNode=fastNode.next.next;
        }
        return slowNode;
    }