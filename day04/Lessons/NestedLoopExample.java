package day04.Lessons;

public class NestedLoopExample {
    public static void main(String[] args) {
        System.out.println("=== 현대자동차 Backend Developer 중첩 반복문 실습 ===\n");
        
        // 1. 기본 중첩 for문 - 구구단 전체
        System.out.println("1. 구구단 2단~9단 출력");
        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("=== " + dan + "단 ===");
            for (int num = 1; num <= 9; num++) {
                System.out.println(dan + " × " + num + " = " + (dan * num));
            }
            System.out.println();
        }
        
        // 2. 별 패턴 출력 - 우상향 삼각형
        System.out.println("2. 별 패턴 - 우상향 삼각형");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("⭐");
            }
            System.out.println();
        }
        System.out.println();
        
        // 3. 숫자 패턴 출력
        System.out.println("3. 숫자 패턴 출력");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        // 4. 현대자동차 부서별 직원 정보
        System.out.println("4. 현대자동차 부서별 직원 수");
        String[] departments = {"Backend", "Frontend", "Mobile", "DevOps"};
        int[] employees = {8, 6, 4, 3};
        
        for (int dept = 0; dept < departments.length; dept++) {
            System.out.println(departments[dept] + " 개발팀:");
            for (int emp = 1; emp <= employees[dept]; emp++) {
                System.out.print("  👨‍💻 개발자" + emp + " ");
                if (emp % 4 == 0) System.out.println(); // 4명씩 줄바꿈
            }
            System.out.println("\n");
        }
        
        // 5. break 사용 예제
        System.out.println("5. break 사용 - 특정 조건에서 반복 중단");
        System.out.println("1부터 100까지 중 첫 번째 3의 배수 찾기:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("찾았습니다: " + i);
                break; // 반복문 즉시 종료
            }
        }
        System.out.println();
        
        // 6. continue 사용 예제
        System.out.println("6. continue 사용 - 특정 조건 건너뛰기");
        System.out.println("1부터 10까지 중 짝수만 출력:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                continue; // 홀수일 때 건너뛰기
            }
            System.out.print(i + " ");
        }
        System.out.println("\n");
        
        // 7. 라벨을 사용한 중첩 반복문 제어
        System.out.println("7. 라벨을 사용한 중첩 반복문 제어");
        System.out.println("5×5 격자에서 (3,3) 위치 찾으면 전체 종료:");
        
        outer: // 라벨 정의
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("(" + i + "," + j + ") ");
                
                if (i == 3 && j == 3) {
                    System.out.println("\n✅ 목표 위치 (3,3) 발견! 전체 반복 종료");
                    break outer; // 외부 반복문까지 종료
                }
            }
            System.out.println();
        }
        
        System.out.println("\n반복문 실습이 완료되었습니다! 🎉");
    }
}