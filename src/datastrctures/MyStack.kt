package datastrctures

class MyStack<T> {

    var topNode: StackNode<T>? = null

    class StackNode<T>(inputData: T) {
        var data = inputData;
        var previous: StackNode<T>? = null
    }

    fun push(data: T) {
        var stackNode = StackNode(data)
        if (topNode == null)
            topNode = stackNode
        else {
            stackNode.previous = topNode
            topNode = stackNode
        }
    }

    fun pop(): T? {
        var tempNode = topNode
        topNode = topNode?.previous
        return tempNode?.data
    }

    fun peek(): T? {
        return topNode?.data
    }

}

fun main() {
    var stack = MyStack<Int>()
    stack.push(0)
    stack.push(1)
    stack.push(2)
    stack.push(3)
    stack.push(4)
    while (stack.peek() != null) {
        println(stack.pop())
    }

    var stackString = MyStack<String>()
    stackString.push("h")
    stackString.push("c")
    stackString.push("a")
    stackString.push("r")
    stackString.push("u")
    stackString.push("a")
    stackString.push("s")
    while (stackString.peek() != null) {
        println(stackString.pop())
    }
}