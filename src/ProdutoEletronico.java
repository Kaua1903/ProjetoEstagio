public class ProdutoEletronico extends Produto {
    private int mesesGarantia;
    public ProdutoEletronico(String nome, int quantidade, int mesesGarantia){
        super(nome, quantidade);
        this.mesesGarantia = mesesGarantia;
    }
    public int getMesesGarantia() {
        return mesesGarantia;
    }
    @Override
    public String exibirDetalhes(){
        return super.exibirDetalhes() + " | Garantia: " + mesesGarantia + " meses.";
    }
}
