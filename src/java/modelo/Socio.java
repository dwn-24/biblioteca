
package modelo;


public class Socio {
     int CODIGO_SOCIO;
     String CEDULA_SOCIO;
     String USUARIO_SOCIO;
     String NOMBRE_SOCIO;
     String APELLIDO_SOCIO;
     String TELEFONO_SOCIO;

    public Socio() {
    }

    public Socio(int CODIGO_SOCIO, String CEDULA_SOCIO, String USUARIO_SOCIO, String NOMBRE_SOCIO, String APELLIDO_SOCIO, String TELEFONO_SOCIO) {
        this.CODIGO_SOCIO = CODIGO_SOCIO;
        this.CEDULA_SOCIO = CEDULA_SOCIO;
        this.USUARIO_SOCIO = USUARIO_SOCIO;
        this.NOMBRE_SOCIO = NOMBRE_SOCIO;
        this.APELLIDO_SOCIO = APELLIDO_SOCIO;
        this.TELEFONO_SOCIO = TELEFONO_SOCIO;
    }

    public int getCODIGO_SOCIO() {
        return CODIGO_SOCIO;
    }

    public void setCODIGO_SOCIO(int CODIGO_SOCIO) {
        this.CODIGO_SOCIO = CODIGO_SOCIO;
    }

    public String getCEDULA_SOCIO() {
        return CEDULA_SOCIO;
    }

    public void setCEDULA_SOCIO(String CEDULA_SOCIO) {
        this.CEDULA_SOCIO = CEDULA_SOCIO;
    }

    public String getUSUARIO_SOCIO() {
        return USUARIO_SOCIO;
    }

    public void setUSUARIO_SOCIO(String USUARIO_SOCIO) {
        this.USUARIO_SOCIO = USUARIO_SOCIO;
    }

    public String getNOMBRE_SOCIO() {
        return NOMBRE_SOCIO;
    }

    public void setNOMBRE_SOCIO(String NOMBRE_SOCIO) {
        this.NOMBRE_SOCIO = NOMBRE_SOCIO;
    }

    public String getAPELLIDO_SOCIO() {
        return APELLIDO_SOCIO;
    }

    public void setAPELLIDO_SOCIO(String APELLIDO_SOCIO) {
        this.APELLIDO_SOCIO = APELLIDO_SOCIO;
    }

    public String getTELEFONO_SOCIO() {
        return TELEFONO_SOCIO;
    }

    public void setTELEFONO_SOCIO(String TELEFONO_SOCIO) {
        this.TELEFONO_SOCIO = TELEFONO_SOCIO;
    }
    
}
