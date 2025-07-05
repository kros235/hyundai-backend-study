package day03.Lessons;

import java.util.Scanner;

public class CarPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== 현대자동차 차량 가격 계산기 ===\n");
        
        // 차량 모델 선택
        System.out.println("🚗 차량 모델을 선택해주세요:");
        System.out.println("1. 아반떼 (기본가 2,400만원)");
        System.out.println("2. 소나타 (기본가 3,200만원)");
        System.out.println("3. 그랜저 (기본가 4,100만원)");
        System.out.println("4. 제네시스 G90 (기본가 9,500만원)");
        System.out.print("선택 (1-4): ");
        
        int carModel = scanner.nextInt();
        int basePrice = 0;
        String carName = "";
        
        switch (carModel) {
            case 1:
                basePrice = 2400;
                carName = "아반떼";
                break;
            case 2:
                basePrice = 3200;
                carName = "소나타";
                break;
            case 3:
                basePrice = 4100;
                carName = "그랜저";
                break;
            case 4:
                basePrice = 9500;
                carName = "제네시스 G90";
                break;
            default:
                System.out.println("❌ 잘못된 선택입니다.");
                scanner.close();
                return;
        }
        
        System.out.println("✅ 선택하신 차량: " + carName + " (기본가: " + basePrice + "만원)\n");
        
        // 옵션 선택
        System.out.println("🛠️ 추가 옵션을 선택해주세요:");
        
        // 엔진 옵션
        System.out.println("1. 엔진 옵션");
        System.out.println("   1) 일반 엔진 (+0만원)");
        System.out.println("   2) 터보 엔진 (+300만원)");
        System.out.println("   3) 하이브리드 (+500만원)");
        System.out.print("선택 (1-3): ");
        int engineOption = scanner.nextInt();
        
        int enginePrice = 0;
        String engineType = "";
        
        if (engineOption == 1) {
            enginePrice = 0;
            engineType = "일반 엔진";
        } else if (engineOption == 2) {
            enginePrice = 300;
            engineType = "터보 엔진";
        } else if (engineOption == 3) {
            enginePrice = 500;
            engineType = "하이브리드";
        } else {
            System.out.println("일반 엔진으로 설정됩니다.");
            enginePrice = 0;
            engineType = "일반 엔진";
        }
        
        // 색상 옵션
        System.out.println("\n2. 차량 색상");
        System.out.println("   1) 화이트 (+0만원)");
        System.out.println("   2) 블랙 (+30만원)");
        System.out.println("   3) 실버 (+20만원)");
        System.out.println("   4) 레드 (+50만원)");
        System.out.print("선택 (1-4): ");
        int colorOption = scanner.nextInt();
        
        int colorPrice = 0;
        String colorName = "";
        
        switch (colorOption) {
            case 1:
                colorPrice = 0;
                colorName = "화이트";
                break;
            case 2:
                colorPrice = 30;
                colorName = "블랙";
                break;
            case 3:
                colorPrice = 20;
                colorName = "실버";
                break;
            case 4:
                colorPrice = 50;
                colorName = "레드";
                break;
            default:
                colorPrice = 0;
                colorName = "화이트";
                System.out.println("화이트로 설정됩니다.");
                break;
        }
        
        // 추가 옵션들
        System.out.println("\n3. 편의 옵션 (중복 선택 가능)");
        System.out.print("네비게이션 추가하시겠습니까? (1:예, 0:아니오): ");
        int hasNavigation = scanner.nextInt();
        int navigationPrice = (hasNavigation == 1) ? 200 : 0;
        
        System.out.print("선루프 추가하시겠습니까? (1:예, 0:아니오): ");
        int hasSunroof = scanner.nextInt();
        int sunroofPrice = (hasSunroof == 1) ? 150 : 0;
        
        System.out.print("가죽시트 추가하시겠습니까? (1:예, 0:아니오): ");
        int hasLeatherSeat = scanner.nextInt();
        int leatherSeatPrice = (hasLeatherSeat == 1) ? 180 : 0;
        
        // 할인 조건 확인
        System.out.println("\n4. 할인 혜택 확인");
        System.out.print("현대자동차 직원이십니까? (1:예, 0:아니오): ");
        int isEmployee = scanner.nextInt();
        
        System.out.print("기존 현대차 보유고객이십니까? (1:예, 0:아니오): ");
        int isExistingCustomer = scanner.nextInt();
        
        // 총 가격 계산
        int totalPrice = basePrice + enginePrice + colorPrice + navigationPrice + sunroofPrice + leatherSeatPrice;
        int discountAmount = 0;
        String discountReason = "";
        
        if (isEmployee == 1 && isExistingCustomer == 1) {
            discountAmount = (int)(totalPrice * 0.15); // 15% 할인
            discountReason = "직원 + 기존고객 할인 (15%)";
        } else if (isEmployee == 1) {
            discountAmount = (int)(totalPrice * 0.10); // 10% 할인
            discountReason = "직원 할인 (10%)";
        } else if (isExistingCustomer == 1) {
            discountAmount = (int)(totalPrice * 0.05); // 5% 할인
            discountReason = "기존고객 할인 (5%)";
        }
        
        int finalPrice = totalPrice - discountAmount;
        
        // 결과 출력
        System.out.println("\n" + "=".repeat(50));
        System.out.println("📋 주문 내역서");
        System.out.println("=".repeat(50));
        System.out.println("차량 모델: " + carName);
        System.out.println("기본 가격: " + basePrice + "만원");
        System.out.println();
        
        System.out.println("선택 옵션:");
        System.out.println("- 엔진: " + engineType + " (+" + enginePrice + "만원)");
        System.out.println("- 색상: " + colorName + " (+" + colorPrice + "만원)");
        
        if (hasNavigation == 1) {
            System.out.println("- 네비게이션 (+" + navigationPrice + "만원)");
        }
        if (hasSunroof == 1) {
            System.out.println("- 선루프 (+" + sunroofPrice + "만원)");
        }
        if (hasLeatherSeat == 1) {
            System.out.println("- 가죽시트 (+" + leatherSeatPrice + "만원)");
        }
        
        System.out.println();
        System.out.println("소계: " + totalPrice + "만원");
        
        if (discountAmount > 0) {
            System.out.println("할인: -" + discountAmount + "만원 (" + discountReason + ")");
        }
        
        System.out.println("=".repeat(50));
        System.out.println("최종 가격: " + finalPrice + "만원");
        System.out.println("=".repeat(50));
        
        // 구매 결정
        System.out.print("\n구매하시겠습니까? (1:예, 0:아니오): ");
        int buyDecision = scanner.nextInt();
        
        if (buyDecision == 1) {
            System.out.println("🎉 구매해주셔서 감사합니다!");
            System.out.println("💳 결제 금액: " + finalPrice + "만원");
            System.out.println("🚗 " + carName + " 구매가 완료되었습니다!");
            System.out.println("📞 배송 관련 안내는 영업담당자가 연락드리겠습니다.");
        } else {
            System.out.println("🤝 검토해주셔서 감사합니다!");
            System.out.println("💭 언제든지 다시 방문해주세요!");
        }
        
        scanner.close();
        System.out.println("\n현대자동차를 이용해주셔서 감사합니다! 🚗✨");
    }
}