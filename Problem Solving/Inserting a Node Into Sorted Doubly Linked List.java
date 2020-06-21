    // Complete the sortedInsert function below.

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        if(head==null)
            head = newNode;
        else if(head.data>=data){
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
        }
        else
        {   
            DoublyLinkedListNode current = head;
            while(current.next!=null && current.next.data<data){
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            newNode.prev = current;
        }
        return head;
    }
