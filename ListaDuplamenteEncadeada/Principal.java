package ListaDuplamenteEncadeada;

public class Principal {
    public static void main(String[] args){
        ListaDupla<String> lista = new ListaDupla<String>("Alunos");

        lista.addInicio("Tomate");
        lista.addMeio("Rato", 1);
        lista.addFinal("Hamburger");

        lista.imprimeLista();
    }
}