package Tugas2;

// import org.w3c.dom.Node;

public class Node10 {
    Film10  data;
    Node10 prev, next;

    Node10(Node10 prev, Film10 data, Node10 next)
    {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}