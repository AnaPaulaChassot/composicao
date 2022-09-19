/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suporte
 */
public class composicao {
    public static void main(String[] args) {
        
        // primeira forma chamar contrutores - direta
        /*
        carro c = new carro();
        carro c2 = new carro(2000);
        */
        
        // segunda forma - dentro da classe
        /*
        carro c3 = new carro();
        c3.ligarCarro(2000);
        */
        
        //terceira forma - na própria classe menor
        
        carro c4 = new carro(0);
        motor m = new motor();
        motor m2 = new motor(2000);
        
        c4.setM(m);
        
        c4.imprimeDados();
        
       
        

    } 
}
