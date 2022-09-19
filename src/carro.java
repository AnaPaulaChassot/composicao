/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suporte
 */
public class carro {
    private motor m;
    private direcao d;
    
    public carro (){
        m = new motor();
    }
    
    public void imprimeDados(){
        System.out.println("Potencia do motor: " +
                "" + m.getPotencia());
    }
    
    

    
    
    public void ligarCarro(int potencia){
        m = new motor(potencia);
    }
    
    public carro (int potencia) {
        m = new motor(potencia);
    }
    
    public motor getM() { // recupera
        return m;
    }

    public void setM(motor m) { //grava
        this.m = m;
    }

    public direcao getD() {
        return d;
    }

    public void setD(direcao d) {
        this.d = d;
    }

    void getD(direcao d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
