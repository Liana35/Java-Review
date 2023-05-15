package review6;

public class Replit      {
    static int countVowels( String s){

       String str1= s.replaceAll("[^aeuio]","");
       return str1.replace(" ", "").length();

    }




    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(countVowels("obama")); //3
        System.out.println(countVowels("happy friday! i love weekends")); //9
    }
}
