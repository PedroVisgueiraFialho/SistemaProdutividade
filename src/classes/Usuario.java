
package classes;

public class Usuario {
    private String nome;
    private String snome;
    private String dn;
    private String cpf;
    private String perfil;

    public Usuario(String nome, String snome, String dn, String cpf, String perfil) {
        this.nome = nome;
        this.snome = snome;
        this.dn = dn;
        this.cpf = cpf;
        this.perfil = perfil;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSnome() {
        return snome;
    }

    public void setSnome(String snome) {
        this.snome = snome;
    }

    public String getDn() {
        return dn;
    }

    public void setDn(String dn) {
        this.dn = dn;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
