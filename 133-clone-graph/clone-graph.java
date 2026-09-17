/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    private Node clone(Node node,HashMap<Node,Node> mp){
        Node newn=new Node(node.val);
        mp.put(node,newn);
        for(Node nei:node.neighbors){
            if(!mp.containsKey(nei)){
                newn.neighbors.add(clone(nei,mp));
            }
            else{
                newn.neighbors.add(mp.get(nei));
            }
        }
        return newn;
    }
    public Node cloneGraph(Node node) {
        if(node==null){
            return null;
        }
        HashMap<Node,Node> mp=new HashMap<>();
        return clone(node,mp);

    }
}