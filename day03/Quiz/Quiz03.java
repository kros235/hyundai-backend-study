package day03.Quiz;

public class Quiz03{
    public static void main(String[] args){
        int grade   =   2;
        switch( grade ){
            case 1:
               System.out.println("신입");
            case 2:
                System.out.println("주니어");
            case 3: 
                System.out.println("시니어");
            default:
                System.out.println("기타");
        }

    }
}