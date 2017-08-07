/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula03;

/**
 *
 * @author romulo
 */
public class Slides {
    public static void main (String[] args){
        //1 byte = -128 a 127
        byte b = 2;
        //2 bytes = -32768 a 32767
        short s = 2;
        //4 bytes = +/- 2 bilhoes
        int i = 2;
        //8 bytes = +/- 9 x 10^18
        long l = 2;
        //4 bytes = +/- 3,40282347E+38
        float fl = 7.5F;
        //8 bytes = +/- 1,7976931348623E+308
        double d = 3.9;
        //Unicode (2bytes): ASCII + caracteres
        char a = 'A';
        //True ou False (1byte)
        boolean boo = true;
        
        //Operador % (resto)
        int z = b % s;
        
        // Mesma coisa que i = i + 3
        i += 3;
        
        //1o: l = b e depois: b=b+1
        l = b++;
        //1o: b=b+1 e depois: l = b
        l = ++b;
        
        //Operadores relacionais != : diferente, == : igual
        
        //Operadores logicos: && (E), || (OU), ! (NEG)
        
        //Operadores bit a bit: & (E), | (OU), ^ (OU EXCL), ~ (NEG)
        //Deslocando bit: >> (DIR), << (ESQ), >>>(DIR colocando zeros nos bits significativos
        int r,j = 10, c =2;
        //10 = 1010 e 2 = 0010
        r = j & c; // 1 e 0: 0, 0 e 0: 0, 1 e 1: 1, 0 e 0: 0 = 0010 = 2
        r = j | c; // 1 ou 0: 1, 0 ou 0: 0, 1 ou 1: 1, 0 ou 0: 0 = 1010 = 10
        r = j ^ c; // 1 ^ 0: 1, 0 ^ 0: 0, 1 ^ 1: 0, 0 ^ 0: 0 = 1000 = 8
        r = j << c; // 10 * 2 * 2 = 40;
        r = j >> c; // 10 / 2 / 2 = 2;
        r = j >>> c;
        
        //Operador condicional (?) Equivalente ao Se-entao
        int m, u = 15, k = 0;
         m = u > k ? u : k;
        if (u > k){
            m = u;
        }
        else{
            m = k;
        }
    
        //Precedencia de operadores (maior para menor)
        //
        // [] . 
        // ! ~ ++ -- (conversao_tipo)
        // * / % 
        // + -
        // << >> >>>
        // < <= > >=
        // == !=
        // &
        // |
        // &&
        // ||
        // ?:
        // = += -= *= /= %=
    
        //textos, strings e vetores
        String texto = "exemplo";
        int[] lista = {1,2,3,4,5};
        String[] nomes = {"Joao","Maria"};
    
        //Controles de fluxo:
        //Condicional (if-else)
        int a1=5, b1=3, m1;
        if ((a1>0)&&(b1>0)){
            m1 = (a1+b1)/2;
        }
        else{
            System.out.println("numero negativo");
            m1 = 0;            
        }
        //Condicional(switch-case-default)
        switch (a1){ //pode-se usar todos os tipos menos o long
            case 5:
                System.out.println(5);
                break;
            case 0:          
                System.out.println(0);
                break;
            default: //opcional
                 System.out.println("Erro");
        }
        //Repetição
        //While
        while (i<10){
            System.out.println(i);
            i++;
        }
        //Do-While
        do{
           System.out.println(i);
           i++;
        }
        while (i<10);
        //For
        for (i=0;i<10;i++)
            System.out.println(i);
        
        //Comando de desvio: Break;
        //Usado em switch-case-default e laços
        while (true){
            if(i==10) break;
            i++;
            System.out.println(i);
        }
        //Comando de saida: Return;
        //Resultado da expressao que segue o comando
    }
}