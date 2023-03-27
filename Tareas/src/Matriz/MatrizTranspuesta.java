/******************************************************************
* Autor: Kevin Arnold Cortés Pacheco                              *
* Fecha Creación: 22/03/23                                        *
* Fecha Actualización: 22/03/23                                   *
* Descripción: Creacion de una matriz y se imprime la transpuesta *
******************************************************************/

package Matriz;

public class MatrizTranspuesta {
	public static void main(String[] args) { 
        //creacion de matriz
        int original[][]={{1,3,4},{2,4,3},{3,4,5}};    
            
        //creamos otra matriz para almacenar la transpuesta de la matriz
        int transpuesta[][]=new int[3][3];  //3 filas y 3 columnas  
            
        
        for(int i=0;i<3;i++){    
        for(int j=0;j<3;j++){    
        transpuesta[i][j]=original[j][i];  
        }    
        }    
          
        System.out.println("Matriz Original:");  
        for(int i=0;i<3;i++){    
        for(int j=0;j<3;j++){    
        System.out.print(original[i][j]+" ");    
        }    
        System.out.println(); 
        }    
        System.out.println("Matriz transpuesta:");  
        for(int i=0;i<3;i++){    
        for(int j=0;j<3;j++){    
        System.out.print(transpuesta[i][j]+" ");    
        }    
        System.out.println();  
        }    
        }}  
