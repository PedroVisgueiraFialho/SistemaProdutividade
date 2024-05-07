
package classes;

public class Usuario {
    private String nome;
    private String dn;
    private String cpf;
    private int perfil;
    private String id;

    public Usuario(String nome, String dn, String cpf, int perfil, String id) {
        this.nome = nome;
        this.dn = dn;
        this.cpf = cpf;
        this.perfil = perfil;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
    
    