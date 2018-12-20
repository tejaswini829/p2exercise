public class Powerfour {
    public String Powercheck(int number){

        if(number == 0)
            return "no";
        while(number != 1)
        {
            if(number % 4 != 0) {
                return "no";
            }
            number=number / 4;
        }

        return "yes";
    }
}
