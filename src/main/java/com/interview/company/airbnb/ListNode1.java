package com.interview.company.airbnb;
// Definition for singly-linked list.

import lombok.Data;

@Data
class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1(int x) {
        val = x;
    }
}