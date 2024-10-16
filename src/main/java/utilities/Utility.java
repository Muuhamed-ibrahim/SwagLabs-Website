package utilities;

public class Utility {
    static int randomNumber;
    public static int generateRandomNumber(){
        randomNumber= (int)(Math.random() * 6) + 1;
        return randomNumber;
    }
}
