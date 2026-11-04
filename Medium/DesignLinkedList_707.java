class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
class MyLinkedList {
    private ListNode head;
    private  int size = 0;
    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }
    
    public int get(int index) {
        if(size <= index || index < 0 || head == null){
            return -1;
        }
        ListNode temp = head;
        int i = 0;
        while(i < index){
            temp = temp.next;
            i++;
        }
        if(temp == null ){
            return 0;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        if(head == null){
            head = node;
            size++;
            return;
        }
        node.next = head;
        head = node;
        size += 1;
    }
    
    public void addAtTail(int val) {
        ListNode node = new ListNode(val);
        if(head == null){
            head = node;
            size++;
            return;
        }
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(size < index || index <0){
            return;
        }
        if(index == 0){
            addAtHead(val);
            return;
        }
        int i = 0;
        ListNode temp = head;
        while(i < index - 1 && temp != null){
            temp = temp.next;
            i++;
        }
        if(temp == null){
            return;
        }
        ListNode node = new ListNode(val);
        ListNode next = temp.next;
        temp.next = node;
        node.next = next;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        
        if(index >= size || index < 0 || head == null){
            return;
        }
        if(index == 0){
            head = head.next;
            size--;
            return;
        }
        ListNode temp = head;
        for(int i = 0; i < index - 1; i++){
            temp = temp.next;
        }
        if(temp != null && temp.next != null && temp.next.next != null){
            ListNode next = temp.next.next;
            temp.next = next;
        }else{
            if(temp != null && temp.next != null){
                temp.next = temp.next.next;
            }
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */