/******************************************************
* Autor: Kevin Arnold Cortés Pacheco*                 *
* Fecha Creación: 22/03/23                            *
* Fecha Actualización: 22/03/23                       *
* Descripción: Implementacion del metodo por Inserción*
*******************************************************/

package metodoinsercion;

public class OrdenacionInsercion {
	public static void insertionSort(int array[]) {  
    int n = array.length;  
    for (int j = 1; j < n; j++) {  
        int key = array[j];  
        int i = j-1;  
        while ( (i > -1) && ( array [i] > key ) ) {  
            array [i+1] = array [i];  
            i--;  
        }  
        array[i+1] = key;  
    }  
}  
   
public static void main(String a[]){    
    int[] arr1 = {9,14,3,2,43,11,58,22};    
    System.out.println("Elementos no ordenados");    
    for(int i:arr1){    
        System.out.print(i+" ");    
    }    
    System.out.println();    
        
    insertionSort(arr1); 
       
    System.out.println("Ordenados por metodo de Insercion ");    
    for(int i:arr1){    
        System.out.print(i+" ");    
    }    
}    
}    
