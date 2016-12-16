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
public class ImpresoraNormal extends Impresora {
    public ImpresoraNormal() {
    }

    public ImpresoraNormal(String tipoDocumento, String hoja, boolean color, String texto) {
        super(tipoDocumento, hoja, color, texto);
    }
    
    public ImpresoraNormal(String texto) {
        super("PDF","A4",true,texto);
    }
}
