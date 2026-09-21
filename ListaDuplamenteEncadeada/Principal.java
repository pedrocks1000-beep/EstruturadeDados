package ListaDuplamenteEncadeada;

public class Principal {
    public static void main(String[] args){
        ListaDupla<Produto> lista 
        = new ListaDupla<Produto>("Produtos");

        lista.addInicio(new Produto("Teclado", 120.00));   
        lista.addFinal(new Produto("Mouse", 60.50));       
        lista.addMeio(new Produto("Monitor", 800.00), 1);  

        System.out.println("Lista inicial ");
        lista.imprimeLista();

        Produto removido = lista.removeMeio(1);
        System.out.println("removido:");
        System.out.println(removido);

        lista.addInicio(new Produto("Notebook", 3500.00));
        lista.addFinal(new Produto("Webcam", 250.00));

        System.out.println(" Lista final");
        lista.imprimeLista();
    }
}