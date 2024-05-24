/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoalgoritmos2;

/**
 *
 * @author mari1
 */
public class TrabajoAlgoritmos2 {

  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Arbolito arbol = new Arbolito();

    System.out.println("Raíz: " + arbol.retornaraiz().person.getCedula());
    System.out.println("\nEn orden:");
    arbol.getInOrden(arbol.retornaraiz());
    System.out.println("\nEn pre-orden:");
    arbol.getPreOrden(arbol.retornaraiz());
    System.out.println("\nEn post-orden:");
    arbol.getPostOrden(arbol.retornaraiz());
    System.out.println("\nHojas:");
    arbol.getHoja(arbol.retornaraiz());
    System.out.println("\nModificando la persona");
    arbol.modificarPersona("nombreActual", "nuevoNombre");
}


}

