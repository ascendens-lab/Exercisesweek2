import java.sql.Array;

public class Exersice {

    static public void main(){

        String sentence = IO.readln("Skriv en mening: ");

         String lowerCase = sentence.toLowerCase();


        boolean b = lowerCase.contains("java");

        IO.println(sentence.toUpperCase());
        IO.println(sentence.length());

        int last = sentence.length()-1;
        String[] lettersFromSentence = new String[last];
        String reverseSentence = String.valueOf(sentence.charAt(last));



        if (b)
            IO.println("Meningen innehåller ordet Java" );


    }
      }



