/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Usuario;
import Util.Classes.Conexao;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class UsuarioDAO extends Conexao{
    public void salvar(Usuario user){
        em.getTransaction().begin();
        em.merge(user);
        em.getTransaction().commit();
    }
    public void remover(Usuario produto){
        em.getTransaction().begin();
        em.remove(produto);
        em.getTransaction().commit();
    }
    public List<Usuario> listar(){
        em.getTransaction().begin();
        query=em.createNamedQuery("Usuario.findAll");
        em.getTransaction().commit();
        return query.getResultList();
    }
    public Usuario buscar(String Usuario){
        em.getTransaction().begin();
        query=em.createNamedQuery("Usuario.findByUsuario").setParameter("usuario", Usuario).setParameter("status", 'S');
        em.getTransaction().commit();
        return (Usuario) query.getSingleResult();
    }
}
