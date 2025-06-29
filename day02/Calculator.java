import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner scanner =   new Scanner(System.in);

        System.out.println("첫 번째 정수를 입력하시오 : ");
        int first   =   scanner.nextInt();

        System.out.println("두 번째 정수를 입력하시오 : ");
        int second   =   scanner.nextInt();

        int sum      =   first + second;
        double avg   =   (double)(sum) / 2;
        int diff     =   Math.abs( first - second );

        System.out.println("합계    :   " + sum);
        System.out.println("평균    :   " + avg);
        System.out.println("차이 (절대값)    :   " + diff);
    }
}