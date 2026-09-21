package Fila;

public class Principal{
    public static void main(String[] args){
        Fila<String> fila = new Fila<String>("Nomes dos alunos");
        fila.enfileirar("Peter");
        fila.enfileirar("Parker");
        fila.enfileirar("Mary Jane");

        System.out.println(" Fila inicial ");
        fila.imprimeFila();

        System.out.println(" Aluno removido ");
        System.out.println(fila.desenfileirar());

        fila.enfileirar("Roberta");
        fila.enfileirar("Laiane");

        System.out.println("Fila final ");
        fila.imprimeFila();
    }
}