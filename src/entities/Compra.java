package entities;

public class Compra {

    private String nome;
    private Double valor;

    public Compra(){
    }

    public Compra(String nome, Double valor){
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double TotalCompra(){
        return valor += valor;
    }

    @Override
    public String toString(){
        return nome + ", " + valor;
    }
}
