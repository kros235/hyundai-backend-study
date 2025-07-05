package day03.Lessons;

import java.util.Scanner;

public class ConditionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== 현대자동차 Backend Developer 지원자 평가 시스템 ===\n");
        
        // 1. if 문 - 단일 조건
        System.out.println("1. 단일 조건 검사 (if문)");
        System.out.print("Java 개발 경험이 있나요? (년수 입력, 없으면 0): ");
        int javaExperience = scanner.nextInt();
        
        if (javaExperience > 0) {
            System.out.println("✅ Java 개발 경험이 있으시네요! (" + javaExperience + "년)");
        }
        System.out.println();
        
        // 2. if-else 문 - 양자택일
        System.out.println("2. 양자택일 (if-else문)");
        System.out.print("Spring Framework 사용 경험이 있나요? (1:있음, 0:없음): ");
        int springExp = scanner.nextInt();
        
        if (springExp == 1) {
            System.out.println("✅ 훌륭합니다! Spring 경험이 있으시네요.");
        } else {
            System.out.println("⚠️ Spring을 학습해보시면 좋겠습니다.");
        }
        System.out.println();
        
        // 3. if-else if 문 - 다중 조건
        System.out.println("3. 다중 조건 (if-else if문)");
        System.out.print("총 개발 경력을 입력하세요 (년): ");
        int totalExperience = scanner.nextInt();
        
        if (totalExperience >= 5) {
            System.out.println("🏆 시니어 개발자급입니다!");
        } else if (totalExperience >= 3) {
            System.out.println("⭐ 중급 개발자급입니다!");
        } else if (totalExperience >= 1) {
            System.out.println("📚 주니어 개발자급입니다!");
        } else {
            System.out.println("🌱 신입 개발자시네요! 성장 잠재력이 높습니다!");
        }
        System.out.println();
        
        // 4. 논리 연산자를 활용한 복합 조건
        System.out.println("4. 복합 조건 검사");
        System.out.print("대학교 전공을 입력하세요 (1:컴공, 2:전자, 3:기계, 4:기타): ");
        int major = scanner.nextInt();
        
        System.out.print("영어 점수를 입력하세요 (TOEIC 기준): ");
        int englishScore = scanner.nextInt();
        
        boolean isTechMajor = (major == 1 || major == 2);  // 컴공 또는 전자
        boolean hasGoodEnglish = englishScore >= 700;
        boolean hasMinExperience = totalExperience >= 3;
        
        if (isTechMajor && hasGoodEnglish && hasMinExperience) {
            System.out.println("🎉 모든 조건을 만족합니다! 최우선 검토 대상입니다!");
        } else if (isTechMajor && hasMinExperience) {
            System.out.println("✅ 기술적 역량이 우수합니다! 영어 점수만 보완하면 완벽해요!");
        } else if (isTechMajor || hasGoodEnglish) {
            System.out.println("📝 일부 조건을 만족합니다. 경험을 더 쌓아보세요!");
        } else {
            System.out.println("💪 현재는 조건이 부족하지만, 꾸준히 학습하면 충분히 가능합니다!");
        }
        System.out.println();
        
        // 5. 중첩 if문 - 단계별 검사
        System.out.println("5. 단계별 검사 (중첩 if문)");
        System.out.print("Git 사용 경험이 있나요? (1:있음, 0:없음): ");
        int gitExp = scanner.nextInt();
        
        if (gitExp == 1) {
            System.out.print("GitHub 프로젝트가 몇 개나 있나요?: ");
            int projectCount = scanner.nextInt();
            
            if (projectCount >= 10) {
                System.out.println("🌟 활발한 개발 활동을 하고 계시네요!");
            } else if (projectCount >= 5) {
                System.out.println("👍 꾸준한 개발 활동이 보입니다!");
            } else {
                System.out.println("📈 더 많은 프로젝트 경험을 쌓아보세요!");
            }
        } else {
            System.out.println("⚠️ Git은 필수 기술입니다. 꼭 학습해주세요!");
        }
        
        scanner.close();
        System.out.println("\n평가가 완료되었습니다. 현대자동차 Backend Developer 지원을 응원합니다! 🚗");
    }
}