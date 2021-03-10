/**
 * @author Yago Gomes
 * @version 1.0
 * @since 09/03/21 08:35 PM
 * @category Model
 */
public class Cliente {

    private String nomeCliente, cpfCliente, emailCliente;
    private int idadeCliente;

    public Cliente() {
    }

    public Cliente(String nomeCliente, String cpfCliente, String emailCliente, int idadeCliente) {
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.emailCliente = emailCliente;
        this.idadeCliente = idadeCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public int getIdadeCliente() {
        return idadeCliente;
    }

    public void setIdadeCliente(int idadeCliente) {
        this.idadeCliente = idadeCliente;
    }

    public String verificarIdade() {
        if(this.idadeCliente < 18){
            return ("Menor de idade!");
        } else {
            return ("Maior de idade!");
        }
    }

    @Override
    public String toString() {
        return "\nNome do Cliente: " + this.nomeCliente
             + "\nCPF: " + this.cpfCliente
             + "\nEmail: " + this.emailCliente
             + "\nIdade: " + this.idadeCliente
             + "\n" + verificarIdade();
    }
}
