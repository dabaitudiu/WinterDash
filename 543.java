public int diameterOfBinaryTree(TreeNode root) {
        if( root == null){
            return 0;
        }
        if(root == null){
            return 0;
        }
        int max = 0;
        Stack<TreeNode> stack = new Stack<>();
        Map<TreeNode,Integer> hmp = new HashMap<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.peek();
            if(node.left != null && !hmp.containsKey(node.left)){
                stack.push(node.left);
            }else if(node.right!=null && !hmp.containsKey(node.right)){
                stack.push(node.right);
            }else {
                TreeNode prev = stack.pop();
                int leftMax = hmp.getOrDefault(prev.left,0);
                int rightMax = hmp.getOrDefault(prev.right,0);
                int nodeMax = 1 + Math.max(leftMax,rightMax);
                hmp.put(prev,nodeMax);
                max = Math.max(max,leftMax + rightMax );
            }
            
        }
        return max;
        
    } 