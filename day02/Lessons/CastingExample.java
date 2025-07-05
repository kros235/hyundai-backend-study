package Lessons;
public class CastingExample{
    public static void main(String[] agrs){
        System.out.println("=== 형변환 실습 ===");

        // 1. 자동 형 변환 (묵시적 형변환)
        // 작은 타입 -> 큰 타입으로 자동 변환
        int intValue        =   100;
        long longValue      =   intValue;   //  int ->  long (자동)
        double doubleValue  =   intValue;   //  int ->  double(자동)

        System.out.println("자동 형변환 : ");
        System.out.println("int : " + intValue);
        System.out.println("long : " + longValue);
        System.out.println("double : " + doubleValue);

        // 2. 갖에 형 변환 (명시적 형 변환)
        // 큰 타입 -> 작은 타입 ( 데이터 손실 가능 )
        double pi   =   3.14159;
        int intPi   =   (int)pi;            //  double -> int (소수점 버림)

        System.out.println("\n강제 형 변환: ");
        System.out.println("double : " + pi);
        System.out.println("int : " + intPi + " (소수점 버림)");

        // 3. 문자열 변환
        // 숫자 -> 문자열
        int number = 2025;
        String strNumber    =  String.valueOf(number);
        String strNumber2   =   number + "";

        System.out.println("\n숫자 -> 문자열: ");
        System.out.println("원본 : " + number + " (타입: int)");
        System.out.println("변환1 : " + strNumber + " (타입: String)");
        System.out.println("변환2 : " + strNumber2 + " (타입: String)");

        // 문자열 -> 숫자
        String strAge           =    "25";
        String strSalary        =    "3500.5";

        int age       =   Integer.parseInt(strAge);
        double salary =   Double.parseDouble(strSalary);

        System.out.println("\n문자열 -> 숫자: ");
        System.out.println("나이: " + age + "세 (String -> int)");
        System.out.println("연봉: " + salary + "만원 (String -> Double)");

        // 4. 실무에서 자주 사용하는 예제
        System.out.println("\n=== 실무 예제 : 현대차 신입사원 정보 ===");

        String empId         =   "20250001";
        String empName       =   "김백엔드";
        String baseSalary    =   "4000";        //  문자열로 받았다고 가정

        // 사번을 숫자로 변환해서 다음 사번 생성
        int nextEmpId        =  Integer.parseInt(empId) + 1;

        // 기본급을 숫자로 변환해서 총 연봉 계산 ( 기본급 * 12개월 * 1.5 )
        double totalSalary   = Double.parseDouble(baseSalary) * 12 * 1.5;

        System.out.println("현재 사번 : " + empId);
        System.out.println("다음 사번 : " + nextEmpId);
        System.out.println("직원명 : " + empName);
        System.out.println("월 기본급 : " + baseSalary + "만원");
        System.out.println("예상 연봉: " + totalSalary + "만원");

        // char 와 int 변환
        char grade      =   'A';
        int gradeCode   =   (int)grade;         //  ASCII 코드 값

        System.out.println("\n학점 : " + grade + " (ASCII: " + gradeCode + ")");
    }
}