public class Exersice {

    static public void main(){

        for (int variabel = 65536; variabel > 2; ) {
            IO.println(variabel);
            variabel = variabel >> 1;

        }


    }
}
