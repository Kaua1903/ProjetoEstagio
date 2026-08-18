public class Produto {
    private String nome;
    private int quantidade;
    
    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }
    
    public String getNome() {
        return nome;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        if (quantidade > 0) {
            quantidade++;
        }else {
            System.out.println("Número de quantidade inválido");
        }
    }

}
