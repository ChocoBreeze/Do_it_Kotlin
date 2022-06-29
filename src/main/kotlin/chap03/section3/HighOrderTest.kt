package chap03.section3

/*
코틀린은 멀티 패러다임 언어
함수형 프로그래밍(FP)
객체 지향 프로그래밍(OOP)

<함수형 프로그래밍>
코드 간략, 테스트나 재사용성 증가
람다식, 고차 함수를 사용해 구성 (함수형 프로그래밍의 대표적인 특징)
순수 함수

함수 자체를 함수에 넣을 수도 있다..!
빠져나오는 것도 함수일 수 있다.

pure function(순수 함수) 이해
= 부작용(side effect)이 없는 함수.
-> 동일한 입력의 경우 항상 같은 결과를 출력!
-> 값이 예측 가능해야 함(deterministric)
fun sum(a:Int, b: Int) = a+b 는 순수 함수임!

순수 함수의 조건 -> 함수를 전달하기 위해 필요한 개념!(주고 받기) - 람다식에 사용하기 위해
1. 같은 인자에 대해 항상 같은 값을 반환
2. 함수 외부의 어떤 상태도 바꾸지 않음

순수 함수를 왜?
입력과 내용을 분리하고 프로그램을 모듈화 가능 -> 재사용성이 높아짐
(여러 함수들과 조합해도 부작용이 없다)
특정 상태에 영향을 주지 않으므로 병행 작업(함수 중 함수) 시 안전하다.
함수의 값을 추적하고 예측할 수 있기 때문에 test, debugging 등이 유리하다.

함수형 프로그래밍에 적용
- 함수를 매개변수로 쓰기, 인자에 혹은 반환값에 적용하기 (고차 함수)
- 함수를 변수나 데이터 구조에 저장
- 유연성 증가
함수형 프로그래밍은 함수 자체를 가지고 변수 다루듯이 조합 가능
-> 읽기에는 어려울 수 있으나(코드 복잡) 유연성 상승, 짧은 코드가 가능(재사용성의 증가)

람다식(lambda expression)
- 익명 함수의 하나의 형태로 이름 없이 사용 및 실행이 가능
- 람다 대수(lambda calculus)로부터 유래
Ex) { x, y -> x + y } // 람다식의 예 (이름이 없는 함수 형태)

람다식의 이용
- 람다식은 고차 함수(함수에 함수 넣기)에서 인자로 넘기거나 결과값으로 반환 등을 할 수 있음.

일급 객체(First Class Citizen) -> 할 수 있는 일이 많다..
- 일급 객체는 함수의 인자로 전달 가능
- 일급 객체는 함수의 반환값에 사용 가능
- 일급 객체는 변수에 담을 수 있음
코틀린에서 함수는 1급 객체로 다룸.(=1급 함수라고도 한다)

고차 함수(high-order function) : 함수에 또 다른 함수를 넣을 수 있다.
fun highFunc(sum : (Int, Int) -> Int, a: Int, b: Int) : Int = sum(a,b)
sum : (Int, Int) -> Int 인 형태만 받는다.
(정수형 매개변수 -> a: Int, b: Int)
println(highFunc({ x, y -> x + y}, 10, 20)) // 람다식 함수를 인자에 넘김.

함수형 프로그래밍을 왜 사용해야 하나요?
- 프로그램을 모듈화 -> 디버깅이나 테스트가 쉬움(모듈 단위로!)
- 간략한 표현식(람다식)을 사용해 생산성이 높음
- 람다식과 고차함수를 사용하면서 다양한 함수 조합을 사용 가능함

정리)
함수형 프로그래밍은 순수 함수를 조합해 상태 데이터 변경이나 부작용이 없는 루틴을 만들어 내며 이름 없는 함수 형태의 하나인 람다식을 이용해
함수를 변수처럼 매개변수, 인자, 반환값 등에 활용하는 고차 함수를 구성해 생산성을 높인 프로그래밍 방법

high order function : 고차함수
고차함수의 경우 람다식이 존재하는 경우 마지막 매개변수에 넣는 것이 좋다.
이유 : 중괄호를 오른쪽 밖으로 빼낼 수 있다.(모양이 예쁘다..)
식이 길어지는 경우 중괄호 안의 내용을 여러 줄에 적을 수도 있다.
 */

// sum 매개변수를 람다식으로 넣기
// sum : (Int, Int) -> Int
fun highFunc(sum : (Int, Int) -> Int,a : Int, b : Int) : Int {
    return sum(a, b)
}

fun highFunc2(a: Int, b: Int, sum : (Int, Int) -> Int) : Int {
    return sum(a, b)
}

fun main() {
    // 람다식 -> {}로 적기
    val result = highFunc({x, y -> x + y}, 1, 3)
    println(result) // 4

    val result2 = highFunc2(1, 3) {x, y ->
        x + y
    }
    println(result2) // 4
}