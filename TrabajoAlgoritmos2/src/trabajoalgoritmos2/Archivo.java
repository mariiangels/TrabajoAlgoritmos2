/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoalgoritmos2;

/**
 *
 * @author mari1
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivo {
    

   public static Arbolito cargarDatos(){
        Arbolito arbol =new Arbolito();
        FileInputStream inputStream =null;
        Scanner sc = null;
        try{
            inputStream = new FileInputStream("Datos.txt");
            sc =new Scanner(inputStream, "UTF-8");
            while(sc.hasNextLine()){
                String[] datos = sc.nextLine().split(",");
                Persona nuevaPersona= new Persona(datos[0], datos[5],datos[6], datos[7]);
                arbol.insertarNodo(nuevaPersona);
                
                
            }
            if(sc.ioException() != null){
                throw sc.ioException();
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(inputStream != null){
                try{
                    inputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(sc != null){
                sc.close();
            }
        }
        return arbol;
        
    } 
    

}
    
    

