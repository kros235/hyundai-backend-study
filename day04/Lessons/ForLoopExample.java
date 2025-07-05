package day04.Lessons;

public class ForLoopExample {
    public static void main(String[] args) {
        System.out.println("=== 현대자동차 Backend Developer for문 실습 ===\n");
        
        // 1. 기본 for문
        System.out.println("1. 기본 for문 - 1부터 10까지 출력");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        
        // 2. 감소하는 for문
        System.out.println("2. 감소하는 for문 - 10부터 1까지 출력");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        
        // 3. 2씩 증가하는 for문
        System.out.println("3. 2씩 증가 - 짝수 출력");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        
        // 4. 실무 예제 - 직원 급여 계산
        System.out.println("4. 현대자동차 신입 개발자 5명 연봉 계산");
        int baseSalary = 4000; // 기본 연봉 4000만원
        
        for (int employee = 1; employee <= 5; employee++) {
            int yearlyBonus = employee * 100; // 성과에 따른 보너스
            int totalSalary = baseSalary + yearlyBonus;
            System.out.println("개발자" + employee + "번: " + totalSalary + "만원");
        }
        System.out.println();
        
        // 5. 구구단 출력 (7단)
        System.out.println("5. 구구단 7단 출력");
        int dan = 7;
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " × " + i + " = " + (dan * i));
        }
        System.out.println();
        
        // 6. 배열과 for문 (배열 미리 소개)
        System.out.println("6. 현대자동차 차량 모델 출력");
        String[] carModels = {"아반떼", "소나타", "그랜저", "팰리세이드", "코나"};
        
        for (int i = 0; i < carModels.length; i++) {
            System.out.println((i + 1) + ". " + carModels[i]);
        }
        System.out.println();
        
        // 7. 향상된 for문 (for-each)
        System.out.println("7. 향상된 for문으로 차량 모델 출력");
        for (String model : carModels) {
            System.out.println("✅ " + model);
        }
    }
}