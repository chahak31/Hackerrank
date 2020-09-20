

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
        DoublyLinkedListNode temp = new DoublyLinkedListNode(data);
        DoublyLinkedListNode curr = head;
        if(head == null){
            temp.prev = null;
            head = temp;
            return head;
        }
        else{
            while(curr.next != null)
            {
                curr = curr.next;
            }
            curr.next = temp;
            temp.prev = curr;
        }
        curr = head;
        DoublyLinkedListNode temp1;
        DoublyLinkedListNode index1;
        int n;
        while(curr != null){
            temp1 = curr;
            index1 = curr.next;
            while(index1 != null){
                if(curr.data > index1.data)
                {
                    n = temp1.data;
                    temp1.data = index1.data;
                    index1.data = n;
                }
                index1 = index1.next;
            }
            curr = curr.next;
        }
        return head;

    }

