/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotienda;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Ejerciciotienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner n= new Scanner(System.in);
       
       String dias[]= new String  [7], diamenos="",diamayor=""; 
        dias[0]="lunes";dias[1]="martes"; dias[2]="miercoles"; dias[3]="jueves"; dias[4]="viernes";
        dias[5]="sabado";dias[6]="domingo";
       int vdia[]= new int[7],c=0,v=0;
       int valorM=0,valormenor=100000000;// toco empezarlo en 100 millones 
       float vtotal=0,prom;
       
       
       
       while(v!= (-1)){
          System.out.println("ingrese cantidad capital vendido en el dia "+dias[c]);
           vdia[c]=n.nextInt();
           v= vdia[c];
           if(vdia[c]<valormenor && vdia[c] != -1 ){
               valormenor= vdia[c];
               diamenos=dias[c];
               
           }if (vdia[c]>valorM){
                valorM=vdia[c];
                diamayor=dias[c];
           }
           
           c++;
           
       }
       
       for(int i=0; i<vdia.length;i++){
           vtotal=+vdia[i];
           
       
       }
       prom = (vtotal/(vdia.length-1))+1;
       
       for(int j=0;j<dias.length;j++ ){
           if("sabado".equals(dias[j])){
               if(vdia[j]>prom){
                   System.out.println("las ventas del sabado son mayores al promedio de la semana");
               }else{
                   System.out.println("las ventas del sabado no son mayor al promedio de la semana");
               }
           }
       }
       
        System.out.println(" el dia con mayor ventas de la semana es: "+diamayor+" con un total de: $"+valorM);
        System.out.println("el dia de menores ventas de la semana es: "+diamenos+" con un total de: $"+valormenor);
        
    }
    
}
        // TODO code application logic here
    
    

