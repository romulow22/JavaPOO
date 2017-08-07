/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula02;

/**
 *
 * @author romulo
 */
public class ClienteConta {
    
    String nome; int conta; float saldo;
    //o valor deste atributo é compartilhado/constante entre todas as estancias da classe
    static float taxa_CPMF = 0.01F; // Exemplo 1%
    
    ClienteConta(String pNome, int pConta, int pSaldo) {
    //Construtor com 3 parametros
        this.nome = pNome;
        this.conta = pConta;
        this.saldo = pSaldo;
    }
    ClienteConta(String pNome, int pConta){
    //Construtor com 2 parametros para contas que sejam abertas com no minimo 200 reais
    //O this fará referência ao construtor da classe com 3 parametros
        this(pNome,pConta,200);
    }
    

   
    ClienteConta(){
    //Construtor padrao ou sem parametros
        this.nome = "Anonimo";
        this.conta = 0000;
        this.saldo = 200;
    }
    
    void RealizaSaque (float valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
        }
    }
    
    float RequisitaSaldo(){
        return saldo;
    }
    void RealizaDeposito (float pValor){
        this.saldo += pValor*(1- taxa_CPMF);
    }
    void RealizaDeposito (float pValorNota, int pQuantNotas){
        RealizaDeposito(pValorNota*pQuantNotas);
    }
    void TransferirOutraConta(float pValor, ClienteConta pBeneficiado){
        this.RealizaSaque(pValor*(1- taxa_CPMF));
        pBeneficiado.RealizaDeposito(pValor*(1- taxa_CPMF));
    }
    //outro metodo de TransferirOutraConta
    void TransferirOutraConta1(float pValor, ClienteConta pBeneficiado){
        this.saldo = this.saldo - pValor;
        pBeneficiado.saldo = pBeneficiado.saldo + pValor;
    }
    
    public static void main(String[] args) {
        ClienteConta cliente1;
        ClienteConta cliente2, cliente3;
        //para o new funcionar deve haver o construtor ClienteBanco(pNome,pConta,pSaldo)
        cliente1 = new ClienteConta ("eu",0001,500); 
        cliente2 = new ClienteConta ("voce",0002);
        cliente3 = new ClienteConta ();
        System.out.println("Nome do cliente: "+ cliente1.nome);
        System.out.println("Saldo: "+ cliente1.saldo);
        System.out.println("Nome do cliente: "+ cliente2.nome);
        System.out.println("Saldo: "+ cliente2.saldo);
        
        cliente1.RealizaDeposito(230);
        cliente2.RealizaDeposito(50, 8);
        cliente1.TransferirOutraConta(100, cliente2);
        
        
    }
}

