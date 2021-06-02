package datastrctures

import java.lang.UnsupportedOperationException
import java.util.*


class MyArrayList<T> : Iterable<T> {
    private var size = 0
    private val CAPACITY = 10
    private var elements: Array<Any?>

    init {
        elements = arrayOfNulls(CAPACITY)
    }


    fun add(e: T?) {
        if (size === elements.size) {
            ensureCapacity()
        }
        elements[size++] = e
    }

    private fun ensureCapacity() {
        val newSize: Int = elements.size * 2
        elements = elements.copyOf(newSize)
    }

    operator fun get(i: Int): T? {
        if (i >= size || i < 0) {
            throw IndexOutOfBoundsException("Index: $i, Size $i")
        }
        return elements[i] as T?
    }

    override fun iterator(): MutableIterator<T> {
        return object : MutableIterator<T> {
            var index = 0
            override fun hasNext(): Boolean {
                return index < size
            }

            override fun next(): T {
                return elements[index++] as T
            }

            override fun remove() {
                throw UnsupportedOperationException()
            }
        }
    }
}

fun main() {
    var myArrayList = MyArrayList<String>()
    myArrayList.add("1");
    myArrayList.add("2");
    myArrayList.add("3");
    myArrayList.add("4");
    myArrayList.add("5");
    myArrayList.add("6");
    myArrayList.add("7");
    myArrayList.add("8");
    myArrayList.add("9");
    myArrayList.add("10");
    myArrayList.add("11");
    myArrayList.add("12");
    myArrayList.add("13");
    myArrayList.add("14");
    myArrayList.add("15");
    myArrayList.add("16");
    myArrayList.add("17");
    myArrayList.add("18");
    myArrayList.forEach {
        println(it)
    }
}