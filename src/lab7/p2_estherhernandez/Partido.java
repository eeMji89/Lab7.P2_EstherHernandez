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
public class Partido {
    private Seleccion Local;
    private Seleccion visita;
    private int goles;
    private int posesion;
    private int tirosT;
    private int tirosM;
    private int faltas;
    private ArrayList <Jugador> jfaltas;
    private ArrayList <Jugador> jtatjetaA;
    private ArrayList <Jugador> jtatjetaR;
    private ArrayList <Jugador> jgol;

    public Partido() {
    }

    public int getTirosM() {
        return tirosM;
    }

    public void setTirosM(int tirosM) {
        this.tirosM = tirosM;
    }
    
    
    public Partido(Seleccion Local, Seleccion visita, int goles, int posesion, int tirosT,int tirosM, int faltas, ArrayList<Jugador> jfaltas, ArrayList<Jugador> jtatjetaA, ArrayList<Jugador> jtatjetaR, ArrayList<Jugador> jgol) {
        this.Local = Local;
        this.visita = visita;
        this.goles = goles;
        this.posesion = posesion;
        this.tirosT = tirosT;
        this.faltas = faltas;
        this.jfaltas = jfaltas;
        this.jtatjetaA = jtatjetaA;
        this.jtatjetaR = jtatjetaR;
        this.jgol = jgol;
    }

    public Seleccion getLocal() {
        return Local;
    }

    public void setLocal(Seleccion Local) {
        this.Local = Local;
    }

    public Seleccion getVisita() {
        return visita;
    }

    public void setVisita(Seleccion visita) {
        this.visita = visita;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getPosesion() {
        return posesion;
    }

    public void setPosesion(int posesion) {
        this.posesion = posesion;
    }

    public int getTirosT() {
        return tirosT;
    }

    public void setTiros(int tirosT) {
        this.tirosT = tirosT;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public ArrayList<Jugador> getJfaltas() {
        return jfaltas;
    }

    public void setJfaltas(ArrayList<Jugador> jfaltas) {
        this.jfaltas = jfaltas;
    }

    public ArrayList<Jugador> getJtatjetaA() {
        return jtatjetaA;
    }

    public void setJtatjetaA(ArrayList<Jugador> jtatjetaA) {
        this.jtatjetaA = jtatjetaA;
    }

    public ArrayList<Jugador> getJtatjetaR() {
        return jtatjetaR;
    }

    public void setJtatjetaR(ArrayList<Jugador> jtatjetaR) {
        this.jtatjetaR = jtatjetaR;
    }

    public ArrayList<Jugador> getJgol() {
        return jgol;
    }

    public void setJgol(ArrayList<Jugador> jgol) {
        this.jgol = jgol;
    }

    @Override
    public String toString() {
        return "Partido{" + "Local=" + Local + ", visita=" + visita + ", goles=" + goles + ", posesion=" + posesion + ", tirosT=" + tirosT + ", tirosM=" + tirosM + ", faltas=" + faltas + ", jfaltas=" + jfaltas + ", jtatjetaA=" + jtatjetaA + ", jtatjetaR=" + jtatjetaR + ", jgol=" + jgol + '}';
    }

    
    
    
    
    
}