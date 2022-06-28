package chap02.section2

fun main() {
    var str1 : String = "Hello"
    var str2 = "World"
    var str3 = "Hello"
    // === 는 참조 비교, ==는 값을 비교
    // var 대신 val해도 같은 결과임
    println("str1 == str2 : ${str1 == str2}") // false
    println("str1 === str2 : ${str1 === str2}") // false
    println("str1 === str3 : ${str1 === str2}") // false
    println("str1 === str3 : ${str1 === str3}") // true (메모리 공간은 똑같음)
}