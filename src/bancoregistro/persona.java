/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoregistro;

/**
 *checkear como guardar booleano de java a booleano de mysql
 * @author Administrador
 */
public class persona {
    private String nombres="";
    private String apellidos="";
    private String cedula="";
    private String nroCuenta="";
    private String cuenta;
    private String faltaRecaudo;
    private String faltaFirma;
    private String fechaApertura;
    private String nroCelular;
    private String nroTelefono;
    private String observaciones;
    private int idregistro;
    public persona(){}
    
    public persona (String nom, String apell, String ced, String cuenta, 
         String frec, String ffir, String fecha, String cel, String telf, String observ)
    {
    nombres=nom;
    apellidos=apell;
    cedula=ced;
    nroCuenta=cuenta;
    faltaRecaudo=frec;
    faltaFirma=ffir;
    fechaApertura=fecha;
    nroCelular=cel;
    nroTelefono=telf;
    observaciones=observ;
    }
    
     public String getNombres(){
        return nombres;
    }
     public String getApellidos(){
        return apellidos;
    }
     public String getCedula(){
        return cedula;
    }
     public String getNroCuenta(){
         return nroCuenta;
     }
     public String getTipoCuenta(){
         return cuenta;
     }
     
     public String getFaltaRecaudo(){
         return faltaRecaudo;
     }
     
     public String getFaltaFirma(){
          return faltaFirma;
       }
   
     public String getCelular(){
             return nroCelular;
      }
       
    public String getTelefono(){
            return nroTelefono;
        }
       
    public String getObservaciones(){
            return observaciones;
      }
    
    public int getIdRegistro(){
    return idregistro;
    }
      
    public String getFecha(){
            return fechaApertura;
        }
      
     public void setNombres(String nomb){
         nombres=nomb;
       } 
    
     public void setApellidos(String apell){
        apellidos=apell;
     } 
     
     public void setCedula(String ced){
       cedula=ced;
     } 
     
     public void setNroCuenta(String nro){
        nroCuenta=nro;
      }
     
     public void setCuenta(String cuen){
     cuenta=cuen;
     }
     public void setRecaudo(String rec){
     faltaRecaudo=rec;
     }
     
      public void setFirma(String firm){
     faltaFirma=firm;
     }
     
     public void setFecha(String date){
        fechaApertura=date;
     } 
     
     public void setCelular(String cel){
         nroCelular=cel;
     } 
     
     public void setTelefono(String telf){
         nroTelefono=telf;
     }
     
     public void setObservaciones (String observ){
         observaciones=observ;
     }
     
     public void setIdRegistro(int i){
     idregistro=i;
     }
     public String insertarPersona(){
        return "INSERT INTO persona (nombre, apellido, cedula, fecha, nrocuenta,tipocuenta, celular, telefono, observacion,  faltarecaudo, faltafirma) VALUES ('"+this.getNombres()+"','"+this.getApellidos()+"','"+this.getCedula()+"','"+this.getFecha()+"','"+this.getNroCuenta()+"','"+this.getTipoCuenta()+"','"+this.getCelular()+"','"+this.getTelefono()+"','"+this.getObservaciones()+"','"+this.getFaltaRecaudo()+"','"+this.getFaltaFirma()+"' )";
    }
public String modificar(){
        return  "UPDATE persona SET nombre='"+this.getNombres()+"', apellido='"+this.getApellidos()+"', cedula='"+this.getCedula()+"', nrocuenta='"+this.getNroCuenta()+"', tipocuenta='"+this.getTipoCuenta()+"',faltarecaudo='"+this.getFaltaRecaudo()+"',faltafirma='"+this.getFaltaFirma()+ "', celular='"+this.getCelular()+"',telefono='"+this.getTelefono()+"',fecha='"+this.getFecha()+"',observacion='"+this.getObservaciones()+"' WHERE idregistro='"+this.getIdRegistro()+"'";
    } 
    
public String eliminar(){
return "DELETE FROM persona WHERE idregistro='"+this.getIdRegistro()+"'";
}
}
