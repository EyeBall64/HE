public class LinkedList {
    public Node head;
    public Node cursor;

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

    public int GetNext(){
        int v = cursor.value;
        cursor = cursor.GetNext();
        return v;
    }

    public boolean HasNext(){
        return(cursor != null);
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

    public void Add(int index, int v) {
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

    public int GetFirst() {
        return head.value;
    }

    public int GetLast() {
        Node current = head;
        Node previous = null;
        while (current != head) {
                previous = current;
                current = current.GetNext();
        }
        return current.value;
    }

    public int Get(int index){
        Node current = head;
        Node previous = null;
        for (int i = 0; i < index; i++) {
            previous = current;
            current = current.GetNext();
        }
        return current.value;
    }

    public void Set(int index, int n){

    }

    public boolean Contains(int n){
        Node current = head;
        Node previous = null;
        for(int i = 0;i+1<n;i++){
            previous = current;
            current = current.GetNext();
            if (previous.value == n){
                return true;
            }
        }
        return false;
    }

    public int GetSize(){
        int count = 0;
        Node current = head;

        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }
}