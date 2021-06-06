package datastrctures

class MyLinkedList<T>(node: LinkedListNode<T>) {
    var root = node
    private var current: LinkedListNode<T> = root

    class LinkedListNode<T>(inputData: T) {
        var next: LinkedListNode<T>? = null
        var data = inputData
    }

    fun add(nodeData: T) {
        var node = LinkedListNode(nodeData)
        current.next = node
        current = current.next!!
    }

    fun printLinkedList() {
        var current: LinkedListNode<T>? = root
        while (current != null) {
            println(current.data)
            current = current.next
        }
    }

    fun detectCycle(): LinkedListNode<T>? {
        var slowPointer: LinkedListNode<T>? = root
        var fastPointer: LinkedListNode<T>? = root.next
        while (slowPointer != null && fastPointer != null) {
            if (slowPointer == fastPointer) {
                return slowPointer
            } else {
                slowPointer = slowPointer.next
                fastPointer = fastPointer.next?.next
            }
        }
        return null
    }

    fun detectLoopStart(fastPointer: LinkedListNode<T>): T? {

        var startLocal: LinkedListNode<T>? = root
        var fastLocal: LinkedListNode<T>? = fastPointer

        while (startLocal != fastLocal) {
            startLocal = startLocal?.next
            fastLocal = fastLocal?.next
        }

        return startLocal?.data

    }
}

fun main() {
    var linkedList = MyLinkedList(MyLinkedList.LinkedListNode(1))
    linkedList.add(2)
    linkedList.add(3)
    linkedList.add(4)
    linkedList.add(5)
    linkedList.add(6)
    linkedList.printLinkedList()
    linkedList.root.next?.next?.next?.next?.next?.next = linkedList.root.next?.next
    var loopMeetPoint = linkedList.detectCycle()
    println("meet point " + loopMeetPoint?.data)
    println("loop start" + loopMeetPoint?.let { linkedList.detectLoopStart(it) })

}