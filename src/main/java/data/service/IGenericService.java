/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.service;

import data.dao.IGenericDAO;
import java.util.List;

/**
 *
 * @author Shaheen-Laptop
 * @param <entity>
 */
public interface IGenericService<entity> extends IGenericDAO<entity> {

    List<entity> getAll();

    void deleteAll();
}
