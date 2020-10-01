package de.telran.data;

public class GuessNumberGame {


    public void guessNumber(Messenger messenger) {
        messenger.displayMessege("Hi Player");
        messenger.displayMessege("enter range of number ");
        int range = messenger.getNumber();
        messenger.displayMessege("i guess the number from 0 to " + range);
        int guessNumber = randomNumber(range);
        int userNumber;
        while (true) {
            messenger.displayMessege("enter number");
             userNumber = messenger.getNumber();
            if (userNumber == guessNumber) {
                messenger.displayMessege("Bingo!");
                break;

            }
            else  if (userNumber>guessNumber){
                messenger.displayMessege("my number is less");
            }else{
                messenger.displayMessege("my number is greater");
            }
        }
        messenger.closeMessenger();

    }

    public static int randomNumber(int range) {
        return (int) (Math.random() * range);
    }
}
