package day04.Project;

import java.util.Scanner;

public class CarInventorySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 차량 정보 배열
        String[] carModels = {"아반떼", "소나타", "그랜저", "팰리세이드", "코나"};
        int[] carPrices = {2400, 3200, 4100, 4500, 2800}; // 만원 단위
        int[] carStock = {15, 8, 5, 3, 12}; // 재고 수량
        
        System.out.println("🚗 현대자동차 차량 재고 관리 시스템 🚗");
        System.out.println("=" + "=".repeat(50));
        
        boolean running = true;
        
        while (running) {
            System.out.println("\n📋 메뉴를 선택하세요:");
            System.out.println("1. 전체 차량 재고 조회");
            System.out.println("2. 특정 차량 검색");
            System.out.println("3. 재고 부족 차량 확인");
            System.out.println("4. 차량 판매 처리");
            System.out.println("5. 월별 판매 통계");
            System.out.println("0. 시스템 종료");
            System.out.print("선택: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    // 전체 재고 조회
                    System.out.println("\n📊 전체 차량 재고 현황");
                    System.out.println("-".repeat(60));
                    System.out.printf("%-10s %-10s %-10s %-10s%n", 
                                    "순번", "모델명", "가격(만원)", "재고수량");
                    System.out.println("-".repeat(60));
                    
                    for (int i = 0; i < carModels.length; i++) {
                        String stockStatus = carStock[i] < 5 ? " ⚠️" : " ✅";
                        System.out.printf("%-10d %-10s %-10d %-10d%s%n", 
                                        (i + 1), carModels[i], carPrices[i], 
                                        carStock[i], stockStatus);
                    }
                    break;
                    
                case 2:
                    // 특정 차량 검색
                    System.out.print("\n🔍 검색할 차량 번호를 입력하세요 (1-5): ");
                    int searchIndex = scanner.nextInt() - 1;
                    
                    if (searchIndex >= 0 && searchIndex < carModels.length) {
                        System.out.println("\n📋 차량 상세 정보");
                        System.out.println("모델명: " + carModels[searchIndex]);
                        System.out.println("가격: " + carPrices[searchIndex] + "만원");
                        System.out.println("재고: " + carStock[searchIndex] + "대");
                        
                        if (carStock[searchIndex] == 0) {
                            System.out.println("⚠️ 품절 상태입니다.");
                        } else if (carStock[searchIndex] < 5) {
                            System.out.println("⚠️ 재고가 부족합니다.");
                        } else {
                            System.out.println("✅ 충분한 재고가 있습니다.");
                        }
                    } else {
                        System.out.println("❌ 잘못된 차량 번호입니다.");
                    }
                    break;
                    
                case 3:
                    // 재고 부족 차량 확인
                    System.out.println("\n⚠️ 재고 부족 차량 (5대 미만)");
                    System.out.println("-".repeat(40));
                    
                    boolean hasLowStock = false;
                    for (int i = 0; i < carModels.length; i++) {
                        if (carStock[i] < 5) {
                            System.out.printf("%-15s : %d대 남음%n", 
                                            carModels[i], carStock[i]);
                            hasLowStock = true;
                        }
                    }
                    
                    if (!hasLowStock) {
                        System.out.println("✅ 모든 차량의 재고가 충분합니다.");
                    }
                    break;
                    
                case 4:
                    // 차량 판매 처리
                    System.out.print("\n🛒 판매할 차량 번호를 입력하세요 (1-5): ");
                    int sellIndex = scanner.nextInt() - 1;
                    
                    if (sellIndex >= 0 && sellIndex < carModels.length) {
                        if (carStock[sellIndex] > 0) {
                            System.out.print("판매 수량을 입력하세요: ");
                            int sellCount = scanner.nextInt();
                            
                            if (sellCount <= carStock[sellIndex]) {
                                carStock[sellIndex] -= sellCount;
                                int totalPrice = carPrices[sellIndex] * sellCount;
                                
                                System.out.println("✅ 판매 완료!");
                                System.out.println("차량: " + carModels[sellIndex]);
                                System.out.println("수량: " + sellCount + "대");
                                System.out.println("총 금액: " + totalPrice + "만원");
                                System.out.println("남은 재고: " + carStock[sellIndex] + "대");
                            } else {
                                System.out.println("❌ 재고가 부족합니다. 현재 재고: " + 
                                                 carStock[sellIndex] + "대");
                            }
                        } else {
                            System.out.println("❌ 해당 차량은 품절입니다.");
                        }
                    } else {
                        System.out.println("❌ 잘못된 차량 번호입니다.");
                    }
                    break;
                    
                case 5:
                    // 월별 판매 통계 (시뮬레이션)
                    System.out.println("\n📈 최근 3개월 판매 통계");
                    System.out.println("-".repeat(50));
                    
                    String[] months = {"4월", "5월", "6월"};
                    for (int month = 0; month < months.length; month++) {
                        System.out.println(months[month] + " 판매량:");
                        int monthlyTotal = 0;
                        
                        for (int car = 0; car < carModels.length; car++) {
                            // 랜덤한 판매량 시뮬레이션 (0-10대)
                            int monthlySales = (month + car + 1) % 8 + 1;
                            monthlyTotal += monthlySales;
                            System.out.printf("  %-10s : %d대%n", 
                                            carModels[car], monthlySales);
                        }
                        System.out.println("  총계: " + monthlyTotal + "대\n");
                    }
                    break;
                    
                case 0:
                    System.out.println("\n👋 현대자동차 재고 관리 시스템을 종료합니다.");
                    System.out.println("이용해주셔서 감사합니다! 🚗✨");
                    running = false;
                    break;
                    
                default:
                    System.out.println("❌ 잘못된 선택입니다. 다시 선택해주세요.");
                    break;
            }
        }
        
        scanner.close();
    }
}