package chap03.section1

/*
가변 변수(가변적인 개수의 매개변수)
가변 인자!
동일한 data type인 경우 -> vararg 를 사용 가능

함수 호출 시 메모리!
Heap : 낮은 주소 -> 높은 주소
Stack : 높은 주소 -> 낮은 주소

1. stack에 main()함수의 frame(지역 변수, 항, 스택, 상수, 풀 등)
2. 다른 함수 호출
3. stack에 다른 함수의 frame(지역 변수, 항, 스택, 상수, 풀 등)

함수와 stack은 진입할수록 frame이 쌓이면서 올라가고
사용이 끝난 경우 내려가게 됨.
동적 객체는 heap에 쌓임.
 */

fun normalVarargs(vararg a: Int) { // 하나 이상의 인자 처리 가능
    for(num in a) {
        print("$num ")
    }
}

fun main() {
    normalVarargs(1)
    println()
    normalVarargs(1,2,3,4)
}