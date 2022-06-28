package chap02.section2

fun main() {
    var a = 1
    var str1 = "a = $a"
    var str2 = "a = ${a+2}"
    // 문자열 자체로 만들어 줄 수 있음

    println("str1: \"$str1\", str2: \"$str2\"")
}