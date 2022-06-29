package chap03.section1
/*
함수 : Box

fun 키워드를 이용
fun main : 진입점!

fun 함수 이름([변수 이름 : 자료형, 변수 이름: 자료형..]) : [반환값의 자료형] {
	표현식...
	[return 반환값]
}
반환값이 없음을 나타내는 것 : Unit(반환값의 자료형을 표시 안 하는 경우)

최상위(Top-level) 함수 특징 : sum이라는 이름은 main의 위 혹은 아래에 두더라도 해당 이름을
main 안에서 사용 가능함.

지역 함수.
main 안에서도 함수 정의가 가능한데, 반드시 정의 후에 사용해야 함.

함수 정의 시 적는 것들 -> parameter(매개 변수)
함수 호출 시 적는 값들 -> arguments(인자)

함수 매개변수에 default 매개변수도 가능
 */

// sum, sum3, sum4 는 모두 같음!
fun sum(a: Int, b: Int) : Int { // 최상위 함수
    return a + b // 반환 타입을 안 적을 경우 반환 없는 경우로 간주됨!
}
fun sum3(a: Int, b: Int) : Int = a + b
fun sum4(a: Int, b: Int) = a + b

// max와 max1은 같음
fun max(a: Int, b: Int) : Int {
    return if(a > b) a else b
}
fun max1(a: Int, b: Int) = if (a>b) a else b

// outfunc, outfunc2, outfunc3는 같음
fun outfunc(name: String) { // 반환형이 없는 타입
    println("Name : $name")
    // return Unit // 반환하고 있으나 생략 가능함!
    // 마찬가지로 (: Unit)도 생략 가능함
}
fun outfunc2(name:String) : Unit = println("Name: $name")
fun outfunc3(name:String) = println("Name: $name")

// default parameter
fun sum_default(a : Int, b:Int = 5) = a + b
fun sum_default2(a : Int = 2, b : Int=5) = a + b

fun main() { // 진입점 역할하는 함수 - 최상위(Top - level) 함수
    val result1 = sum(2,3)
    println(result1)

    fun sum1(a: Int, b: Int) : Int { // 지역 함수
        return a + b // 반환 타입을 안 적을 경우 반환 없는 경우로 간주됨!
    }

    val result2 = sum1(3,4)
    println(result2)

    // a, b는 max의 매개변수 a,b와 다르다.
    val a = 3
    val b = 5

    val result3 = max(a, b) // 값이 매개변수에 복사되어 쓴다
    println(result3)

    outfunc("Kildong")

    val result4 = sum_default(2)
    println(result4) // 2 + 5 = 7

    val result5 = sum_default2() // 2 + 5
    println(result5)

    val result6 = sum_default2(b = 2) // b만 매개변수 지정 가능!
    println(result5)
}

