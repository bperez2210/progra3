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
public class ImpresoraDemo {
     public static void main(String[] args) {
        /* ImpresoraNormal impresora1 = new ImpresoraNormal("pdf","a4",true,"texto 1");
         ImpresoraAdicional impresora2 = new ImpresoraAdicional("excel","a3",false,"texto 2");
         
         System.out.println(impresora1);
         System.out.println(impresora2);
*/
       FacadeImpresora facd = new FacadeImpresora();
       System.out.println(facd.imprimirNormal("texto_normal"));
       System.out.println(facd.imprimirAdicional("texto_adicional"));
    }
}
