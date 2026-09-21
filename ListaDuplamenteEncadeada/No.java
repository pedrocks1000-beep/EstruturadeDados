package ListaDuplamenteEncadeada;

public class No<T>{
    private T dado;
    private No<T> nextNo;

    public No(){
        this(null, null);
    }

    public No(T dado){
        this(dado, null);
    }

    public No(T dado, No<T> nextNo){   // corrigido: nextno → nextNo
        this.dado = dado;
        this.nextNo = nextNo;          // agora atribui o parâmetro ao campo
    }

    public void setDado(T dado){
        this.dado = dado;
    }

    public T getDado(){
        return this.dado;
    }

    public void setNextNo(No<T> nextNo){
        this.nextNo = nextNo;
    }

    public No<T> getNextNo(){
        return this.nextNo;
    }

    @Override
     public String toString(){
    return dado.toString();
}
}