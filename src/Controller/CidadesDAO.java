/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cidade;
import Util.Classes.Conexao;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class CidadesDAO extends Conexao{
    public void salvar(Cidade cidade){
        em.getTransaction().begin();
        em.merge(cidade);
        em.getTransaction().commit();
    }
    public void remover(Cidade cidade){
        em.getTransaction().begin();
        em.remove(cidade);
        em.getTransaction().commit();
    }
    public List<Cidade> listar(){
        em.getTransaction().begin();
        query=em.createNamedQuery("Cidade.findAll");
        em.getTransaction().commit();
        return query.getResultList();
    }
    public Cidade buscar(String descricao){
        em.getTransaction().begin();
        query=em.createNamedQuery("Cidade.findByDescricao").setParameter("descricao", descricao);
        em.getTransaction().commit();
        return (Cidade) query.getSingleResult();
    }
}
