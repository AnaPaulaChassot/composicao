/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suporte
 */
public class motor {
    private int potencia;
    
    
   public motor(){
       potencia=1000; //valor padrão
   }

   public motor(int potencia){
       this.potencia=potencia; // novo valor definido 
   }
   
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
}
