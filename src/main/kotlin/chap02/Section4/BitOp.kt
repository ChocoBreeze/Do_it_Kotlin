package chap02.Section4
/*
4.shl(bits) : (<<)4를 표현하는 비트를 bits만큼 왼쪽으로 이동 == 4 shl 3(중위 표현법)
4.shl(3) = 32(8배)
7.shr(bits) : (>>)
7.shr(2) = 1
12.ushr(bits) (unsigned shr - 부호 bit 유지 x)
9.and(bits) : 9와 & 연산
9.or(bits) : 9와 | 연산
24.xor(bits) : 24와 ^ 연산
78.inv() : 값을 뒤집기(!)
*/

fun main() {
    val x = 4 // 10진 표기 = 0100(2)
    val y = 0b0000_1010 // =5(10) 2진 표기 - 읽기 쉽도록 4자리마다 _ 넣기
    val z = 0x0f // 0b0000_1111(2) = 15(10) 16진 표기
    // 2진, 16진 표기 - 기계가 편함 (둘이 변환이 빠르다)
    // 16진수의 한 자리 = 2진수의 4자리!

    // 둘 다 같은 표현
    // 16(10) 0100 -> 0001_0000
    println("x shl 2 -> ${x shl 2}")
    println("x shl 2 -> ${x.shl(2)}" )

    println("x inv -> ${x.inv()}")
    // 중위 표현 불가능 1111...1011이 된다. 부호가 존재하므로 -5가 나옴.
}