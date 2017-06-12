package javaapplication19;

import java.util.Scanner;

public class Java  {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] array;
        int size;
        System.out.println("Введите размер массива");
        size = scn.nextInt();
        array = new int[size];
        System.out.println("Заполняем массив");
        for(int i = 0; i<array.length; i++) {
            array[i] = scn.nextInt();
        }
        MaxMin.maxmin(array);
        
    }
    
    
    
    
}
