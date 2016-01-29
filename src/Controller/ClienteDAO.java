/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cliente;
import Util.Classes.Conexao;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class ClienteDAO extends Conexao{
    public void salvar(Cliente cliente){
        em.getTransaction().begin();
        em.merge(cliente);
        em.getTransaction().commit();
    }
    public void remover(Cliente cliente){
        em.getTransaction().begin();
        em.remove(cliente);
        em.getTransaction().commit();
    }
    public List<Cliente> listar(){
        em.getTransaction().begin();
        query=em.createNamedQuery("Cliente.findAll");
        em.getTransaction().commit();
        return query.getResultList();
    }
    public Cliente buscar(int codigo){
        em.getTransaction().begin();
        query=em.createNamedQuery("Cliente.findByCodcliente").setParameter("codcliente", codigo);
        em.getTransaction().commit();
        return (Cliente) query.getSingleResult();
    }
}
