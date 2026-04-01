import java.util.*;

class Solution {
    static class Tuple {
        TreeNode node;
        int row, col;
        Tuple(TreeNode n,int r,int c){
            node=n;row=r;col=c;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        
        Queue<Tuple> q=new LinkedList<>();
        q.add(new Tuple(root,0,0));
        
        while(!q.isEmpty()){
            Tuple t=q.poll();
            TreeNode node=t.node;
            int r=t.row,c=t.col;
            
            map.putIfAbsent(c,new TreeMap<>());
            map.get(c).putIfAbsent(r,new PriorityQueue<>());
            map.get(c).get(r).add(node.val);
            
            if(node.left!=null)q.add(new Tuple(node.left,r+1,c-1));
            if(node.right!=null)q.add(new Tuple(node.right,r+1,c+1));
        }
        
        List<List<Integer>> res=new ArrayList<>();
        
        for(TreeMap<Integer,PriorityQueue<Integer>> ys:map.values()){
            List<Integer> colList=new ArrayList<>();
            for(PriorityQueue<Integer> pq:ys.values()){
                while(!pq.isEmpty())colList.add(pq.poll());
            }
            res.add(colList);
        }
        
        return res;
    }
}