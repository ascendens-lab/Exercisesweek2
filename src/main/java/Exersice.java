import java.sql.Array;

public class Exersice {

    static public void main(){

      long number = Math.round(Math.random() * 99 + 1);
      int guesses = 0;

      boolean b = true ;

      while (b) {
          int guess = Integer.parseInt(IO.readln("Gissa ett på ett tal 1-100: "));
          guesses++;

          if (guess < number)
              IO.println("Talet är större.");

          else if (guess > number)
              IO.println("Talet är mindre.");

          else {
              IO.println("Rätt gissat, talet var " + number + "!");
              IO.println("Du behövde gissningar" + guesses + " för att gissa rätt.");
              b = false;
      }
      }


    }




    }

