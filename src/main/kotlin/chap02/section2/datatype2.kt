/*
접미사나 접두사를 통해 원하는 타입으로 정할 수 있음.
음수는 2의 보수 표현을 사용해 연산됨. (환형 형태의 데이터 저장)
덧셈(가산) 회로만으로써 수 표현이 가능(뺄셈도).
논리형 - Boolean : true, false만 존재
문자 : Char
문자열 : String - 동적 공간(Heap)의 String Pool에 들어감.
일단 생성된 메모리 공간의 "Hello"는 변경 불가능
var 변수로 가리키는 경우 참조 주소가 변경 가능(다른 것으로 지정 가능)
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
    val isOpen = true
    val isUploaded : Boolean
    val ch = 'c' // \u0000 ~ \uffff 까지 + 다국어(유니코드)
}