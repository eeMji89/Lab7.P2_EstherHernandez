
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
public class Usuario {
    private String id;
    private String user;
    private String pw;
    private String tipoU;
    private File archivo= null ;
    private ArrayList <Usuario> Usuarios;
    public Usuario() {
    }
    public Usuario(String path){
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Usuario> getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> Usuarios) {
        this.Usuarios = Usuarios;
    }
    
    public Usuario(String id, String user, String pw, String tipoU) {
        this.id = id;
        this.user = user;
        this.pw = pw;
        this.tipoU = tipoU;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getTipoU() {
        return tipoU;
    }

    public void setTipoU(String tipoU) {
        this.tipoU = tipoU;
    }

    @Override
    public String toString() {
        return  id + "," + user + "," + pw + "," + tipoU+",";
    }
    
    public void escribirArchivo() throws IOException {
        
      FileWriter fw = null;
      BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo,false);
            bw = new BufferedWriter(fw);
            for (Usuario usuario : Usuarios) {
                bw.write(usuario.toString());
                
            }
            bw.flush();
        } catch (Exception e) {
        }
      bw.close();
      fw.close();
        
    }
    public void cargarArchivo(){
        Scanner sc = null;
        Usuarios = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(",");
                while(sc.hasNext()){
                    Usuarios.add(new Usuario
        (sc.next(),sc.next(),sc.next(),sc.next()));
                }
            } catch (Exception e) {
            }
            sc.close();
        }
        
    }
}
