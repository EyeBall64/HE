public class Stack extends LinkedList{

    private Node top;

    public  Stack(){
        super();
    }

    public void Push(int v){
        top = head;
        AddFirst(v);
    }

    public int Pop(){
        int v = head.GetValue();
        head = head.GetNext();
        return v;
    }

    public int Peek(){
        return head.GetValue();
    }

    public boolean IsEmpty(){
        return (head == null);
    }

    public boolean IsFull(){
        return (head != null);
    }

    public void Size(){
        super.GetSize();
    }
}