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
	 
	// Time Complexity: O(N)
	// Space Complexity: O(1)
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        DoublyLinkedListNode current = head;
        DoublyLinkedListNode temp = null;

        while(current!=null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        
        if(temp!=null){
            head = temp.prev;
        }
        return head;
    }