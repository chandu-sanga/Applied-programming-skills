class Solution{
public boolean isSymmetric(TreeNode root){
return check(root,root);
}
boolean check(TreeNode a,TreeNode b){
if(a==null&&b==null)return true;
if(a==null||b==null)return false;
if(a.val!=b.val)return false;
return check(a.left,b.right)&&check(a.right,b.left);
}
}