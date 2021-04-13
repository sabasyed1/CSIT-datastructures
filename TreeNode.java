// ***************************************************************
// Saba Syed   
// CSIT212-01: Data Structures and Algorithms Section 1
// Professor Boxiang Dong
// March 22, 2021
// ***************************************************************
public class TreeNode {
	public int key;
	public TreeNode p;
	public TreeNode left;
	public TreeNode right;
	
	public TreeNode () {
		p = left = right = null;
	}
	
	public TreeNode (int k) {
		key = k;
		p = left = right = null;
	}
}
