
import java.util.Scanner;


public class Generics<T> { //se usa la letra T en modo de identificación de la palabra Type para especificar un tipo de dato que podrá ser agregado
    private T atributo ;
    
    public Generics(){
    }
    
    public  Generics(T atributo){
        this.atributo = atributo;
    }
    
    public T getAtributo(){
        return this.atributo;
    }
    
    public void setAtributo(T atributo){
        this.atributo = atributo;
    }
    
    
    
    public static void main(String[] args) {
        Generics<Object> dato = new Generics<>();
        Scanner texto = new Scanner(System.in);
        dato.setAtributo(texto.nextDouble());
        System.out.println(dato.getAtributo());
    }

}
