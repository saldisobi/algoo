package linkedlist.problems

class LinkListReverse {


    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    fun reverseList(head: ListNode?): ListNode? {

        var current = head

        var previous: ListNode? = null

        while (current != null) {
            var next = current.next
            current.next = previous
            previous = current
            current = next
        }

        return previous
    }
}

fun main() {
    val head = LinkListReverse.ListNode(1)
    head.next = LinkListReverse.ListNode(2)
    head.next?.next = LinkListReverse.ListNode(3)
    head.next?.next?.next = LinkListReverse.ListNode(4)
    head.next?.next?.next?.next = LinkListReverse.ListNode(5)

    var current = LinkListReverse().reverseList(head)

    while (current!=null){
        println(current.`val`)
        current = current.next
    }

}