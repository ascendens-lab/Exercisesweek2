public class Exersice {

    static public void main(){

       int counter = 0;

        boolean[] countArray ={true, false, false, true, false, true, false, false, true, false};

        for (int i = 0; i< countArray.length; i++){
            if (!countArray[i]){
                counter++;

            }
        }

        IO.println(counter);





    }




    }

