package datastrctures

import java.util.*

class TreeNode<T>(var data: T) {
    var leftNode: TreeNode<T>? = null
    var rightNode: TreeNode<T>? = null
}

class TreeTraversals<T> {


    fun traversePreOrder(treeNode: TreeNode<T>) {
        if (treeNode == null) {
            return
        }
        var stack = LinkedList<TreeNode<T>>()

        stack.push(treeNode)

        while (!stack.isEmpty()) {
            var currentNode = stack.pop()
            print(currentNode.data)

            if (currentNode.rightNode != null) {
                stack.push(currentNode.rightNode)
            }

            if (currentNode.leftNode != null) {
                stack.push(currentNode.leftNode)
            }

        }
    }

}

fun main() {
    var root = TreeNode(0)
    root.leftNode = TreeNode(1)
    root.rightNode = TreeNode(2)
    TreeTraversals<Int>().traversePreOrder(root)
}