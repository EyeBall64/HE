public class ArrayStack extends Stack{

    private int maxSize;
    private int[] element;
    private int top;

    public ArrayStack(int size){
        maxSize = size;
        element = new int[maxSize];
        top = -1;
    }

    public void Push(int n){
        if(top < maxSize -1){
            top++;
            element[top] = n;
        }
    }

    public int Pop(){
        if (top >= 0){
            int data = element[top];
            top = top -1;
            return data;
        } else{
            System.out.println("NO!!");
            return-1;
        }
    }

    public int Peek(){
        if(top >= 0){
            int data = element[top];
            return data;
        }else{
            return -1;
        }
    }

    public boolean IsEmpty(){
        return (head == null);
    }

    public boolean IsFull(){
        return super.IsFull();
    }

    public int Size(){
        return super.Size();
    }
}