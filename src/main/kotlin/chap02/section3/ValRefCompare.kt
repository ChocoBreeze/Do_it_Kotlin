/*
코틀린은 참조형을 사용
자료형 간 변환 -> 변환 과정이 필요(변환 메서드).
toByte, toLong, toShort, toFloat, toInt, toDouble, toChar
표현식에서 자료형의 자동 변환
val result = 1L + 3 // Long + Int -> Long(컴파일러의 추론)

비교
== : 값만 비교
=== : 값과 참조 주소를 비교
Java에서는 ==가 값과 참조 주소 비교!(주의)

nullable과 non-null은 서로 다르다!
nullable : 참조형 (코틀린에서는 선언한 변수의 값이 -128~127 범위인 경우 캐시에 그 값을 저장함)
-> 캐시에 담긴 경우 참조형에 대한 연산 수행 결과가 다 같을 수 있음.
해당 범위가 아닌 경우에만 객체 생성함!

컴파일러가 추론을 통해 자료형 결정
추론 불가능한 값 -> 자료형 명시가 필요
Number형은 숫자를 저장하기 위한 특수한 자료형으로 스마트 캐스팅됨.
(Int, Long, ...)

is 키워드를 사용한 검사

Any (모든 클래스의 뿌리)
자료형이 정해지지 않은 경우 - 어떤 타입이라도 가능!
언제든 필요한 자료형으로 자동 변환 (스마트 캐스팅)

*/
package chap02.section3

fun main() {
    val a: Int = 128 // 값
    // val b : Double = a.toDouble() - 형 변환
    val b = a // 값

    println(a==b) // true
    println(a===b) // true

    val c: Int? = a // 주소
    val d: Int? = a // 주소
    val e: Int? = c // 주소

    // Int? : 기본형이 아닌 객체 -> 동적 공간에 저장
    // c, d에 저장된 것은 실제 stack에 객체를 가리키는 주소가 들어감
    // 값은 같으나 위치는 다르다(주소 공간이 다르다)!
    println(c==d) // true
    println(c===d) // false

    println(c===e) // true - 같은 공간을 가리킨다

    val p: Int = 128
    val q: Int = 128
    val r: Int? = 128
    println(p==q) // true
    println(p===q) // true
    println(p==r) // true
    println(p===r) // false
    // p는 기본형(stack), q는 객체(heap)

    // Number형 사용
    var test: Number = 12.2
    test = 12 // Int 형으로 스마트 캐스트
    test = 120L // Long 형으로 스마트 캐스트
    test +=12.0f // Float형으로 스마트 캐스트
    // test = "Hello" 는 불가능!

    // is 키워드를 사용한 검사
    val num = 256
    if (num is Int) {
        print(num)
    }
    else if(num !is Int) {
        print("Not a Int")
    }

    // Any -> 함수 만들 때도 이용 가능!
    var x : Any = 1 // Int
    x = 20L // Long
    x = "Hello" // String
    println("x : $x type : ${x.javaClass}") // 자바 기본형(type)을 알 수 있음.
    CheckArg(x)
}

fun CheckArg(x:Any) {
    if(x is String) {
        println("String!")
    }
    if(x is Int) {
        println("Int")
    }
}