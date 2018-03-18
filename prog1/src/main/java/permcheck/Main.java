package permcheck;

public class Main {

    public static int solution(int[] A) {
        int repeatNumber = 0;
        if(A.length == 0){
            return 0;
        }
        for (int i = 1; i <= A.length ; i++) {
            for (int element:A) {
                if(element == i){
                    repeatNumber++;
                }

            }
            if(repeatNumber == 1){
                repeatNumber = 0;
            }else{
                return 0;
            }


        }
        return  1;
    }

    public static void main(String[] args) {


    }
}
