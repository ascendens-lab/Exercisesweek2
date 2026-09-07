public class Exersice {

    static public void main(){

        int variabel = 65536;
        boolean aBool = true;


        while ( aBool) {
            IO.println(variabel);
            variabel = variabel >> 1;
            if (variabel < 2)
            aBool = false;



        }


    }
}
