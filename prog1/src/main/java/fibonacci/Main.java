package fibonacci;

public class Main {

    private static int fibRec(int n){
        if( n < 3 ) {
            return 1;
        }
        return fibRec(n-2) + fibRec( n-1);
    }
    private static int fibItr(int n){
        int element1 = 1;
        int element2 = 1;
        int temp = 0;
        if(n == 1 || n == 2 ){
            return element1;
        }
        for (int i = 3; i < n + 1; i++) {

            temp = element2;
            element2 = element1 + element2;
            element1 = temp;


        }
        return element2;
    }

    public static void main(String[] args) {
        System.out.println(fibRec(7));
        System.out.println(fibItr(7));
    }
}