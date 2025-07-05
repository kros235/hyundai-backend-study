# 현대자동차 Backend Developer 취업 준비

## 📚 학습 목표
- Java Backend 개발 역량 향상
- Spring Framework 마스터
- 현대자동차 Backend Developer 합격

## 📅 학습 일정
- **Day 01**: 개발환경 구축 ✅
- **Day 02**: Java 기본 문법
- **Day 03**: 연산자와 조건문
- ...

## 🛠 기술 스택
- Java 17
- Spring Boot
- MySQL
- Git/GitHub

## Day 02 (2025-06-30) - Java 기본 문법 ✅

### 학습 내용
- **변수와 데이터타입**: byte, short, int, long, float, double, char, boolean, String
- **키보드 입력**: Scanner 클래스를 이용한 사용자 입력 처리
- **형변환**: 자동/강제 형변환, 문자열-숫자 변환

### 주요 개념
- 변수 선언: `타입 변수명 = 값;`
- 상수 선언: `final 타입 상수명 = 값;`
- Scanner 사용법: `Scanner scanner = new Scanner(System.in);`
- 형변환: `(타입)변수`, `Integer.parseInt()`, `String.valueOf()`

### 실습 파일
- `day02/VariablesExample.java`: 변수와 데이터타입 실습
- `day02/InputExample.java`: 키보드 입력 실습  
- `day02/CastingExample.java`: 형변환 실습

### 핵심 포인트
- Java는 강타입 언어로 변수 선언 시 반드시 타입을 명시해야 함
- Scanner 사용 후 `close()` 호출하여 자원 해제
- 큰 타입에서 작은 타입으로 변환 시 데이터 손실 가능성 주의

## Day 03 (2025-07-01) - 연산자와 조건문 ✅

### 학습 내용
- **연산자**: 산술(+,-,*,/,%), 증감(++,--), 비교(==,!=,>,<), 논리(&&,||,!), 대입(=,+=,-=)
- **조건문**: if, if-else, if-else if, switch 문
- **복합 조건**: 논리 연산자를 활용한 조건 결합
- **switch 문**: break와 fall-through 개념

### 주요 개념
- 연산자 우선순위: 괄호 > 증감 > 산술 > 비교 > 논리 > 대입
- if문: `if (조건) { 실행문 }`
- switch문: `switch (변수) { case 값: 실행문; break; }`
- 논리 연산: AND(&&), OR(||), NOT(!)

### 실습 파일
- `day03/OperatorExample.java`: 모든 연산자 종류별 실습
- `day03/ConditionExample.java`: 조건문 패턴별 활용
- `day03/SwitchExample.java`: switch 문 다양한 활용법
- `day03/CarPriceCalculator.java`: 종합 실습 프로젝트

### 핵심 포인트
- 논리 연산자로 복잡한 조건을 간결하게 표현 가능
- switch 문은 break 누락 시 fall-through 발생 주의
- 조건문 중첩 시 가독성을 위한 적절한 들여쓰기 중요

## Day 04 (2025-07-05) - 반복문 (Loop) ✅

### 학습 내용
- **for문**: 초기화, 조건식, 증감식을 이용한 반복 처리
- **while문**: 조건이 참인 동안 반복 실행
- **do-while문**: 최소 1번은 실행하는 반복문
- **중첩 반복문**: 반복문 안의 반복문으로 복잡한 패턴 구현
- **반복문 제어**: break(반복 중단), continue(현재 반복 건너뛰기)

### 주요 개념
- for문 구조: `for (초기화; 조건식; 증감식) { 실행문 }`
- while문 구조: `while (조건식) { 실행문 }`
- do-while 구조: `do { 실행문 } while (조건식);`
- 향상된 for문: `for (타입 변수 : 배열) { 실행문 }`
- 라벨을 이용한 중첩 반복문 제어

### 실습 파일
- `day04/Lessons/ForLoopExample.java`: for문 다양한 활용법
- `day04/Lessons/WhileLoopExample.java`: while/do-while문 실습
- `day04/Lessons/NestedLoopExample.java`: 중첩 반복문과 제어문
- `day04/Quiz/LoopQuiz.java`: 반복문 퀴즈 (4문제)
- `day04/Project/CarInventorySystem.java`: 차량 재고 관리 시스템

### 핵심 포인트
- 무한 루프를 방지하기 위한 종료 조건 설정 중요
- break는 반복문 전체 종료, continue는 현재 반복만 건너뛰기
- 중첩 반복문에서 외부 루프 제어시 라벨 사용
- 배열과 함께 사용할 때 인덱스 범위 주의 (0부터 시작)
- 실무에서는 향상된 for문(for-each)을 많이 활용

### 실무 활용 예시
- 데이터베이스 조회 결과 처리
- 배열/리스트 순회
- 메뉴 시스템 구현
- 사용자 입력 검증
- 파일 데이터 처리