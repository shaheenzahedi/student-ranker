/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.logger;

import data.entity.LogModel;
import data.entity.StudentModel;
import data.service.GenericServiceImpl;
import data.service.IGenericService;
import intermediary.util.HibernateUtil;
import java.util.Date;
import org.hibernate.Session;
import java.sql.Timestamp;

/**
 *
 * @author Shaheen-Laptop
 */
public class StudentRepoLogger extends GenericServiceImpl<StudentModel> {

    IGenericService<LogModel> log;

    public StudentRepoLogger(Class<StudentModel> cl, Session session) {
        super(cl, session);
        this.log = new GenericServiceImpl<>(LogModel.class, HibernateUtil.getSessionFactory().openSession());
    }

    @Override
    public StudentModel save(StudentModel object) {
        StudentModel savedModel = super.save(object);
        LogModel logModel = new LogModel();
        logModel.setTimeStamp(new Timestamp(System.currentTimeMillis()));
        log.save(logModel);
        return savedModel;
    }

    @Override
    public void update(StudentModel object) {
        super.update(object);
        LogModel logModel = new LogModel();
        logModel.setTimeStamp(new Date());
        log.save(logModel);
    }

    @Override
    public void delete(StudentModel object) {
        super.delete(object);
        LogModel logModel = new LogModel();
        logModel.setTimeStamp(new Date());

        log.save(logModel);
    }

    @Override
    public void deleteAll() {
        super.deleteAll();
        LogModel logModel = new LogModel();
        logModel.setTimeStamp(new Date());
        logModel.setDescription("All of the records has been deleted from source!");
        log.save(logModel);
    }

}
