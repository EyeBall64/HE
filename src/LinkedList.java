public class LinkedList {
    public Node head;

    public LinkedList() {
        head = null;
    }

    public LinkedList(int[] value) {
        head = new Node(value[0]);
        Node n = head;
        for (int i = 1; i < value.length; i++) {
            Node adding = new Node(value[i]);
            n.SetNext(adding);
            n = n.GetNext();
        }
    }

    public void AddItem(int v) {
        Node n = new Node(v);
        if (head == null) {
            head = n;
        } else {
            Node current = head;
            Node previous = null;
            while (current != head) {
                if (current.GetNext() == null) {
                    previous = current;
                    current = current.GetNext();
                }
                previous.SetNext(n);
            }
        }
    }

    public void AddFirst(int v) {
        Node n = new Node(v);
        n.SetNext(head);
        head = n;
    }

    public void add(int index, int v) {
        Node n = new Node(v);
        Node current = head;
        Node previous = null;
        for (int i = 0; i < index; i++) {
            previous = current;
            current = current.GetNext();
        }
        previous.SetNext(n);
        n.SetNext(current);
    }

    public void Clear() {
        head = null;
    }

    public int getFirst() {
        return head.value;
    }

    public int getLast() {
        Node current = head;
        Node previous = null;
        while (current != head) {
                previous = current;
                current = current.GetNext();
        }
        return current.value;
    }

    public int get(int index){
        Node current = head;
        Node previous = null;
        for (int i = 0; i < index; i++) {
            previous = current;
            current = current.GetNext();
        }
        return current.value;
    }
}