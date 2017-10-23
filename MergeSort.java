package unidad1;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

public static void OrdenamientoMergeSort(Alumnos[]a){
       
        int medio= a.length/2;
        
        Alumnos[] ladoizquierdo=Arrays.copyOfRange(a, 0, medio);
        Alumnos[] ladoderecho=Arrays.copyOfRange(a, medio, a.length);
        OrdenamientoMergeSort(ladoizquierdo);
        OrdenamientoMergeSort(ladoderecho);       
        CombinaciondelVector(a, ladoizquierdo, ladoderecho);
}

public static void CombinaciondelVector(Alumnos[] a, Alumnos[] izquierda,Alumnos[] derecha){
        int i=0;
        int n=0;
        for(int b=0;b<a.length;b++){
                if(i>=izquierda.length){
                        a[b]=derecha[n];
                        n++;
                        continue;
                }
                if(n>=derecha.length){
                        a[b]=izquierda[i];
                        i++;
                        continue;
                }
                if(izquierda[i].compareTo(derecha[n])<0){
                        a[b]=izquierda[i];
                        i++;
                }else{
                        a[b]=derecha[n];
                        n++;
                }
        }
}

}