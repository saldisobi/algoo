package datastrctures

class DoublyLinkedList<T> {
    var rootNode: DoublyNode<T>? = null

    class DoublyNode<T>(localData: T) {
        var data = localData
        var next: DoublyNode<T>? = null
        var previous: DoublyNode<T>? = null
    }

    fun put(data: T) {
        var node = DoublyNode(data)
        if (rootNode == null)
            rootNode = node
        else {
            var current = rootNode
            while (current?.next != null) {
                current = current.next;
            }
            current?.next = node
            node.previous = current

        }
    }

    fun print() {
        if (rootNode == null) {
            println("Please initialize first")
        } else {
            var current = rootNode;
            while (current != null) {
                println("previous = ${current.previous?.data} this = ${current.data}")
                current = current.next
            }
        }
    }

}

fun main() {
    var doublyLinkedList = DoublyLinkedList<Int>()
    doublyLinkedList.put(0)
    doublyLinkedList.put(1)
    doublyLinkedList.put(2)
    doublyLinkedList.put(3)
    doublyLinkedList.print()
}