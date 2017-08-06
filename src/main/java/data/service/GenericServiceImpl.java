/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.service;

import data.dao.GenericDAOImpl;
import data.dao.IGenericDAO;
import java.util.List;
import java.util.Map;
import org.hibernate.Session;


public class GenericServiceImpl<entity> implements IGenericService<entity> {

    private final IGenericDAO<entity> dao;
    private final Class<entity> cl;

    public GenericServiceImpl(Class<entity> cl, Session session) {
        this.cl = cl;
        dao = new GenericDAOImpl<>(cl, session);
    }

    @Override
    public entity get(Class<entity> cl, Integer id) {
        return (entity) dao.get(cl, id);
    }

    @Override
    public entity save(entity object) {
        return (entity) dao.save(object);
    }

    @Override
    public void update(entity object) {
        dao.update(object);
    }

    @Override
    public void delete(entity object) {
        dao.delete(object);
    }

    @Override
    public List<entity> query(String hsql, Map<String, Object> params) {
        return (List<entity>) dao.query(hsql, params);
    }

    @Override
    public List<entity> getAll() {
        return query("from " + cl.getName(), null);
    }

    @Override
    public void deleteAll() {
        query("delete from " + cl.getName(), null);
    }
}
