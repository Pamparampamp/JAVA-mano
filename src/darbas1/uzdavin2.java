package darbas1;

import java.util.Arrays;
import java.util.Collections;

public class uzdavin2  {

    public static void main(String[] args) {
        Integer[] skaiciai  = {5,8,9,1,-4};

//       Arrays.sort(skaiciai);  //nuo maziausio iki didziausio
        Arrays.sort(skaiciai, Collections.reverseOrder());  // nuo didziausio iki maziausio
        System.out.println(Arrays.toString(skaiciai));
        for (Integer  skaicius : skaiciai) {
            System.out.println(skaicius);
        }

        System.out.println("-------------------------------");

        int a[]={52,36,28,6,11,56,24,84,5,4,2};
        int b;
        for(int i=0;i<a.length;i++){
            int x=0;
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    b=a[j];
                    a[j]=a[j+1];
                    a[j+1]=b;
                    x=1;
                }

            }

            if(x==0)
                break;

        }
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+", ");

        reverse();

    }

    private static void reverse() {
        int[] array ={52,36,28,6,11,56,24,84,5,4,2};
        System.out.println("-------------------------------");
        if (array == null) {
            return;
        }
        int i = 0;
        int j = array.length - 1;
        int tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
        System.out.println(Arrays.toString(array));
    }



}



