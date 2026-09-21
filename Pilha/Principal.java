package Pilha;

public class Principal{
    public static void main(String[] args){
       
        System.out.println("Pilha");
        Pilha<String> pilha = 
        new Pilha<String>("Linguagens de Programação");
        
        pilha.push("Java");
        pilha.push("Python");
        pilha.push("HTML");
        pilha.imprimePilha();

        pilha.pop();
        pilha.imprimePilha();

        pilha.push("C");
        pilha.push("C++");
        pilha.imprimePilha();
    }
}
