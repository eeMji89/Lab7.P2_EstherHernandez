
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
public class Jugador {
    private String nombre;
    private int dorsal;
    private int goles;
    private int asistencia;
    private int pj;
    private int tarja;
    private int tarjr;
    private int faltas;
    private String posicion;
    private int porterias;
    private File archivo= null ;
    private ArrayList <Jugador> jugadores;

    public Jugador() {
    }

    public Jugador(String nombre, int dorsal, int goles, int asistencia, int pj, int tarja, int tarjr, int faltas, String posicion, int porterias) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.goles = goles;
        this.asistencia = asistencia;
        this.pj = pj;
        this.tarja = tarja;
        this.tarjr = tarjr;
        this.faltas = faltas;
        this.posicion = posicion;
        this.porterias = porterias;
    }
   
    
    public Jugador(String nombre, int dorsal, int goles, int asistencia, int pj, int tarja, int tarjr, int faltas, String posicion) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.goles = goles;
        this.asistencia = asistencia;
        this.pj = pj;
        this.tarja = tarja;
        this.tarjr = tarjr;
        this.faltas = faltas;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }

    public int getPj() {
        return pj;
    }

    public void setPj(int pj) {
        this.pj = pj;
    }

    public int getTarja() {
        return tarja;
    }

    public void setTarja(int tarja) {
        this.tarja = tarja;
    }

    public int getTarjr() {
        return tarjr;
    }

    public void setTarjr(int tarjr) {
        this.tarjr = tarjr;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "|" + nombre + "|" + dorsal + "|" + goles + "|" + asistencia + "|" + pj + "|" + tarja + "|" + tarjr + "|" + faltas + "|" + posicion ;
    }
    public String toStringP(){
                return "/" + nombre + "/" + dorsal + "/" + goles + "/" + asistencia + "/" + pj + "/" + tarja + "/" + tarjr + "/" + faltas + "/" + posicion + "/"+porterias;

    }
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Jugador t : jugadores) {
                bw.write(jugadores.toString());
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
        jugadores = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("|");
                while (sc.hasNext()) {
                    jugadores.add(new Jugador(sc.next(),
                                    sc.nextInt(),
                                    sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.next(),
                                    sc.nextInt()));
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            sc.close();
        }
    }
    
    
}
