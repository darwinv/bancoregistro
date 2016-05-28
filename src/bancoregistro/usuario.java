/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoregistro;

/**
 *
 * @author Administrador
 */
public class usuario {
    private String nombreUsuario;
    private String clave;
    private int estado; //1 si esta activo 2 esta bloqueado
    private int tipoUsuario; // 1 es usuario normal 2 es admin
    private String tempUser;
    public int tempEstado;
    public usuario(String nombreUsuario, String clave, int estado, int tipoUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.estado = estado;
        this.tipoUsuario = tipoUsuario;
    }

    public usuario() {
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getTempUser() {
        return tempUser;
    }

    public void setTempUser(String tempUser) {
        this.tempUser = tempUser;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getEstado() {
        return estado;
    }

    public int getTempEstado() {
        return tempEstado;
    }

    public void setTempEstado(int tempEstado) {
        this.tempEstado = tempEstado;
    }
    
    
    

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    public String insertarUsuario(){
      return "INSERT INTO usuario (nombreusuario, clave, estado, tipo) VALUES ('"+this.getNombreUsuario()+"','"+this.getClave()+"','"+this.getEstado()+"','"+1+"' )";

    }
    public String modificarUsuario(){
    return "UPDATE usuario SET nombreusuario='"+this.getNombreUsuario()+"', clave='"+this.getClave()+"' WHERE nombreusuario='"+this.getTempUser()+"'";
    }
    
    public String cambiarEstado(){
    return "UPDATE usuario SET estado='"+this.getEstado()+"' WHERE nombreusuario='"+this.getTempUser()+"'";
    }
    
    public String eliminar(){
return "DELETE FROM usuario WHERE nombreusuario='"+this.getNombreUsuario()+"'";
}
}
