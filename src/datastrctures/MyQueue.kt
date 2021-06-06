package datastrctures

class MyQueue<T> {
    var front: MyQueueNode<T>? = null
    var tail: MyQueueNode<T>? = null

    class MyQueueNode<T>(inputData: T) {
        var data = inputData
        var previous: MyQueueNode<T>? = null
    }

    fun push(data: T) {
        var myQueueNode = MyQueueNode(data)

        if (front == null) {
            //Empty State
            front = myQueueNode
            tail = myQueueNode
        } else {
            tail?.previous = myQueueNode
            tail = myQueueNode
        }
    }

    fun pop(): T? {
        return if (front == tail == null) {
            null
        } else {
            var temp = front
            front = temp?.previous
            temp?.data
        }
    }

    fun peek(): T? {
        return front?.data
    }

}

fun main() {
    var queue = MyQueue<String>()
    queue.push("s")
    queue.push("a")
    queue.push("u")
    queue.push("r")
    queue.push("a")
    queue.push("c")
    queue.push("h")

    while (queue.peek() != null) {
        println(queue.pop())
    }


}