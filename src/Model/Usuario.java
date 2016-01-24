/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Tadeu
 */
@Entity
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByCodusuario", query = "SELECT u FROM Usuario u WHERE u.codusuario = :codusuario"),
    @NamedQuery(name = "Usuario.findByUsuario", query = "SELECT u FROM Usuario u WHERE u.usuario = :usuario and u.ativo= :status"),
    @NamedQuery(name = "Usuario.findBySenha", query = "SELECT u FROM Usuario u WHERE u.senha = :senha"),
    @NamedQuery(name = "Usuario.findByAtivo", query = "SELECT u FROM Usuario u WHERE u.ativo = :ativo")})
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODUSUARIO")
    private Integer codusuario;
    @Column(name = "USUARIO",unique = true)
    private String usuario;
    @Basic(optional = false)
    @Column(name = "SENHA")
    private String senha;
    @Basic(optional = false)
    @Column(name = "ATIVO")
    private Character ativo;

    public Usuario() {
    }

    public Usuario(Integer codusuario) {
        this.codusuario = codusuario;
    }

    public Usuario(Integer codusuario, String senha, Character ativo) {
        this.codusuario = codusuario;
        this.senha = senha;
        this.ativo = ativo;
    }

    public Integer getCodusuario() {
        return codusuario;
    }

    public void setCodusuario(Integer codusuario) {
        this.codusuario = codusuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Character getAtivo() {
        return ativo;
    }

    public void setAtivo(Character ativo) {
        this.ativo = ativo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codusuario != null ? codusuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.codusuario == null && other.codusuario != null) || (this.codusuario != null && !this.codusuario.equals(other.codusuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Usuario[ codusuario=" + codusuario + " ]";
    }
    
}
