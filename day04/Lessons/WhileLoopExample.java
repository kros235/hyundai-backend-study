package day04.Lessons;

import java.util.Scanner;

public class WhileLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== 현대자동차 Backend Developer while문 실습 ===\n");
        
        // 1. 기본 while문
        System.out.println("1. 기본 while문 - 1부터 5까지 출력");
        int i = 1;
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n");
        
        // 2. 사용자 입력을 받는 while문
        System.out.println("2. 메뉴 선택 시스템 (0 입력시 종료)");
        int choice = -1;
        
        while (choice != 0) {
            System.out.println("\n=== 현대자동차 개발팀 메뉴 ===");
            System.out.println("1. 프로젝트 현황 조회");
            System.out.println("2. 팀원 정보 조회");
            System.out.println("3. 일정 관리");
            System.out.println("0. 종료");
            System.out.print("선택하세요: ");
            
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("📊 현재 진행중인 프로젝트: 3개");
                    break;
                case 2:
                    System.out.println("👥 Backend 팀원: 12명");
                    break;
                case 3:
                    System.out.println("📅 이번 주 중요 일정: 코드 리뷰 미팅");
                    break;
                case 0:
                    System.out.println("👋 프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("❌ 잘못된 선택입니다.");
                    break;
            }
        }
        System.out.println();
        
        // 3. do-while문 - 최소 1번은 실행
        System.out.println("3. do-while문 - 비밀번호 입력");
        String correctPassword = "hyundai2025";
        String inputPassword;
        
        do {
            System.out.print("개발자 포털 비밀번호를 입력하세요: ");
            inputPassword = scanner.next();
            
            if (!inputPassword.equals(correctPassword)) {
                System.out.println("❌ 비밀번호가 틀렸습니다. 다시 시도해주세요.");
            } else {
                System.out.println("✅ 로그인 성공! 개발자 포털에 접속합니다.");
            }
        } while (!inputPassword.equals(correctPassword));
        
        System.out.println();
        
        // 4. 무한 루프 방지 예제
        System.out.println("4. 안전한 반복문 - 최대 시도 횟수 제한");
        int maxAttempts = 3;
        int attempts = 0;
        boolean success = false;
        
        while (attempts < maxAttempts && !success) {
            System.out.print("API 키를 입력하세요 (정답: 'backend123'): ");
            String apiKey = scanner.next();
            attempts++;
            
            if (apiKey.equals("backend123")) {
                System.out.println("✅ API 키 인증 성공!");
                success = true;
            } else {
                System.out.println("❌ 잘못된 API 키입니다. " + 
                                   "남은 시도 횟수: " + (maxAttempts - attempts));
            }
        }
        
        if (!success) {
            System.out.println("🚫 최대 시도 횟수를 초과했습니다. 관리자에게 문의하세요.");
        }
        
        scanner.close();
    }
}