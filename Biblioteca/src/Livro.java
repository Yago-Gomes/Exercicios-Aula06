/**
 * @author Yago Gomes
 * @version 1.0
 * @since 09/03/21 09:20 PM
 * @category Model
 */
public class Livro {

    private String nomeLivro, nomeAutor;
    private double preco;
    private int anoLancamento;

    public Livro() {
    }

    public Livro(String nomeLivro, String nomeAutor, double preco, int anoLancamento) {
        this.nomeLivro = nomeLivro;
        this.nomeAutor = nomeAutor;
        this.preco = preco;
        this.anoLancamento = anoLancamento;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    private String verificarDesconto() {
        if(this.anoLancamento >= 1980 && this.anoLancamento <= 1989){
            return ("O desconto aplicado com sucesso!\nPreco com desconto: " + this.preco * 0.85);
        } else {
            return ("O desconto nao eh valido para esse livro.\nPreco sem desconto: " + this.preco);
        }
    }

    @Override
    public String toString() {
        return "\nNome do Livro: " + this.nomeLivro
             + "\nAutor do Livro: " + this.nomeAutor
             + "\nAno de Lancamento: " + this.anoLancamento
             + "\nPreco: " + this.preco
             + "\n" + verificarDesconto();
    }
}
