package Lab_30.part_2;

public class Search {
    private static TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }

        if (value < root.value) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    private static int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        return Math.max(leftHeight, rightHeight) + 1;

    }

    public static void main(String[] args) {
        TreeNode root1 = null;

        for (int i = 1; i <= 64; i += 2) {
            root1 = insert(root1, i);
        }

        for (int i = 2; i <= 64; i += 2) {
            root1 = insert(root1, i);
        }

        int height1 = getHeight(root1);
        System.out.println("Высота дерева 1: " + height1);

        TreeNode root2 = null;

        int[] numbers = {32, 16, 48};
        for (int num : numbers) {
            root2 = insert(root2, num);
        }

        for (int i = 1; i <= 64; i++) {
            if (i != 32 && i != 16 && i != 48) {
                root2 = insert(root2, i);
            }
        }

        int height2 = getHeight(root2);
        System.out.println("Высота дерева 2: " + height2);
    }
}
