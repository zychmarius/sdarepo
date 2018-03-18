package binarygap;

public class Main {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(1041));
        System.out.println(solution(1041));
    }

    public static int solution(int N) {
        String binaryValue = Integer.toBinaryString(N);
        int temp = 0;
        int temp2 = 0;
        int value = 0;
        for (int i = 0; i < binaryValue.length(); i++) {
            if (binaryValue.charAt(i) == '0') {
                temp++;
            }else{
                temp2 = temp;
                temp = 0;
            }
            if(temp2>value){
                value = temp2;
                temp2 = 0;
            }
        }
        return value;
    }
}
