package AD120172;
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

class Prova{
    private Questao[] questoes;
    
    public Prova(int qtdItens){
        questoes = new Questao[qtdItens];
        questoes[0] = new Discursiva("Qual é o numero da última versão do Java?","8");
        ItemVerdadeiroFalso[] itens = new ItemVerdadeiroFalso[3];
        itens[0] = new ItemVerdadeiroFalso("Java foi lançado há mais de 20 anos atras", true);
        itens[1] = new ItemVerdadeiroFalso("OO surgiu com a linguagem Java", false);
        itens[2] = new ItemVerdadeiroFalso("Eclipse é um editor de texto multilinguagem", true);
        questoes[1] = new VerdadeiroFalso(itens);
    }
    public String toString(){
        String prova = "";
        int num = 1;
        for (Questao q : this.questoes) {
            prova += num + ")" + q + "\n";
            num ++;
        }
        return prova;
    }
    public void imprimir(Object prova){
        System.out.println(prova);
    
    }
}
    
public class AD1_2017_2 {

    public static void main(String[] args) {
        Prova prova = new Prova(2);
        prova.imprimir(prova);
    }
}
