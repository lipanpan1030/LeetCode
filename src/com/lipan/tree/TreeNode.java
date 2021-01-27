package com.lipan.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public int val;
    public TreeNode(int val) {
        this.val = val;
    }

    public void preTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        preTraversal(root.left);
        preTraversal(root.right);
    }

    public void inTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inTraversal(root.left);
        System.out.println(root.val);
        inTraversal(root.right);
    }

    public void postTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        postTraversal(root.left);
        postTraversal(root.right);
        System.out.println(root.val);
    }

    public List<List<Integer>> levelOrder_DFS(TreeNode root) {
        List<List<Integer>> result  = new ArrayList<>();
        if (root == null) {
            return result;
        }
        dfs(root, result, 0);
        return result;
    }

    private void dfs(TreeNode root, List<List<Integer>> result, int level) {
        if (root == null) {
            return;
        }

        if (level == result.size()) {
            result.add(new ArrayList<>());
        }
        result.get(level).add(root.val);
        dfs(root.left, result, level + 1);
        dfs(root.right, result, level + 1);
    }

    public List<List<Integer>> levelOrder_BFS(TreeNode root) {
        List<List<Integer>> result  = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode head = queue.poll();
                level.add(head.val);
                if (head.left != null) {
                    queue.offer(head.left);
                }
                if (head.right != null) {
                    queue.offer(head.right);
                }
            }
            result.add(level);
        }

        return result;
    }

    public void revert(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        revert(root.left);
        revert(root.right);
    }



}
