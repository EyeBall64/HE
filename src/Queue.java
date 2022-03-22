public class Queue extends Stack{
    private Node tail;
    private Node head;

    public Queue(){
        super();
    }

    public void EnQueue(int data){
        Node current = head;
        Node previous = null;
        int i = 0;
        while (current != null){
            previous = current;
            current = current.GetNext();
            i++;
        }
        super.Add(data,i);
    }

    public int DeQueue(){
        int temp = head.value;
        head = head.GetNext();
        return temp;
    }

    public boolean IsEmpty(){
        return (super.IsEmpty());
    }

    public int Size(){
        return super.Size();
    }
}
