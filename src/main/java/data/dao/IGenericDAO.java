/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.dao;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Shaheen-Laptop
 * @param <entity>
 */
public interface IGenericDAO<entity> {
    public entity get(Class<entity> cl, Integer id);
    public entity save(entity object);
    public void update(entity object);
    public void delete(entity object);
    public List<entity> query(String hsql, Map<String, Object> params);
}
