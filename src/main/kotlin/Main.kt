import java.util.*

fun main() {
    val (a, b, m, n) = readln().split(" ").map { it.toDouble() }
    println(if((a >= m && b >= n) || (a >= n && b >= m)) "YES" else "NO")
    repeat(5) {

    }
}

fun main2() {

    val sc = Scanner(System.`in`)
    val number = sc.nextInt()

    val (a,b,c,d,r) = readln().split(" ").map { it.toInt() }
    val numbers = 1..10 // [1,10] Range
    for(i in numbers) {
        println(i)
    }
    val arr = arrayOf(1,2,3,4,5)
    for(j in arr.indices) {
        println(arr[j])
    }
    val res = if(a>100) 9 else 10
    val result2 = when {
        a>100 -> println("123")
        else -> println("else")
    }
    when(a) {
        4,5,3 -> println("....")
        1 -> {
            if(true) println("123123")
        }
    }


    var x : Int? = 100
    x = 200
    x = null

    var str: String? = "Test"
    str = null
    //val l = str?.length
   // val l = if (str != null) str?.length else -1

    val l = str?.length ?: -1 // Elvis operator

    // JVM - Java Virtual Machine
    // Linux(Unix), Mac, Windows
    println("Hello world!")
}