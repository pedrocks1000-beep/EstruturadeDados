package Fila;
public class Fila<T>{
    private String nomeFila;
    private No<T> primeiroNo;
    private No<T> ultimoNo;

    public Fila(){
        this("");
    }

    public Fila(String nomeFila){
        this.nomeFila = nomeFila;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public void enfileirar(T dado){
        No<T> novoNo = new No<T>(dado);

        if(primeiroNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        }else{
            ultimoNo.setNextNo(novoNo);
            ultimoNo = novoNo;
        }
    }

    public T desenfileirar(){
        if(primeiroNo == null){
            System.out.println("Fila vazia!");
            return null;
        }
        T dado = primeiroNo.getDado();
        primeiroNo = primeiroNo.getNextNo();

        if(primeiroNo == null){
            ultimoNo = primeiroNo;
        }
        return dado;
    }

    public void imprimeFila(){
        if(primeiroNo == null){
            System.out.println("Fila vazia!");
        }else{
            No<T> aux = primeiroNo;
            while (aux != null) {
                System.out.println("Dado: " + aux.toString());
                aux = aux.getNextNo();
            }
        }
    }

    public void setNomeFila(String nomeFila){
        this.nomeFila = nomeFila;
    }

    public String getNomeFila(){
        return this.nomeFila;
    }

    public void setPrimeiroNo(No<T> primeiroNo){
        this.primeiroNo = primeiroNo;
    }

    public No<T> getPrimeiroNo(){
        return this.primeiroNo;
    }

    public void setUltimoNo(No<T> ultimoNo){
        this.ultimoNo = ultimoNo;
    }

    public No<T> getUltimoNo(){
        return this.ultimoNo;
    }
}