package ListaDuplamenteEncadeada;


public class Produto {
    private String nome;
    private double preco;

    public Produto(){
        this("",0);
    }
    
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    public void setPreco(double preco){
    this.preco = preco;
}
    public void setNome(String nome){
    this.nome = nome;
}

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    @Override
    public String toString(){
        return "{nome:" + getNome()+ "}" +
                "{Preço:" + getPreco() + "}"; 
    }
}
