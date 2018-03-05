/*
class Tree {
	Tree left;
	Tree right;
	int data;

	Tree(int data) {
		this.data = data;
	}
}
*/

private static void decodeHuffman(Tree root, String s) {
		Tree temp = root;
		for (char c : s.toCharArray()) {
			if (c == '1') {
				temp = temp.right;
				if (temp.left == null && temp.right == null) {
					System.out.print(temp.data);
					temp = root;
				}
			} else if (c == '0') {
				temp = temp.left;
				if (temp.left == null && temp.right == null) {
					System.out.print(temp.data);
					temp = root;
				}
			}
		}
	}
