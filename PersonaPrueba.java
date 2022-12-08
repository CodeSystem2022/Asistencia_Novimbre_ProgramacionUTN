
package test;

import domain.Persona;
    
public class PersonaPrueba {
    private int contador;
    public static void main(String[] args) {
        Persona persona1 = new Persona("Ayelen");
        System.out.println("persona1 = " + persona1);
        Persona persona2 = new Persona("Luciana");
        System.out.println("persona2 = " + persona2);   
        // this.contador = 10; // no se puede referenciar de un contexto estático
        PersonaPrueba personaP1 = new PersonaPrueba();
        System.out.println(personaP1.getContador());
    }
    
    public void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
    public int getContador(){
        imprimir(new Persona("Ayelen"));
        return this.contador;
    }
}
