// Complete the hasCycle function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean hasCycle(SinglyLinkedListNode head) {
        SinglyLinkedListNode curr1 = head;
        SinglyLinkedListNode curr2 = head;
        int flag =0;
        while(curr1 != null && curr2 != null && curr2.next != null){
            curr1 = curr1.next;
            curr2 = curr2.next.next;
            if(curr1 == curr2){
                flag =1;
                break;
            }
        }
        if(flag ==1)
            return true;
        else
        return false;
    }
