package br.com.animati.CRUD;

import java.util.Date;
//getter, setter e constutor gerados automaticamente pelo inteliJ
public class Paciente {
    private long idPaciente;
    private String empresa;
    private String nome;
    private String nomeSocial;
    private String nomeMae;
    private String cpf;
    private String password;
    private String rg;
    private String sexo;
    private String dataNascimento;
    private String cep;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String municipio;
    private String profissao;
    private String nacionalidade;
    private String email;
    private String telefone;
    private String telefoneCelular;
    private String telefoneTrabalho;
    private String patId;
    private String cartaoSus;

    public static class Builder{
        private long idPaciente;
        private String empresa = "";
        private String nome;
        private String nomeSocial = "";
        private String nomeMae = "";
        private String cpf;
        private String password = "";
        private String rg = "";
        private String sexo;
        private String dataNascimento = "";
        private String cep = "";
        private String endereco = "";
        private String numero = "";
        private String complemento = "";
        private String bairro = "";
        private String municipio = "";
        private String profissao = "";
        private String nacionalidade = "";
        private String email = "";
        private String telefone = "";
        private String telefoneCelular = "";
        private String telefoneTrabalho = "";
        private String patId = "";
        private String cartaoSus = "";

        public Builder(long idPaciente, String nome, String cpf, String sexo){
            this.idPaciente=idPaciente;
            this.nome = nome;
            this.cpf = cpf;
            this.sexo = sexo;
        }

        public Builder empresa(String empresa){
            this.empresa = empresa;
            return this;
        }

        public Builder NomeSocial(String nomeSocial) {
            this.nomeSocial = nomeSocial;
            return this;
        }

        public Builder NomeMae(String nomeMae) {
            this.nomeMae = nomeMae;
            return this;
        }

        public Builder Password(String password) {
            this.password = password;
            return this;
        }

        public Builder Rg(String rg) {
            this.rg = rg;
            return this;
        }

        public Builder DataNascimento(String dataNascimento) {
            this.dataNascimento = dataNascimento;
            return this;
        }

        public Builder Cep(String cep) {
            this.cep = cep;
            return this;
        }

        public Builder Endereco(String endereco) {
            this.endereco = endereco;
            return this;
        }

        public Builder Numero(String numero) {
            this.numero = numero;
            return this;
        }

        public Builder Complemento(String complemento) {
            this.complemento = complemento;
            return this;
        }

        public Builder Bairro(String bairro) {
            this.bairro = bairro;
            return this;
        }

        public Builder Municipio(String municipio) {
            this.municipio = municipio;
            return this;
        }

        public Builder Profissao(String profissao) {
            this.profissao = profissao;
            return this;
        }

        public Builder Nacionalidade(String nacionalidade) {
            this.nacionalidade = nacionalidade;
            return this;
        }

        public Builder Email(String email) {
            this.email = email;
            return this;
        }

        public Builder Telefone(String telefone) {
            this.telefone = telefone;
            return this;
        }

        public Builder TelefoneCelular(String telefoneCelular) {
            this.telefoneCelular = telefoneCelular;
            return this;
        }

        public Builder TelefoneTrabalho(String telefoneTrabalho) {
            this.telefoneTrabalho = telefoneTrabalho;
            return this;
        }

        public Builder PatId(String patId) {
            this.patId = patId;
            return this;
        }

        public Builder cartaoSus(String cartaoSus){
            this.cartaoSus = cartaoSus;
            return this;
        }

        public Paciente Build(){
            return new Paciente(this);
        }
    }

    private Paciente(Builder builder) {
        this.idPaciente = builder.idPaciente;
        this.empresa = builder.empresa;
        this.nome = builder.nome;
        this.nomeSocial = builder.nomeSocial;
        this.nomeMae = builder.nomeMae;
        this.cpf = builder.cpf;
        this.password = builder.password;
        this.rg = builder.rg;
        this.sexo = builder.sexo;
        this.dataNascimento = builder.dataNascimento;
        this.cep = builder.cep;
        this.endereco = builder.endereco;
        this.numero = builder.numero;
        this.complemento = builder.complemento;
        this.bairro = builder.bairro;
        this.municipio = builder.municipio;
        this.profissao = builder.profissao;
        this.nacionalidade = builder.nacionalidade;
        this.email = builder.email;
        this.telefone = builder.telefone;
        this.telefoneCelular = builder.telefoneCelular;
        this.telefoneTrabalho = builder.telefoneTrabalho;
        this.patId = builder.patId;
        this.cartaoSus = builder.cartaoSus;
    }

    public long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
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

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getTelefoneTrabalho() {
        return telefoneTrabalho;
    }

    public void setTelefoneTrabalho(String telefoneTrabalho) {
        this.telefoneTrabalho = telefoneTrabalho;
    }

    public String getPatId() {
        return patId;
    }

    public void setPatId(String patId) {
        this.patId = patId;
    }

    public String getCartaoSus() {
        return cartaoSus;
    }

    public void setCartaoSus(String cartaoSus) {
        this.cartaoSus = cartaoSus;
    }
}
