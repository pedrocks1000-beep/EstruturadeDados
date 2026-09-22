package ListaDuplamenteEncadeada;

public class Principal {
    public static void main(String[] args){
        ListaDupla<Produto> lista 
        = new ListaDupla<Produto>("Produtos");
        Produto p1 = new Produto("nome",900);
        Produto p2 = new Produto( "Mouse", 60.50);
        Produto p3 = new Produto("Monitor", 800.00);
        Produto p4 = new Produto("Arma Biologica", 10000);
        Produto p5 = new Produto("Robo", 20000);
        
        lista.addInicio(p1);   
        lista.addFinal(p2);       
        lista.addMeio(p3,1);  

        System.out.println("Lista inicial ");
        lista.imprimeLista();

        Produto removido = lista.removeMeio(1);
        System.out.println("removido:");
        System.out.println(removido);

        lista.addInicio(p4);
        lista.addFinal(p5);

        System.out.println(" Lista final");
        lista.imprimeLista();
    }
}