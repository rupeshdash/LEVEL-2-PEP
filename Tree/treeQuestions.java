import java.util.ArrayList;

public class treeQuestions{

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static int size(TreeNode root) {
        return root == null ? 0 : size(root.left) + size(root.right) + 1;
    }

    public static int height(TreeNode root) {
        return root == null ? -1 : Math.max(height(root.left), height(root.right)) + 1;
    }

    public static int Maximum(TreeNode root) {
        return root == null ? -(int) 1e9 : Math.max(Math.max(Maximum(root.left), Maximum(root.right)), root.val);
    }

    public static boolean find(TreeNode root, int data) {
        if (root == null)
            return false;
        if (root.val == data)
            return true;

        return find(root.left, data) || find(root.right, data);
    }
    public static boolean nodeToRootPath(TreeNode root, int data, ArrayList<TreeNode> path) {
      
        if(root==null){
           return false;
        }
        
        if(root.val==data){
            path.add(root);
            return true;
        }
        
        boolean ans = nodeToRootPath(root.left,data,path) || nodeToRootPath(root.right,data,path);
        if(ans){
            path.add(root);
        }
        
        return ans;
  
    }
  
    public static ArrayList<TreeNode> nodeToRootPath(TreeNode root, int data) {
      // write your code here
      if(root==null){
              return new ArrayList<>();
          }
          if(root.val == data){
              ArrayList<TreeNode> ans = new ArrayList<>();
              ans.add(root);
              return ans;
          }
  
          ArrayList<TreeNode> ans1 = nodeToRootPath(root.left,data);
          if(ans1.size()>0){
              ans1.add(root);
              return ans1;
          }
          ArrayList<TreeNode> ans2 = nodeToRootPath(root.right,data);
          if(ans2.size()>0){
              ans2.add(root);
              return ans2;
          }
          return new ArrayList<>();
        
    }

}