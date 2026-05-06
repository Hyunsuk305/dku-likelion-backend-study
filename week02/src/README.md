## **변수**

- String 같은 참조형 변수는 int, double 등의 기본형 변수와 다르게 heap에 할당
- 1개의 변수에는 1개의 값만 할당

## 변수형과 자료형 - 정수형

- byte(1 byte = 8bit): -2^7 ~ 2^7 - 1 (-128 ~ 127)
- short(2bytes): -2^15 ~ 2^15 - 1 (-32,768 ~ 32,767)
- int(4 bytes): -2^31 ~ 2^31 - 1
- long(8 bytes): -2^63 ~ 2^63 - 1

## 변수형과 자료형 - 실수형

- double(8 bytes): 소수점 15자리까지
- float(4 bytes): 소수점 7자리까지

## 변수형과 자료형 - 문자형

- char(2 bytes): ‘ ‘로 감, ‘a’랑 97이 똑같이 a로 출력 = 아스키코드 참조

## 변수형과 자료형 - 논리형

- boolean(1 byte): true = 참, false = 거짓, 0이나 1의 값 대입 불가

## 변수형과 자료형 - 참조형

- 참조형 데이터의 값은 heap 메모리 영역에 저장
- 변수에 대입되는 값은 heap 메모리 영역의 주소

## 변수형과 자료형 - 상수

- 상수(constants, final variables)
- 한 번 값이 할당되면 재할당 불가, 전체를 대문자로 표시, 구분은 _
- final [데이터]

## 변수형과 자료형 - 형변환

- byte < short < int < long <<< float < double
- int a = 128; 처럼 범위 넘었을 때 short b  = (short) a;
- double c = 10.331235645; float d = (float) c; 하면 표현할 수 있는 범위에서 표현
- int e = 10; short f =  20; short g =(short) e + f; 는 오류, (short) (e + f)로 표현해야 함

## 변수형과 자료형 - String

- String = 문자열 객체
- new() 생성자와 문자열 리터럴은 다른 값
- StrinBuilder sbr = new StringBuilder(”Hello!”); sbr.append(”World!”); System.out.println(sbr.toString());
- str.indexOf() 으로 인덱스 출력
- str.substring(4, 7) 이면 index 4부터 7까지 출력
- .equalsIgnoreCase()로 대소문자 구분 없애서 비교
- 양쪽 끝 공백 있을 경우 .trim으로 없앰
- 가운데 공백 있을 경우 .replace(” “, “”)
- .nextLine() 입력 받아서 문자열 형태로 사용

## 연산자

- &&: 교집합, ||: 합집합, !: 여집합

## 변수형과 자료형 - 자료구조

- Map: 키-값 쌍을 요소로 가지는 데이터 모음, 순서 구분 없음

## 함수

- 어떠한 값이 넘겨지거나 아무 값도 넘겨지지 않았을 때 작업을 수행한 후 반환하거나 혹은 반환하지 않고 종료