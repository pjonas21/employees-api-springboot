package com.pjonas.employees.models;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_out_employees")
public class OutEmployeeModel implements Serializable {

    private static final long serialVersionUID = 2L;

    @Id
    private String matriculaId;
    private String numeral;
    private String postoGrad;
    private String nomeCompleto;
    private Date dataNascimento;
    private String cpf;
    private String idCivil;
    
    public String getMatriculaId() {
        return matriculaId;
    }
    public void setMatriculaId(String matriculaId) {
        this.matriculaId = matriculaId;
    }
    public String getNumeral() {
        return numeral;
    }
    public void setNumeral(String numeral) {
        this.numeral = numeral;
    }
    public String getPostoGrad() {
        return postoGrad;
    }
    public void setPostoGrad(String postoGrad) {
        this.postoGrad = postoGrad;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getIdCivil() {
        return idCivil;
    }
    public void setIdCivil(String idCivil) {
        this.idCivil = idCivil;
    }
    
}
