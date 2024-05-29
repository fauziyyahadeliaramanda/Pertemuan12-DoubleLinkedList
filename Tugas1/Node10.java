package Tugas1;


public class Node10 {
    Vaksinasi10  data;
    Node10 prev, next;

    Node10(Node10 prev, Vaksinasi10 data, Node10 next)
    {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}