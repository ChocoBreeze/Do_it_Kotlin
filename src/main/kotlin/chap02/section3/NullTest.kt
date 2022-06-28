/*
코틀린의 변수 선언은 기본적으로 null을 허용하지 않음.
기본적으로 Not Null, Nullable 표현에만 '?'가 사용된다.
null 가능한 선언 (?를 통해서 선언 가능)
String과 String?는 다르다!

val a : Int
val b : String
--> 꼭 초기화가 되어야 함(null x)
val a : Int? = null
val b : String? = null
--> null일 수 있으니 check 필요.

NPE (NullPointerException)
사용할 수 없는 null인 변수에 접근하면서 발생하는 예외

// elvis 연산자
*/
package chap02.section3

fun main() {
    var str1: String // 초기화 없이 출력 -> 컴파일에서도 막음
    // str1 = null 허용 x
    str1 = "hello"
    var str2: String?
    str2 = null // null 허용
    println(str1)
    println(str2)
    // str2가 null 가능성이 있으므로 null 검사하거나 safe call이 필요함.
    // safe call : null인 경우 실행하지 x(null 리턴)
    println("str2: $str2, length : ${str2?.length}")
    str2="Hello"
    println("str2: $str2, length : ${str2?.length}")
    // !!(non-null 단정 기호) : null이 아닐 거라도 단정 후 실행. -> 위험하다!(NPE 발생 가능 - 쓰지 말자)
    println("str2: $str2, length : ${str2!!.length}")

    var str3 : String? = null
    var len = str3?.length ?: -1 // elvis 연산자 - safe call에 의해 null인 경우 -1 아니면 length
    println("str3: $str3, length: $len")
    str3 = "hello"
    len = if (str3!=null) str3.length else -1 // 1 줄에 if문 처리 가능
    println("str3: $str3, length: $len")
}