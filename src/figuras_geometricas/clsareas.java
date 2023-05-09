/*hacer tres metodos para hallar el area de un cuadrado, un rectangulo, y un triangulo
 */
package figuras_geometricas;

/**
 *
 * @author disenoydesarrollo
 */
public class clsareas {
    private float area;
    
    
    public float Calcular_area_cuadrado(float lado){
        area=lado * lado;
        return area;
    }//fin funcion cuadrado
    
    public float Calcular_area_rectangulo(float largo,float ancho){
        area= largo * ancho;
        return area;
        
    }//fin funcion triangulo
   
    public float Calcular_area_circulo(float radio){
        area=(float)Math.PI * radio * radio;
        return area;
        
    }
}



