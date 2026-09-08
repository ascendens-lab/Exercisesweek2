import java.sql.Array;

public class Exersice {

    static public void main(){

        String sentence = IO.readln("Skriv en mening: ");
        String lowerCase = sentence.toLowerCase();
        String reverseSentence = "";


        boolean b = lowerCase.contains("java");

        IO.println(sentence.toUpperCase());
        IO.println(sentence.length());

        int last = sentence.length()-1;

        for (int i = 0; i < sentence.length(); i++)
             reverseSentence = reverseSentence + String.valueOf(sentence.charAt(last-i));


        IO.println(reverseSentence);




        if (b)
            IO.println("Meningen innehåller ordet Java" );


    }
      }



