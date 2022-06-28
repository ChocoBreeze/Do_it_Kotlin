package chap02.section2

fun main() {
    var num: Double = 0.1

    for( x in 0..999)  { // 0..999 라고 적으니 부등호 2개로 바뀜
        num += 0.1
    }
    println("num: $num")
    // 지수부 가수부 제한으로 인해 정확한 100이 아닌 100.09999999999859 값이 나옴.
    // 주의 하자!
}