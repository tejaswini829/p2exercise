public class Palindrome {
    public String Palindromeck(int number){
       int  rev=0,remainder, originalInteger;
       originalInteger=number;
        while( number != 0 )
        {
            remainder = number % 10;
            rev = (rev * 10) + remainder;
            number  /= 10;
        }
        if(originalInteger==rev)
            return "palindrome";
        else
            return "not a palindrome";


    }

}
