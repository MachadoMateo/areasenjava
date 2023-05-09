/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras_geometricas;

import java.util.Scanner;

/**
 *
 * @author disenoydesarrollo
 */
public class Figuras_geometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // definir objetos y variables
        Scanner objread=new Scanner(System.in);
        clsareas obj_areas=new clsareas();
        float lado,largo,ancho,radio,area;
        //datos de entrada
        System.out.print(" Digite el lado del cuadrado ");
        lado=objread.nextFloat();
        //hallar area del cuadrado
        area=obj_areas.Calcular_area_cuadrado(lado);
        System.out.print(" el area del cuadrado es " + area);
        System.out.print("Digite el largo del rectangulo ");
        largo=objread.nextFloat();
        System.out.print("Digite el ancho del rectangulo ");
        ancho=objread.nextFloat();
        area=obj_areas.Calcular_area_rectangulo(largo, ancho);
        System.out.print(" el area del rectangulo es " + area);
        
    }
    
}
