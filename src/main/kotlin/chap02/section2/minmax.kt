package chap02.section2

// 한 줄 복사 : ctrl + d
// 다중 선택 : alt + shift + 더블클릭

/*
Byte : -128 ~ 127
Int : -2147483648 ~ 2147483647
Short : -32768 ~ 32767
Long : -9223372036854775808 ~ 9223372036854775807
Float : 1.4E-45 ~ 3.4028235E38
Double : 4.9E-324 ~ 1.7976931348623157E308
*/

fun main() {
    println("Byte : ${Byte.MIN_VALUE} ~ ${Byte.MAX_VALUE}")
    println("Int : ${Int.MIN_VALUE} ~ ${Int.MAX_VALUE}")
    println("Short : ${Short.MIN_VALUE} ~ ${Short.MAX_VALUE}")
    println("Long : ${Long.MIN_VALUE} ~ ${Long.MAX_VALUE}")
    println("Float : ${Float.MIN_VALUE} ~ ${Float.MAX_VALUE}")
    println("Double : ${Double.MIN_VALUE} ~ ${Double.MAX_VALUE}")
}