package day03.Lessons;

public class OperatorExample {
    public static void main(String[] args) {
        System.out.println("=== 현대자동차 Backend Developer 연산자 실습 ===\n");
        
        // 1. 산술 연산자
        int salary = 4000;  // 월급 400만원
        int months = 12;
        int bonus = 1000;   // 보너스 100만원
        
        System.out.println("1. 산술 연산자");
        System.out.println("월급: " + salary + "만원");
        System.out.println("연봉: " + (salary * months) + "만원");
        System.out.println("총 수입: " + (salary * months + bonus) + "만원");
        System.out.println("월 평균 수입: " + ((salary * months + bonus) / months) + "만원");
        System.out.println("보너스 비율: " + (bonus % (salary * months)) + "\n");
        
        // 2. 증감 연산자
        System.out.println("2. 증감 연산자");
        int projectCount = 5;
        System.out.println("현재 프로젝트 수: " + projectCount);
        System.out.println("전위 증가(++projectCount): " + (++projectCount));
        System.out.println("후위 증가(projectCount++): " + (projectCount++));
        System.out.println("최종 프로젝트 수: " + projectCount + "\n");
        
        // 3. 비교 연산자
        System.out.println("3. 비교 연산자");
        int myAge = 28;
        int requiredAge = 25;
        
        System.out.println("내 나이: " + myAge + "세");
        System.out.println("지원 가능 나이: " + requiredAge + "세 이상");
        System.out.println("나이 >= 지원조건: " + (myAge >= requiredAge));
        System.out.println("나이 == 28: " + (myAge == 28));
        System.out.println("나이 != 30: " + (myAge != 30) + "\n");
        
        // 4. 논리 연산자
        System.out.println("4. 논리 연산자");
        boolean hasJavaSkill = true;
        boolean hasSpringSkill = true;
        boolean hasExperience = false;
        
        System.out.println("Java 스킬: " + hasJavaSkill);
        System.out.println("Spring 스킬: " + hasSpringSkill);
        System.out.println("경험 3년 이상: " + hasExperience);
        
        // AND 연산자 (모두 true여야 true)
        boolean basicQualified = hasJavaSkill && hasSpringSkill;
        System.out.println("기본 자격 충족(Java && Spring): " + basicQualified);
        
        // OR 연산자 (하나라도 true면 true)
        boolean anySkill = hasJavaSkill || hasSpringSkill;
        System.out.println("기술 스킬 보유(Java || Spring): " + anySkill);
        
        // NOT 연산자 (true <-> false 반전)
        boolean isNewbie = !hasExperience;
        System.out.println("신입 개발자(!경험): " + isNewbie + "\n");
        
        // 5. 대입 연산자
        System.out.println("5. 대입 연산자");
        int score = 85;
        System.out.println("초기 점수: " + score);
        
        score += 10;  // score = score + 10
        System.out.println("점수 += 10: " + score);
        
        score -= 5;   // score = score - 5
        System.out.println("점수 -= 5: " + score);
        
        score *= 2;   // score = score * 2
        System.out.println("점수 *= 2: " + score);
        
        score /= 4;   // score = score / 4
        System.out.println("점수 /= 4: " + score);
        
        // 6. 연산자 우선순위 예제
        System.out.println("\n6. 연산자 우선순위");
        int a = 10, b = 20, c = 30;
        int result1 = a + b * c;        // 곱셈이 먼저: 10 + (20 * 30)
        int result2 = (a + b) * c;      // 괄호가 먼저: (10 + 20) * 30
        
        System.out.println("a + b * c = " + result1);
        System.out.println("(a + b) * c = " + result2);
    }
}