/*
 * @lc app=leetcode.cn id=705 lang=java
 *
 * [705] 设计哈希集合
 */

// @lc code=start
class MyHashSet {

    boolean [] data=new boolean[1000001];
    public MyHashSet() {

    }
    
    public void add(int key) {
        data[key]=true;
    }
    
    public void remove(int key) {
        data[key]=false;
    }
    
    public boolean contains(int key) {
        if (data[key]==true) {
            return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
// @lc code=end

