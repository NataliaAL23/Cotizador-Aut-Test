package co.com.sura.cotizador.test.model.web;


public class Usuario {
    private String usuario;
    private String contrasena;

    public Usuario(String usuario, String contrasena){
        this.contrasena = contrasena;
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
