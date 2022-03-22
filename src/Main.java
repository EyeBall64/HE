public class Main {

    public static void main(String[] args) {
        //Node n1 = new Node(13);
        //Node n2 = new Node(7);
        //Node n3 = new Node(68);

        //n1.SetNext(n2);
        //n2.SetNext(n3);
        //n1.Display();
        int[] data = {1,2,3,4,5};

        //Create a linked list
        LinkedList myList = new LinkedList(data);
        myList.head.Display();
        myList.head.GetNext().Display();
        myList.head.GetNext().GetNext().Display();
        myList.head.GetNext().GetNext().GetNext().Display();
        myList.head.GetNext().GetNext().GetNext().GetNext().Display();


        //myList.AddItem(12);
        //myList.AddItem(6);
        //myList.AddItem(67);

        for(int i=0;i<10;i++){

        }

    }
}

