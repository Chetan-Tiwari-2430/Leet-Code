import java.util.LinkedList;
class DesignHashSet_705 {
    LinkedList<Integer> ll = new LinkedList<>();
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        if(ll.contains(key)){
            return;
        }
        ll.add(key);
    }
    
    public void remove(int key) {
        if(ll.contains(key)){
            ll.remove(Integer.valueOf(key));
        }
        return;
    }
    
    public boolean contains(int key) {
        if(ll.contains(key)){
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */