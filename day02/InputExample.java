import java.util.Scanner;   //  Scanner 클래스 import

public class InputExample{
    public static void main(String[] args){
        // Scanner 객체 생성 (키보드 입력을 받기 위해)
        Scanner scanner =   new Scanner(System.in);

        System.out.println("=== 지원자 정보 입력 ===");

        // 문자열 입력받기
        System.out.print("이름을 입력하세요 : ");
        String name =   scanner.nextLine();

        // 나이 입력받기
        System.out.print("나이를 입력하세요 : ");
        int age =   scanner.nextInt();

        // 키 입력받기 
        System.out.print("키를 입력하세요(cm) : ");
        double height = scanner.nextDouble();

        // nextLine() 버퍼 문제 해결을 위한 코드
        scanner.nextLine();

        // 전공 입력 받기
        System.out.print("전공을 입력하세요: ");
        String major    =   scanner.nextLine();


        // 입력받은 정보 출력
        System.out.println("\n=== 입력하신 정보 ===");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age + "세");
        System.out.println("키   : " + height + "cm");
        System.out.println("전공 : " + major);

        // BMI 계산해보기 (몸무게도 입력받아서)
        System.out.print("\n몸무게를 입력하세요(kg): ");
        double weight   =   scanner.nextDouble();

        double BMI      = weight / ( (height/100) * (height/100) );
        System.out.println("당신의 BMI는 " + String.format("%.1f", BMI) + "입니다." );

        // Scanner 자원 해제 (중요!)
        scanner.close();

        System.out.println("\n" + name + "님. 현대자동차 Backend Developer 지원을 환영합니다.");
    }
}