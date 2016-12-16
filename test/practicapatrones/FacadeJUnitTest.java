/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicapatrones;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Estudiante
 */
public class FacadeJUnitTest {
    
    public FacadeJUnitTest() {
    }
    
@Test
    public void testFachadaImpresora(){
        FacadeImpresora impre = new FacadeImpresora();
        String impresora1 = impre.imprimirNormal("texto1");
        String impresora2 = impre.imprimirAdicional("texto2");
        
        System.out.println(impresora2);
        
        assertEquals(impresora1, "Impresora {tipoDocumento=PDF, hoja=A4, color=true, texto=texto1}");
        assertEquals(impresora2, "Impresora {tipoDocumento=excel, hoja=a3, color=false, texto=texto2}");

    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
