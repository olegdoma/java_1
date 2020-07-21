package lesson1;

import sun.security.mscapi.CPublicKey;

public class Main {

    public static void main(String[] args) {

        int[] arrZeroOne = {1,1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arrZeroOne.length; i++) {
                        System.out.printf("%3d", arrZeroOne[i]);
        }
        System.out.printf("\n");
        for (int i = 0; i < arrZeroOne.length; i++) {
            if (arrZeroOne[i] == 0) {
                arrZeroOne[i] = 1;
            } else {
                arrZeroOne[i] = 0;
            }
            System.out.printf("%3d", arrZeroOne[i]);
        }

        System.out.printf("\n");

        int[] arr2 = new int[8];
        for (int i = 0; i <arr2.length; i++) {
            arr2[i] = i * 3;
            System.out.printf("%3d", arr2[i]);
        }

        System.out.printf("\n");

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i <arr3.length ; i++) {
            if (arr3[i] < 6)
            {
                arr3[i] *=2;
            }
            System.out.printf("%3d", arr3[i]);
        }
        System.out.printf("\n");

        int[][] arr2d = new int[5][5];
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d.length ; j++) {
                if(i == j || i + j == arr2d.length - 1)
                    arr2d[i][j] = 1;
            }

        }
        printarr2d(arr2d);

        System.out.printf("\n");


        int[] minMaxArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int max = minMaxArr[0];
        int min = minMaxArr[0];
        for (int i = 1; i <minMaxArr.length ; i++) {
            if (minMaxArr[i] > max)
            {
                max = minMaxArr[i];
            };
                    }
        System.out.printf("'%d\n", max);
        for (int i = 1; i <minMaxArr.length ; i++) {
            if (minMaxArr[i] < min)
            {
                min = minMaxArr[i];
            };
        }
        System.out.printf("'%d\n", min);

        System.out.printf("\n");

        int[] arr5 = {2,2,2,1,2,2,10,1};
        checkBalance(arr5);
    }


    public static void checkBalance(int[] arr4) {
        int summLeft = 0;
        int summRight = 0;
        for (int i = 0; i < arr4.length - 2; i++) {
            summLeft += arr4[i];
                    }
            summRight = arr4[(arr4.length-2)] + arr4[(arr4.length - 1)];

        System.out.println(summLeft == summRight);


    }





    public static void printarr2d(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%5d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
