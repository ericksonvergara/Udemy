
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class ThrowsClass {
    
    public void readFiles() throws FileNotFoundException{
        File file = new File("");
        FileReader fr = new FileReader(file);
    }
    
    public void aritmetica(){
        int a[] = new int [5];
        a[5]=30/0;
    }
    
    public void aritmatica2(){
        try {
            aritmetica();
        } catch (RuntimeException e) {
            System.out.println("Runtime");
        }
        
    }
    public void readFiles2(){
        try {
            readFiles();
        } catch (FileNotFoundException exception) {
            JOptionPane.showMessageDialog(null, "El archivo no se encuentra en esta ubicación");
            exception.printStackTrace();
        }
        
    }
    
    public void readFiles3() throws FileNotFoundException{
        readFiles2();
    }
    
    public void readFiles4() throws FileNotFoundException{
        readFiles3();
    }
    
    public static void main(String[] args) {
        ThrowsClass obj = new ThrowsClass();
        obj.readFiles2();
        obj.aritmetica();
        obj.aritmatica2();
    }
    
}
