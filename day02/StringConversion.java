public class StringConversion{
    public static void main(String[] args){
        String strYear  =   "2025";
        String strValue =   "12.5";

        int year        =   Integer.parseInt(strYear);
        double value    =   Double.parseDouble(strValue);

        String result   =   String.valueOf( year + value );
        System.out.println("계산 결과: " + result);
    }
}