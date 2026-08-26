public class ProdutoAlimenticio extends Produto {
    private String dataValidade;
    public ProdutoAlimenticio(String nome, int quantidade, String dataValidade) {
        super(nome, quantidade);
        this.dataValidade = dataValidade;
    }
    public String getDataValidade(){
        return dataValidade;
    }
    @Override
    public String exibirDetalhes(){
        return super.exibirDetalhes() + " | Válidade: " + dataValidade;
    }
}
