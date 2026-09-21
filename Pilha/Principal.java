package Pilha;

public class Principal{
    public static void main(String[] args){
        // Testando Pilha
        System.out.println("=== Testando a Pilha ===");
        Pilha<String> pilha = new Pilha<String>("Linguagens de Programação");
        pilha.push("Java");
        pilha.push("Python");
        pilha.push("HTML");

        pilha.pop();

        pilha.imprimePilha();
    }
}
