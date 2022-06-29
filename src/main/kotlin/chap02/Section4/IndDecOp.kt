package chap02.Section4

/*
기본 연산자
- 산술, 대입, 증가, 감소, 비교, 논리 연산자 등
val result = num1 + num2

++num과 num++의 차이

JAVA : ==으로 값과 참조 동시에 비교
Kotlin : ===으로 참조가 같읕지 !==으로 참조가 다른지 확인

*/

fun main() {
    var a: Int = 10
    var b: Int = 10

    var result1 = ++a
    var result2 = b++

    println("result1 : $result1, result2 : $result2") // 11 10
    println("a : $a, b : $b")
}