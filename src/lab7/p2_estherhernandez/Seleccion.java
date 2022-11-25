/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7.p2_estherhernandez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Seleccion {
    private String nombre;
    private int PJ;
    private int PG;
    private int PE;
    private int PP;
    private int GF;
    private int GC;
    private int Dif;
    private ArrayList <Jugador> Jugadores;
     private File archivo= null ;
    private ArrayList <Seleccion> Selecciones;

    public Seleccion() {
    }
    public Seleccion(String path){
        archivo = new File(path);
    }

    public Seleccion(String nombre, int PJ, int PG, int PE, int PP, int GF, int GC, int Dif) {
        this.nombre = nombre;
        this.PJ = PJ;
        this.PG = PG;
        this.PE = PE;
        this.PP = PP;
        this.GF = GF;
        this.GC = GC;
        this.Dif = Dif;
    }
    
    public Seleccion(String nombre, int PJ, int PG, int PE, int PP, int GF, int GC, int Dif, ArrayList<Jugador> Jugadores) {
        this.nombre = nombre;
        this.PJ = PJ;
        this.PG = PG;
        this.PE = PE;
        this.PP = PP;
        this.GF = GF;
        this.GC = GC;
        this.Dif = Dif;
        this.Jugadores = Jugadores;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Seleccion> getSelecciones() {
        return Selecciones;
    }

    public void setSelecciones(ArrayList<Seleccion> Selecciones) {
        this.Selecciones = Selecciones;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPJ() {
        return PJ;
    }

    public void setPJ(int PJ) {
        this.PJ = PJ;
    }

    public int getPG() {
        return PG;
    }

    public void setPG(int PG) {
        this.PG = PG;
    }

    public int getPE() {
        return PE;
    }

    public void setPE(int PE) {
        this.PE = PE;
    }

    public int getPP() {
        return PP;
    }

    public void setPP(int PP) {
        this.PP = PP;
    }

    public int getGF() {
        return GF;
    }

    public void setGF(int GF) {
        this.GF = GF;
    }

    public int getGC() {
        return GC;
    }

    public void setGC(int GC) {
        this.GC = GC;
    }

    public int getDif() {
        return Dif;
    }

    public void setDif(int Dif) {
        this.Dif = Dif;
    }

    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }

    public void setJugadores(ArrayList<Jugador> Jugadores) {
        this.Jugadores = Jugadores;
    }

    @Override
    public String toString() {
        return   "="+ nombre + "=" + PJ + "=" + PG + "=" + PE + "=" + PP + "=" + GF + "=" + GC + "=" + Dif + "=" + Jugadores ;
    }
    public void escribirArchivo() throws IOException {
        
      FileWriter fw = null;
      BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo,false);
            bw = new BufferedWriter(fw);
            for (Seleccion sel : Selecciones) {
                bw.write(sel.toString());
                
            }
            bw.flush();
        } catch (Exception e) {
        }
      bw.close();
      fw.close();
        
    }
    public void cargarArchivo(){
        Scanner sc = null;
        Selecciones = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("=");
                while(sc.hasNext()){
                    Selecciones.add(new Seleccion
                            (sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt(),
                            sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()));
                }
            } catch (Exception e) {
            }
            sc.close();
        }
        
    }
    
}
