package chap03.section1

/*
목표 : 하나 이상의 실수를 받아서 모든 실수의 합의 평균을 구하고 출력 하려고 합니다.
조건 :
1. 초기값을 위한 인자는 Float형
2. 초기값은 두번째 부터 나열된 인자의 최종 평균 결과에 더함
3. 초기값에 아무런 인자를 입력하지 않으면 0을 기본 사용
4. 두번째부터 받아들일 인자는 가변형 인자로 모두 실수형 Float
5. 반환값은 모든 인자의 평균값으로 마찬가지로 실수형 Double
*/

fun avgFunc(initial : Float = 0f, vararg numbers : Float) : Double {
    var result = 0f
    for(num in numbers) {
        result += num
    }
    println("result: $result, numbers.size: ${numbers.size}")
    val avg : Double = (result + initial).toDouble() / (numbers.size + 1)
    return avg
}

fun main() {
    val result = avgFunc(5f, 100f, 90f, 80f)
    println("avg result : $result")
}