package BackupAD1;



/**
 *
 * @author romulo
 */
class Questao {

    private String enunciado;

    public Questao(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getEnunciado() {
        return this.enunciado;
    }
}

class Discursiva extends Questao {

    private String gabarito;

    public Discursiva(String enunciado, String gabarito) {
        super(enunciado);
        this.gabarito = gabarito;
    }

    public String getGabarito() {
        return this.gabarito;
    }

    public String toString() {
        return this.getEnunciado() + "\n";
    }
}

class ItemVerdadeiroFalso extends Questao {
    
    private boolean gabarito;
    
    public ItemVerdadeiroFalso(String enunciado, boolean b) {
        super(enunciado);
        this.gabarito = b;
    }
    
    public boolean getGabarito(){
        return this.gabarito;
    }
    
    public String toString(){
        return "() " + this.getEnunciado();
    }
    
}

class VerdadeiroFalso extends Questao{
    
    ItemVerdadeiroFalso[] itens;
       
    public VerdadeiroFalso(ItemVerdadeiroFalso[] itens) {
        super("Assinale verdadeiro ou falso para os itens:");
        this.itens = itens;
    }
    public String toString(){
        String txt = "";
        for (ItemVerdadeiroFalso item: itens)
            txt = txt + item.toString() + "\n";
        return this.getEnunciado() + "\n" + txt;
    }
}
public class AD1_2017_2 {

    public static void main(String[] args) {
        Questao[] prova = new Questao[2];
        prova[0] = new Discursiva("Qual é o número da última versão de Java?", "8");
        ItemVerdadeiroFalso[] itens = new ItemVerdadeiroFalso[3];
        itens[0] = new ItemVerdadeiroFalso("Java foi lançada há mais de 20 anos atrás", true);
        itens[1] = new ItemVerdadeiroFalso("OO surgiu com a linguagem Java", false);
        itens[2] = new ItemVerdadeiroFalso("Eclipse é um editor de texto multilinguagem", true);
        prova[1] = new VerdadeiroFalso(itens);

        int num = 1;
        for (Questao q : prova) {
            System.out.print(num + ") ");
            System.out.println(q); 
            num++;
        }

    }
}
