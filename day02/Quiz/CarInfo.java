package Quiz;
public class CarInfo{
    public static void main(String[] args){
        String carName          =   "아이오닉6";
        double fuelEfficiency   =   20.8;
        int price               =   5290;
        boolean isElectric  =   true;
        char grade              =   'S';
        
        System.out.println("=== 현대자동차 신차 정보 ===");
        System.out.println("차량명: " + carName);
        System.out.println("연비: " + fuelEfficiency + "km/L");
        System.out.println("가격: " + price + "만원");
        System.out.println("전기차: " + isElectric);
        System.out.println("등급: " + grade);
    }
}