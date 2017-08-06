/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.interactor;

import data.entity.StudentModel;
import data.logger.StudentRepoLogger;
import intermediary.util.HibernateUtil;
import intermediary.util.Utility;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Shaheen-Laptop
 */
public class StudentConsoleInteractor {

    StudentRepoLogger repository;
    Scanner scanner;

    public StudentConsoleInteractor() {
        scanner = new Scanner(System.in);
        repository = new StudentRepoLogger(StudentModel.class,
                HibernateUtil.getSessionFactory().openSession());
    }

    public void back() {
        Utility.clearScreen();
    }

    public void add() {
        StudentModel model = new StudentModel();
        System.out.println("Enter your first name: ");
        model.setFirstName(scanner.nextLine());
        System.out.println("Enter your last name: ");
        model.setLastName(scanner.nextLine());
        System.out.println("Enter your mobile number: ");
        model.setMobilePhone(scanner.nextLine());
        System.out.println("Enter your Telgram Id: ");
        model.setTelegramId(scanner.nextLine());
        System.out.println("Enter your Bitrhday: ");
        model.setBirthDate(new Date(scanner.nextLine()));
        model.setCreatedDate(new Date());
        model.setUpdatedDate(new Date());
        model.setUniqueId(UUID.randomUUID().toString());
        repository.save(model);
    }

    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void search() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void showAll() {
        List<StudentModel> students = repository.getAll();
        if (students.size() > 0) {
            Utility.tableViewer(students);
            return;
        }
        System.out.println("There is no Student to Observe!");
    }
}
