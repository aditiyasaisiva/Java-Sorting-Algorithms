/* @Author Aditiya Saisiva
*/

package com.aditiya.datastructures;
import java.util.Arrays;

public class DifferentSorts {

    public static void main(String[] args) {
        int [] data={3,5,7,1,3};
        int [] data1={8,1,3,6,5};
        new DifferentSorts().BubbleSort(data);
        new DifferentSorts().selectionSort(data1);
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(data1));
    }

    public void BubbleSort(int[] data){
        for(int i=0;i<data.length-1;i++){
            for(int j=0;j<data.length-1-i;j++){
                if (data[j] > data[j+1]) {
                    int temp=data[j+1];
                    data[j+1]=data[j];
                    data[j]=temp;
                }
            }
        }
    }

    public void selectionSort(int[] data){
        int min=0;
        for(int i=0; i<data.length;i++){
            min=i;
            for(int j=i+1;j<data.length;j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }
                int temp=data[i];
                System.out.println(temp);
                System.out.println(data[min]);
                data[i]=data[min];
                data[min]=temp;

            }
        }
    }
  


