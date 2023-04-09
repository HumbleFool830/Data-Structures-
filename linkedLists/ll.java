public class ll{
    public static void main(String[] args) {
        System.out.println("hello world ");

        ll list = new ll();

        list.addNode(10);
        list.addNode(12);
        list.addNode(13);
        list.addNode(17);
        list.display();
        list.addFirst(9);
        list.addFirst(8);
        list.addLast(18);
        list.addLast(20);
        list.display();
        System.out.println(list.size);

        list.addPosition(11, 3);
        list.addPosition(15, 6);

        list.display();
    }


    class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = next;
        }
        public Node(int data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    }

        public Node head = null;
        public Node tail = null;
        public int size = 0;

        public void addNode(int data)
        {
            Node newNode = new Node(data);

            if (head == null )  // In this case head is pointing to null then our list is empty and also tail also pointing to null.
            {
                head = newNode; 
                tail = newNode; //in every singly linked list is there only one node then that node is pointing to head and tail.
                size++;
            }
            else{
                tail.next = newNode;
                tail = newNode;
                size++;
            }
        }

        public void display()
        {
            Node current = head ;  // considering the current node is head and traversing the complete list.
            while(current != null)
            {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("End");
        }


        public void addFirst(int data)
        {
            Node newNode = new Node(data);
            newNode.next = head ;
            head = newNode;
            size++;
        }

        public void addLast(int data)
        {
            Node newNode = new Node(data);
            tail.next = newNode;
            tail = newNode;
            size++;
        }

        public void addPosition(int data , int index)
        {
            if(index == size)
            {
                addLast(data);
            }
            else if(index == 0 ) {
                addFirst(data);
            }
            else{
                Node current = head ;

                for(int i=1;i<index;i++)
                {
                    current = current.next;
                }
                Node newNode = new Node(data,current.next);
                current.next = newNode;
                newNode.next = current.next.next;
            }

        }
}