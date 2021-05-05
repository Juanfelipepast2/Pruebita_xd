
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Principal {

    public static void main(String[] args) {

        //código no genérico
        LinkedList lista = new LinkedList();
        lista.add("XD");
        /*incorrecto */
        //String texto = lista.getFirst();   //no se puede tomar un elemento de la estructura de datos que no tiene especificado su tipo de dato sin antes haberlo casteado

        //correcto
        String texto = (String) lista.getFirst();
        System.out.println(texto);
        
        System.out.println("----------------------------------------------");
        
        //código generico
        //LinkedList <String>lista_generica = new LinkedList<String>(); se puede introducir el tipo de dato en el segundo diamante así como no, no es necesario
        LinkedList <String>lista_generica = new LinkedList<>();  //se usa el operador diamante para especificar el tipo de dato que tendrán los datos de la estructura, 
        //esto no es posible hacer con datos primitivos ejemplo: int, double, boolean etc
        lista_generica.add("XDn't");
        /*incorrecto */
        //String texto = lista.getFirst();   //no se puede tomar un elemento de la estructura de datos que no tiene especificado su tipo de dato sin antes haberla casteado
        
        //correcto
        String texto2 = lista_generica.getFirst();   //ya no es necesario castear el dato
        System.out.println(texto2);
    }
}
