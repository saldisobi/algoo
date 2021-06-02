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
}

fun main(){
    var linkedList = MyLinkedList(MyLinkedList.LinkedListNode(1))
    linkedList.add(2)
    linkedList.add(3)
    linkedList.add(4)
    linkedList.add(5)
    linkedList.add(6)
    
    linkedList.printLinkedList()
}