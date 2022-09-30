import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String str = "12345678";
        stringCutter(str);
    }
    public static void stringCutter(String str){
        System.out.println(str.substring(0, str.length()/2)+ " "+ str.substring(str.length()/2, str.length()));
    }
}