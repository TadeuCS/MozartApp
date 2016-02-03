/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Tadeu
 */
@Entity
@Table(name = "corrida")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Corrida.findAll", query = "SELECT c FROM Corrida c"),
    @NamedQuery(name = "Corrida.findByCodcorrida", query = "SELECT c FROM Corrida c WHERE c.codcorrida = :codcorrida"),
    @NamedQuery(name = "Corrida.findByValor", query = "SELECT c FROM Corrida c WHERE c.valor = :valor")})
public class Corrida implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODCORRIDA")
    private Integer codcorrida;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private Double valor;
    @JoinColumn(name = "CODMOTORISTA", referencedColumnName = "CODMOTORISTA")
    @ManyToOne
    private Motorista codmotorista;
    @JoinColumn(name = "CODENDERECO_DESTINO", referencedColumnName = "CODENDERECO")
    @ManyToOne(optional = false)
    private Endereco codenderecoDestino;
    @JoinColumn(name = "CODENDERECO_ORIGEM", referencedColumnName = "CODENDERECO")
    @ManyToOne(optional = false)
    private Endereco codenderecoOrigem;
    @JoinColumn(name = "CODCLIENTE", referencedColumnName = "CODCLIENTE")
    @ManyToOne(optional = false)
    private Cliente codcliente;
    @JoinColumn(name = "CODSTATUSCORRIDA", referencedColumnName = "CODSTATUSCORRIDA")
    @ManyToOne
    private StatusCorrida codStatusCorrida;

    public Corrida() {
    }

    public Corrida(Integer codcorrida) {
        this.codcorrida = codcorrida;
    }

    public StatusCorrida getCodStatusCorrida() {
        return codStatusCorrida;
    }

    public void setCodStatusCorrida(StatusCorrida codStatusCorrida) {
        this.codStatusCorrida = codStatusCorrida;
    }

    public Integer getCodcorrida() {
        return codcorrida;
    }

    public void setCodcorrida(Integer codcorrida) {
        this.codcorrida = codcorrida;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Motorista getCodmotorista() {
        return codmotorista;
    }

    public void setCodmotorista(Motorista codmotorista) {
        this.codmotorista = codmotorista;
    }

    public Endereco getCodenderecoDestino() {
        return codenderecoDestino;
    }

    public void setCodenderecoDestino(Endereco codenderecoDestino) {
        this.codenderecoDestino = codenderecoDestino;
    }

    public Endereco getCodenderecoOrigem() {
        return codenderecoOrigem;
    }

    public void setCodenderecoOrigem(Endereco codenderecoOrigem) {
        this.codenderecoOrigem = codenderecoOrigem;
    }

    public Cliente getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(Cliente codcliente) {
        this.codcliente = codcliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codcorrida != null ? codcorrida.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Corrida)) {
            return false;
        }
        Corrida other = (Corrida) object;
        if ((this.codcorrida == null && other.codcorrida != null) || (this.codcorrida != null && !this.codcorrida.equals(other.codcorrida))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Corrida[ codcorrida=" + codcorrida + " ]";
    }
    
}
