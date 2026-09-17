package Fila;



public class Principal{
public static void main(String[] args){
System.out.println("=== Testando a Fila ===");
Fila<String> fila = new Fila<String>("Nomes dos alunos");
fila.enfileirar("Peter");
fila.enfileirar("Parker");
fila.enfileirar("Mary Jane");

fila.imprimeFila();

fila.enfileirar("Roberta");
fila.enfileirar("Laiane");

fila.imprimeFila();

    
}
}
