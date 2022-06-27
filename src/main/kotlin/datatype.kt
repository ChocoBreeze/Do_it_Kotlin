/*
val (value) - 불변형 (immutable)
var (variable) - 가변형 (mutable)

val username : String = "Kildong" 선언 키워드 - 변수 이름 - 자료형 - 값

변수 이름 : 숫자로 시작하면 안 된다, 키워드 x, 의미 있는 단어를 사용하자, Camel Expression!
일반 변수 : 단봉 낙타 - camelCase, numberOfBooks, myFirstNumber ...
클래스, 인터페이스 : 쌍봉 낙타 - AnimalCategory, CarEngine ...

기본형 - Primitive data type(가공되지 않은 순수한 자료형으로 프로그래밍 언어에 내장) - int, long, float, double ...
참조형 - Reference type(동적 공간에 데이터를 둔 다음 이것을 참조하는 자료형) - 객체가 된다 - Int, Long, Float, Double ...

성능은 기본형이 더 좋음.
Kotlin은 참조형을 이용. 이후 컴파일을 통해 성능을 위해 기본형으로 변한됨!

*/
fun main() {
    val username: String = "Kildong"
    // username = "Dooly" --> 불변형 변수이므로 변경 x
    var username2 : String = "Kildong"
    username2 = "Dooly"

    var count: Int = 3
    var count2 = 3 // 컴파일러가 타입 추론 가능
    var username3  = "Kildong" // ctrl + shift + p 로 확인 가능
    // var username4 - 자료형 추론 불가능
    var username4 : String // Data형 넣어주면 된다.



    // println문 내에서 $로 변수 접근 가능
    // 변수가 하나인 경우 {} 생략 가능
    println("username: ${username}")
    println("username2: $username2")
    println("username3: $username3, count : $count")
}