import java.sql.Array;

public class Exersice {

    static public void main(){

        String[] text = new String[10];
        int count = 0;
        boolean b = true;

        while (b) {

            text[count] = IO.readln("Skriv ett ord: ");

            if (text[count].equals(".")|| text[count].equals(" "))
                b = false;

            count++;

            for  (int i = 0; i< count; i++ )
            IO.print(text[i] +" ");

            IO.println();

        }

    }
      }



