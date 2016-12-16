/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapatrones;

/**
 *
 * @author Estudiante
 */
public class Impresora {
    private String tipoDocumento;
    private String hoja;
    private boolean color;
    private String texto;

    public Impresora() {
    }

    public Impresora(String tipoDocumento, String hoja, boolean color, String texto) {
        this.tipoDocumento = tipoDocumento;
        this.hoja = hoja;
        this.color = color;
        this.texto = texto;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getHoja() {
        return hoja;
    }

    public void setHoja(String hoja) {
        this.hoja = hoja;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Impresora{" + "tipoDocumento=" + tipoDocumento + ", hoja=" + hoja + ", color=" + color + ", texto=" + texto + '}';
    }
    
    
}
