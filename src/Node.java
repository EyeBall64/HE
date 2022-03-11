
public class Node {
    public int value;
    public Node next;

    public Node(int v){
        value = v;
        next = null;
    }

    public void SetNext(Node n){
        next = n;
    }

    public Node GetNext(){
        return next;
    }

    public void Display(){
        System.out.println(value);
    }
}

