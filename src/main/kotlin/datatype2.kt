/*
접미사나 접두사를 통해 원하는 타입으로 정할 수 있음.
*/

fun main() {
    val num05 = 127  // (Int형으로 수용 가능한 경우는 Int형으로 추론)
    val exp01 = 123L // (Long)
    val exp03 = 0x0F
    val exp04 = 0b00001011
    val exp10 : Short = 32767
    val uint : UInt = 153u
    val ulong : ULong = 46322352uL
    val cardNum = 1234_1234_1234_1234L // 읽기 쉽게 하기 위해 이렇게도 써도 됨.,
    val exp11 = 3.14 // double - 64 bit
    val exp12 = 3.24F // Float (or : Float 표기) - 32 bit
    val exp13 = 3.14E+16 // 3.14 * 10^16
}