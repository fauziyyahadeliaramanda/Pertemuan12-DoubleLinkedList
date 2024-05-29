package doublelinkedlist;

public class DoubleLinkedListMain10 {
    public static void main (String[] args) throws Exception {
        DoubleLinkedList10 dll = new DoubleLinkedList10();
        dll.print();
        System.out.println("Size :" +dll.size());
        System.out.println("====================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("===================");
        try {
            dll.add(40,1);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        dll.print();
        System.out.println("Size: "+dll.size());
        System.out.println("=================");
        dll.clear();
        dll.print();
        System.out.println("Size: "+dll.size());
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size: "+dll.size());
        System.out.println("=====================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size: "+dll.size());
        System.out.println("=======================");
        dll.removeLast();
        dll.print();
        System.out.println("Size: "+dll.size());
        System.out.println("========================");
        dll.remove(1);
        dll.print();
        System.out.println("Size: "+dll.size());
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("==========================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("=============================");
        dll.add(40,1);
        dll.print();
        System.out.println("Siize: "+dll.size());
        System.out.println("==========================");
        System.out.println("Data awal pada Linked List adalah: " + dll.getFirts());
        System.out.println("Data akhir pada Linked List adalah: " + dll.getLast());
        System.out.println("Data indeks ke-1 pada Linked List adalah: " + dll.get(1));
    }
}
