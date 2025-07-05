package day03.Quiz;

public class Quiz02 {
    public static void main(String[] args){
        boolean hasJava         =   true;
        boolean hasSpring       =   false;
        boolean hasExperience   =   true;

        if ( (hasJava && hasSpring) || hasExperience ){
            System.out.println("합격");
        }
        else{
            System.out.println("불합격");
        }
    }    
}
