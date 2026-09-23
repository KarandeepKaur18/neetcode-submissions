class Solution {
    public Node addTwoLists(Node head1, Node head2) {

        Node temp1 = head1;
        Node temp2 = head2;

        // Dummy node
        Node dummy = new Node(0);
        Node in = dummy;

        int carry = 0;

        while (temp1 != null || temp2 != null || carry != 0) {

            int val1 = (temp1 != null) ? temp1.data : 0;
            int val2 = (temp2 != null) ? temp2.data : 0;

            int sum = val1 + val2 + carry;

            carry = sum / 10;

            int digit = sum % 10;

            Node fin = new Node(digit);

            in.next = fin;
            in = in.next;

            if (temp1 != null)
                temp1 = temp1.next;

            if (temp2 != null)
                temp2 = temp2.next;
        }

        return dummy.next;
    }
}