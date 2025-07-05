package day03.Lessons;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== 현대자동차 개발팀 부서 배정 시스템 ===\n");
        
        // 1. 기본 switch 문
        System.out.println("1. 부서 선택");
        System.out.println("1: Backend 개발팀");
        System.out.println("2: Frontend 개발팀");
        System.out.println("3: Mobile 개발팀");
        System.out.println("4: AI/ML 개발팀");
        System.out.println("5: DevOps 팀");
        System.out.print("희망 부서를 선택하세요 (1-5): ");
        
        int department = scanner.nextInt();
        
        switch (department) {
            case 1:
                System.out.println("🖥️ Backend 개발팀을 선택하셨습니다!");
                System.out.println("주요 기술: Java, Spring Boot, MySQL, Redis");
                System.out.println("담당 업무: API 개발, 서버 아키텍처 설계, 데이터베이스 설계");
                break;
                
            case 2:
                System.out.println("🎨 Frontend 개발팀을 선택하셨습니다!");
                System.out.println("주요 기술: React, Vue.js, TypeScript, CSS");
                System.out.println("담당 업무: 사용자 인터페이스 개발, 사용자 경험 개선");
                break;
                
            case 3:
                System.out.println("📱 Mobile 개발팀을 선택하셨습니다!");
                System.out.println("주요 기술: Android, iOS, React Native, Flutter");
                System.out.println("담당 업무: 모바일 앱 개발, 크로스 플랫폼 개발");
                break;
                
            case 4:
                System.out.println("🤖 AI/ML 개발팀을 선택하셨습니다!");
                System.out.println("주요 기술: Python, TensorFlow, PyTorch, Spark");
                System.out.println("담당 업무: 머신러닝 모델 개발, 데이터 분석");
                break;
                
            case 5:
                System.out.println("⚙️ DevOps 팀을 선택하셨습니다!");
                System.out.println("주요 기술: Docker, Kubernetes, AWS, Jenkins");
                System.out.println("담당 업무: CI/CD 구축, 인프라 관리, 모니터링");
                break;
                
            default:
                System.out.println("❌ 잘못된 선택입니다. 1-5 사이의 숫자를 입력해주세요.");
                break;
        }
        System.out.println();
        
        // 2. break 없는 switch (fall-through)
        System.out.println("2. 개발 경력별 멘토링 프로그램");
        System.out.print("개발 경력을 입력하세요 (년): ");
        int experience = scanner.nextInt();
        
        System.out.println("\n📚 추천 학습 과정:");
        
        switch (experience) {
            case 0:
                System.out.println("- 신입 개발자 오리엔테이션");
            case 1:
                System.out.println("- Java 기초 문법 완전 정복");
            case 2:
                System.out.println("- Spring Framework 핵심 원리");
            case 3:
                System.out.println("- 데이터베이스 설계 및 최적화");
                break;
            default:
                if (experience > 3) {
                    System.out.println("- 시니어 개발자 리더십 과정");
                    System.out.println("- 아키텍처 설계 고급 과정");
                    System.out.println("- 멘토링 스킬 개발");
                } else {
                    System.out.println("❌ 경력을 정확히 입력해주세요.");
                }
                break;
        }
        System.out.println();
        
        // 3. 문자열 switch (Java 7+)
        System.out.println("3. 기술 스택별 프로젝트 배정");
        System.out.print("주력 기술을 입력하세요 (java/python/javascript/go): ");
        scanner.nextLine(); // 버퍼 클리어
        String mainSkill = scanner.nextLine().toLowerCase();
        
        switch (mainSkill) {
            case "java":
                System.out.println("☕ Java 프로젝트 배정!");
                System.out.println("프로젝트: 차량 관리 시스템 Backend API 개발");
                System.out.println("기간: 3개월");
                System.out.println("팀원: 5명 (Backend 3명, Frontend 2명)");
                break;
                
            case "python":
                System.out.println("🐍 Python 프로젝트 배정!");
                System.out.println("프로젝트: 자율주행 데이터 분석 시스템");
                System.out.println("기간: 4개월");
                System.out.println("팀원: 4명 (Data Engineer 2명, ML Engineer 2명)");
                break;
                
            case "javascript":
                System.out.println("🌐 JavaScript 프로젝트 배정!");
                System.out.println("프로젝트: 고객 포털 웹 사이트 개발");
                System.out.println("기간: 2개월");
                System.out.println("팀원: 6명 (Frontend 4명, Backend 2명)");
                break;
                
            case "go":
                System.out.println("🚀 Go 프로젝트 배정!");
                System.out.println("프로젝트: 마이크로서비스 아키텍처 구축");
                System.out.println("기간: 6개월");
                System.out.println("팀원: 3명 (Backend 3명)");
                break;
                
            default:
                System.out.println("🤔 해당 기술 스택의 프로젝트가 현재 없습니다.");
                System.out.println("기존 프로젝트에서 새로운 기술을 학습하는 기회를 드릴게요!");
                break;
        }
        
        // 4. switch expression (Java 14+) - 참고용
        System.out.println("\n4. 급여 등급 계산");
        System.out.print("직급을 입력하세요 (1:주임, 2:대리, 3:과장, 4:차장, 5:부장): ");
        int grade = scanner.nextInt();
        
        String salaryInfo;
        switch (grade) {
            case 1:
                salaryInfo = "주임 - 연봉 4000만원대";
                break;
            case 2:
                salaryInfo = "대리 - 연봉 5000만원대";
                break;
            case 3:
                salaryInfo = "과장 - 연봉 6500만원대";
                break;
            case 4:
                salaryInfo = "차장 - 연봉 8000만원대";
                break;
            case 5:
                salaryInfo = "부장 - 연봉 1억원대";
                break;
            default:
                salaryInfo = "잘못된 직급입니다";
                break;
        }
        
        System.out.println("💰 " + salaryInfo);
        
        scanner.close();
        System.out.println("\n부서 배정이 완료되었습니다! 현대자동차에서 함께 성장해요! 🚗✨");
    }
}
