package revisao1;

public class Pessoa {
    private String nome;
    private String email;
    private String telefone;
    private Endereco endereco;

    public Pessoa() {
        endereco = new Endereco();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + " ,Email: " + email + " ,Telefone: " + telefone +
                " ,Cidade: " + endereco.getCidade() + " ,Número: " + endereco.getNumero() +
                " ,Rua: " + endereco.getRua();
    }
}