package ListaDuplamenteEncadeada;

public class ListaDupla<T>{
    private String nomeLista;
    private int tamanho;
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    public ListaDupla(){
        this("Lista Dupla");
    }

    public ListaDupla(String nomeLista){
        this.nomeLista = nomeLista;
        this.tamanho = 0;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public void addInicio(T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado);

        if(primeiroNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        }else{
            novoNo.setProximoNo(primeiroNo);
            primeiroNo.setAnteriorNo(novoNo);
            primeiroNo = novoNo;
        }
        tamanho++;
        atualizaIndice();
    }

    public T removeInicio(){
        if(primeiroNo == null){
            System.out.println("Lista Vazia!");
            return null;
        }else{
            T dadoTemp = primeiroNo.getDado();
            primeiroNo = primeiroNo.getProximoNo();

            if(primeiroNo != null){
                primeiroNo.setAnteriorNo(null);
            }else{
                ultimoNo = null;
            }
            tamanho--;
            atualizaIndice();
            return dadoTemp;
        }
    }

    public void addMeio(T dado, int posicao){
        if(posicao <= 0){
            addInicio(dado);
            return;
        }

        if(posicao >= tamanho){
            addFinal(dado);
            return;
        }

        NoDuplo<T> novoNo = new NoDuplo<T>(dado);
        NoDuplo<T> atual = primeiroNo;
        int indice = 0;

        while (atual != null && indice < posicao) {
            atual = atual.getProximoNo();
            indice++;
        }

        novoNo.setProximoNo(atual);
        novoNo.setAnteriorNo(atual.getAnteriorNo());
        novoNo.getAnteriorNo().setProximoNo(novoNo);
        novoNo.getProximoNo().setAnteriorNo(novoNo);
        tamanho++;
        atualizaIndice();
    }

    public T removeMeio(int posicao){
        if(posicao <= 0){
            return removeInicio();
        }

        if(posicao >= tamanho - 1){
            return removeFinal();
        }

        NoDuplo<T> atual = primeiroNo;
        int indice = 0;

        while (atual != null && indice < posicao) {
            atual = atual.getProximoNo();
            indice++;
        }

        T dadoTemp = atual.getDado();
        atual.getProximoNo().setAnteriorNo(atual.getAnteriorNo());
        atual.getAnteriorNo().setProximoNo(atual.getProximoNo());

        tamanho--;
        atualizaIndice();
        return dadoTemp;
    }

    public T removeFinal(){
        if(primeiroNo == null){
            System.out.println("Lista Vazia!");
            return null;
        }else{
            T dadoTemp = ultimoNo.getDado();
            ultimoNo = ultimoNo.getAnteriorNo();
            if(ultimoNo != null){
                ultimoNo.setProximoNo(null);
            }else{
                primeiroNo = null;
            }
            tamanho--;
            return dadoTemp;
        }
    }

    public void addFinal(T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado);
        if(primeiroNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        }else{
            novoNo.setAnteriorNo(ultimoNo);
            ultimoNo.setProximoNo(novoNo);
            ultimoNo = novoNo;
        }
        ultimoNo.setIndice(tamanho);
        tamanho++;
    }

    public void imprimeLista(){
        if(primeiroNo == null){
            System.out.println("Lista Vazia!");
        }else{
            System.out.println("Dados da Lista: " + nomeLista);
            NoDuplo<T> aux = primeiroNo;
            while (aux != null) {
                System.out.printf("%s ", aux.toString());
                aux = aux.getProximoNo();
            }
            System.out.println();
        }
    }

    public void atualizaIndice(){
        NoDuplo<T> atual = primeiroNo;
        int indice = 0;
        while (atual != null) {
            atual.setIndice(indice);
            atual = atual.getProximoNo();
            indice++;
        }
    }

    public int getTamanho(){
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(nomeLista + ": [");
        NoDuplo<T> aux = primeiroNo;
        while (aux != null) {
            sb.append(aux.toString());
            if(aux.getProximoNo() != null){
                sb.append(", ");
            }
            aux = aux.getProximoNo();
        }
        return sb.append("]").toString();
    }

}