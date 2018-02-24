/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Ejercicio4 {
    Scanner segundos= new Scanner(System.in);
    public int pregunta;
    public int semanas,horas,minutos;
     public void main(){
     
        do{
            System.out.println("digite la cantidad de segundos");
         pregunta= segundos.nextInt();
        }while(pregunta<=0);
        semanas=(pregunta/604800);
        horas=(pregunta%60);
        minutos=(pregunta%604800)/60;
        System.out.println("las semas trancurridas son"+semanas);
        System.out.println("las semas horas son"+horas);
        System.out.println("las semas minutos son"+minutos);
    }
}

