
public class IntegerLinkedList {
    private IntegerNode head;
    public boolean isEmpty() {
        return head == null;
    }
    public void insertFront(int val) {
        IntegerNode node = new IntegerNode(val);
        node.setNext(head);
        head = node;
    }
    public void insertBack(int val) {
        IntegerNode node = new IntegerNode(val);
        if(isEmpty()){
            head=node;
        }else{
            IntegerNode cur = head;
            while(cur.getNext() != null){
                cur = cur.getNext();
            }
            cur.setNext(node);
        }
    }
    public void print() {
        IntegerNode cur = head;
        while (cur != null){
            System.out.printf("%d", cur.getValue());
            cur = cur.getNext();
        }
        System.out.println();
    }
    public int get(int index) {
        IntegerNode cur = head;
        for(int i = 0; i<index; i++){
            if(cur == null){
                System.out.println("Error: IndexOutOfBounds");
                return -1;
            }else{
                cur = cur.getNext();
            }
        }
        return cur.getValue();
    }
    public void removeFront() {
        if(head != null){
            head = head.getNext();
        }
    }
    public void removeBack() {
        if(head != null){
            if(head.getNext()==null){
                head = null;
            }else{
                IntegerNode cur = head;
                IntegerNode next = cur;
                while (next.getNext()!=null){
                    cur = next;
                    next = next.getNext();
                }
                cur.setNext(null);
            }
        }
    }
    public void removeAt(int index){
        if(head != null){
            if(head.getNext()==null&&index==0){
                head = null;
            }else if(index!=0){
                IntegerNode cur = head;
                IntegerNode next = cur;
                int i = 0;
                while (next.getNext()!=null&&i<index){
                    cur = next;
                    next = next.getNext();
                    i++;
                }
                if(i==index){
                    if(next.getNext()!=null){
                        cur.setNext(next.getNext());
                    }else{
                        cur.setNext(null);
                    }
                }else{
                    System.out.println("Error: Index out of bounds");
                }
            }else if(index==0){
                head = head.getNext();
            }
        }else{
            System.out.println("Error: List already empty");
        }
    }
}

