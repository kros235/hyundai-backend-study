package Lessons;
public class VariableExample{
    public static void main(String[] args){
        
        // 1. 정수형 변수들
        byte smallNumber    =   127;            // -128 ~ 127
        short mediumNumber  =   32000;          // -32,786 ~ 32,767
        int normalNumber    =   2100000000;     // -2,147,483,648 ~ 2,147,483,647
        long bigNumber      =   9000000000L;     // 매우 큰 수 (L 붙어야 함)

        // 2. 실수형 변수들
        float height        =   175.5f;         //  소숫점 7자리 (f 붙여야 함)
        double weight       =   70.25;

        // 3. 문자형 변수
        char grade          =   'A';            //  단일 문자 (작은 따옴표)

        // 4. 논리형 변수
        boolean isStudent   =   true;           //  true of false

        // 5. 문자열 ( 참조 타입 )
        String name         =   "김현대";         //  문자열 ( 큰 따옴표 )
        String company      =   "현대 자동차";     

        // 변수 출력해보기
        System.out.println("=== 개인 정보 ===");
        System.out.println("이름    : " + name);
        System.out.println("회사    : " + company);
        System.out.println("키      : " + height + "cm");
        System.out.println("몸무게  : " + weight + "kg");
        System.out.println("학점    : " + grade);
        System.out.println("학생 여부 : " + isStudent);

        // 변수 값 변경해보기
        System.out.println("\n=== 1년 후 ===");
        weight      =   68.5;
        isStudent   =   false;

        System.out.println("몸무게   : " + weight + "kg (다이어트 성공!)");
        System.out.println("학생 여부 : " + isStudent + "(졸업!)");

        // 상수 선언 (final 키워드 - 값 변경 불가)
        final String BIRTH_YEAR = "1995";
        System.out.println("출생년도 : " + BIRTH_YEAR + "년");
        // BIRTH_YEAR = "1996";     //  오류! 상수는 값 변경 불가
    }
}