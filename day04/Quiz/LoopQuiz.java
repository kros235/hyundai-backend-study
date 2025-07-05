package day04.Quiz;

import java.util.Scanner;

public class LoopQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Day 04 반복문 퀴즈 ===\n");
        
        // 퀴즈 1: for문 활용
        System.out.println("퀴즈 1: 1부터 100까지의 합을 구하세요");
        // 여기에 코드를 작성하세요
        int result  =   0;
        for ( int i = 1; i <=100 ; i++ )
            result += i ;
        System.out.println( "Result =   "   +   result );

        
        
        // 퀴즈 2: while문 활용  
        System.out.println("\n퀴즈 2: 사용자가 입력한 숫자의 팩토리얼을 구하세요");
        System.out.print("숫자를 입력하세요: ");
        int n = scanner.nextInt();
        // 여기에 코드를 작성하세요 (while문 사용)

        long factorial_result    =   1;
        while ( n > 0 ){
            factorial_result    *=  n;
            n--;
        }
        System.out.println( "Factorial Result =   "   +   factorial_result );
        
        
        // 퀴즈 3: 중첩 반복문
        System.out.println("\n퀴즈 3: 다음과 같은 패턴을 출력하세요");
        System.out.println("목표 패턴:");
        System.out.println("1");
        System.out.println("12");  
        System.out.println("123");
        System.out.println("1234");
        System.out.println("12345");
        System.out.println("\n여러분의 답:");
        // 여기에 코드를 작성하세요
        for ( int i = 1; i <= 5 ; i++){
            for ( int j = 1; j <= i ; j++){
                System.out.print( j );
            }
            System.out.println("");
        }
        
        
        
        // 퀴즈 4: break와 continue
        System.out.println("\n퀴즈 4: 1부터 50까지 숫자 중에서");
        System.out.println("- 3의 배수는 건너뛰고");  
        System.out.println("- 7의 배수를 만나면 그 숫자를 출력하고 종료하세요");
        // 여기에 코드를 작성하세요
        for ( int i = 1; i <= 50 ; i++ ) {
            if ( i  % 3 == 0 )  
                continue;
            else if ( i % 7 == 0 ){
                System.out.println( "Result = " + i );
                break;
            }
        }        
        
        scanner.close();
    }
}