/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.ClienteRsj;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author User
 */
public class ClienteDAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void upedate(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ClienteRsj.class);
        criteria.add(Restrictions.eq("idclienteRsj", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0);
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ClienteRsj.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

   

    public List listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ClienteRsj.class);
        criteria.add(Restrictions.like("nomeRsj", "%" + nome + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;

    }

        public List listNomeCep(String nome, String cep){
        session.beginTransaction();
       Criteria criteria = session.createCriteria(ClienteRsj.class);
        criteria.add(Restrictions.like("nomeRsj", "%" + nome + "%"));
        criteria.add(Restrictions.like("cepRsj", "%" + cep + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
    return lista;
   
    
    }    
    public List listCep(String cep){
        session.beginTransaction();
       Criteria criteria = session.createCriteria(ClienteRsj.class);
        criteria.add(Restrictions.like("cepRsj", "%" + cep + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
    return lista;
   
    
    }  

}
