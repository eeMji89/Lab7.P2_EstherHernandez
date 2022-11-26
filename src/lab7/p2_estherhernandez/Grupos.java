/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7.p2_estherhernandez;

import java.io.File;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Grupos {
    ArrayList <Seleccion> lista;
    private File archivo= null ;
    private ArrayList <Grupos> grupos;

    public Grupos() {
    }
    
    
    public Grupos(ArrayList<Seleccion> lista) {
        this.lista = lista;
    }

    public ArrayList<Seleccion> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Seleccion> lista) {
        this.lista = lista;
    }
    
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Grupos g : grupos) {
                bw.write(g.toString());
            }
            bw.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo() {
        Scanner sc = null;
        grupos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("|");
                while (sc.hasNext()) {
                    grupos.add(new Grupos());
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            sc.close();
        }
    }
}
