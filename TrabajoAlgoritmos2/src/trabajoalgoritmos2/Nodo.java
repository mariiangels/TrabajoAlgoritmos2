/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoalgoritmos2;

/**
 *
 * @author mari1
 */
import java.util.ArrayList;
public class Nodo {
    
    
   

/**
 *
 * @author Personal
 */


    Nodo li;
    Nodo ld;
    Persona person;

    public Nodo(Persona cedu) {
        person = cedu;
        li = null;
        ld = null;
    }

    public void busquedaPorCedula(ArrayList<String> lista, String cedula) {
        if (this.person.getCedula().equals(cedula)) {            
            lista.add(this.person.getCedula());
        }
        if (li != null) {
            li.busquedaPorCedula(lista, cedula);
        }
        if (ld != null) {
            ld.busquedaPorCedula(lista, cedula);
        }
    }

    public synchronized void insertar(Persona cedu) {
        
        int c = person.cedula.compareTo(cedu.getCedula());
        if (c==0) {
            return;
        }

        if (c>0) {
            if (li == null) {
                li = new Nodo(cedu);
                System.out.println("\n se a agregado a la izquierda: " + cedu);
            } else {
                li.insertar(cedu);
            }
        }

        if (c<0) {
            if (ld == null) {
                ld = new Nodo(cedu);
                System.out.println("se a agregado a derecha: " + person);
            } else {
                ld.insertar(cedu);
            }
        }
    }

    public String Retorno() {
        return "cedula=" + person;
    }

    public void setPersona(Persona person) {
        this.person = person;
    }
    
    
}

