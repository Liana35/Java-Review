package review6;

public class replit2 {
    static int countVowels( String s){
        return s.replaceAll("[aeyuio]","").length();

        }




    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(countVowels("obama")); //3
        System.out.println(countVowels("happy friday! i love weekends")); //9
    }
}

