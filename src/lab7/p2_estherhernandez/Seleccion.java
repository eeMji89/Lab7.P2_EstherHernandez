/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7.p2_estherhernandez;

import java.util.ArrayList;

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

    public Seleccion() {
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
        return "Seleccion{" + "nombre=" + nombre + ", PJ=" + PJ + ", PG=" + PG + ", PE=" + PE + ", PP=" + PP + ", GF=" + GF + ", GC=" + GC + ", Dif=" + Dif + ", Jugadores=" + Jugadores + '}';
    }
    
    
}
