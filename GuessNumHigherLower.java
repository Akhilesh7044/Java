



import java.util.concurrent.ThreadLocalRandom;
import java.security.Guard;
import java.util.Scanner;

public class higher_lower
{
    public static void main(String[] args) 
    {
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        Scanner scan = new Scanner(System.in);

        boolean gameOn=true;
          int guess=0;

        System.out.println("You have to guess number from 0 to 100");

        while(gameOn)
        {
            System.out.println("Make a guess: ");
            int userNum = scan.nextInt();
              guess++;
    
            
            if(userNum < randomNumber){
                System.out.println("Too Low ");
            }
            else if(userNum > randomNumber){
                System.out.println("Too High");
            }
            else
            {
                System.out.println("OMG... Correct Guess!");
                gameOn=false;

            }

            

        }

        if(guess>10){
            System.out.println("You took many guesses to make it");
        }
        else{
            System.out.println("and you perfromed very well in less guesses.");
        }



    }
}




