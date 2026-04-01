class Solution {
    List<Integer> res = new ArrayList<>();
    
    public List<Integer> postorderTraversal(TreeNode root) {
        postorder(root);
        return res;
    }
    
    void postorder(TreeNode root){
        if(root==null) return;
        postorder(root.left);   
        postorder(root.right);  
        res.add(root.val);      
    }
}