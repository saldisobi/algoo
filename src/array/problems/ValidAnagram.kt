package array.problems

class ValidAnagram {

    public fun isValidAnagram(s1: String, s2: String): Boolean {
        if (s1.length != s2.length)
            return false

        var store = Array(26) { 0 }

        s1.toCharArray().forEach {

            store[it - 'a']++

        }

        s2.toCharArray().forEach {
            store[it - 'a']--
        }

        store.forEach {
            if (it != 0) {
                return false
            }
        }

        return true;
    }
}

fun main() {
    println(ValidAnagram().isValidAnagram("cat", "act"))
}