/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.dao;

import java.util.List;
import java.util.Map;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

/**
 *
 * @author Shaheen-Laptop
 * @param <entity>
 */
public class GenericDAOImpl<entity> implements IGenericDAO<entity> {

    private final Session session;

    public GenericDAOImpl(Class<entity> cl, Session session) {
        this.session = session;
        if (session == null) {
            throw new RuntimeException("Session factory is null!!!");
        }
    }

    @Override
    public entity get(Class<entity> cl, Integer id) {
        session.getTransaction().begin();
        @SuppressWarnings("unchecked")
        entity element = (entity) session.get(cl, id);
        session.getTransaction().commit();
        return element;
    }

    @Override
    public entity save(entity object) {
        session.getTransaction().begin();
        session.save(object);
        session.getTransaction().commit();
        return object;
    }

    @Override
    public void update(entity object) {
        session.getTransaction().begin();
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(entity object) {
        session.getTransaction().begin();
        session.delete(object);
        session.getTransaction().commit();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<entity> query(String hsql, Map<String, Object> params) {
        session.getTransaction().begin();
        Query query = session.createQuery(hsql);
        if (params != null) {
            params.keySet().stream().forEach((i) -> {
                query.setParameter(i, params.get(i));
            });
        }
        List<entity> result = null;
        if ((!hsql.toUpperCase().contains("DELETE"))
                && (!hsql.toUpperCase().contains("UPDATE"))
                && (!hsql.toUpperCase().contains("INSERT"))) {
            result = query.list();
        }
        session.getTransaction().commit();
        return result;
    }

}
