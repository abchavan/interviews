package com.interview.company.airbnb;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists {


    public ListNode1 mergeKLists(ListNode1[] lists) {

        if (lists == null || lists.length == 0) return null;

        PriorityQueue<ListNode1> queue = new PriorityQueue<ListNode1>(lists.length, new Comparator<ListNode1>() {
            @Override
            public int compare(ListNode1 o1, ListNode1 o2) {
                if (o1.val < o2.val)
                    return -1;
                else if (o1.val == o2.val)
                    return 0;
                else
                    return 1;
            }
        });

        ListNode1 dummy = new ListNode1(0);
        ListNode1 tail = dummy;

        for (ListNode1 node : lists)
            if (node != null)
                queue.add(node);

        while (!queue.isEmpty()) {
            tail.next = queue.poll();
            tail = tail.next;

            if (tail.next != null)
                queue.add(tail.next);
        }
        return dummy.next;
    }
}
