package lesson1;

public class v1 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
        int summLeft = 0;
        int summRight = 0;
        for (int i = 0; i < (arr.length - 2); i++) {
            summLeft += arr[i];

        }
        System.out.println(summLeft);

        summRight = arr[(arr.length - 2)] + arr[(arr.length - 1)];

        System.out.println(summRight);
        System.out.println(summLeft == summRight);
    }




}
