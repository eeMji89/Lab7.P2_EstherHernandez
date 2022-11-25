/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7.p2_estherhernandez;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Usuario {
    private String id;
    private String user;
    private String pw;
    private String tipoU;

    public Usuario() {
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
        return "Usuario{" + "id=" + id + ", user=" + user + ", pw=" + pw + ", tipoU=" + tipoU + '}';
    }
    
    
}
