class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        // Edge case: empty input
        if (lists == null || lists.length == 0) {
            return null;
        }

        // Min-heap that sorts ListNode by node.val
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a, b) -> a.val - b.val
        );

        // Insert the first node of each list into the heap
        for (ListNode node : lists) {
            if (node != null) {
                pq.offer(node);
            }
        }

        // Dummy node to build the result list
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (!pq.isEmpty()) {
            ListNode smallest = pq.poll();   // get min node
            tail.next = smallest;            // append it
            tail = tail.next;

            if (smallest.next != null) {
                pq.offer(smallest.next);     // push next node from same list
            }
        }

        return dummy.next;
    }
}
