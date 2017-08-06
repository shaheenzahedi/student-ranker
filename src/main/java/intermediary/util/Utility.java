/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediary.util;

import data.entity.StudentModel;
import dnl.utils.text.table.TextTable;
import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author Shaheen-Laptop
 */
public class Utility {

    public static void clearScreen() {
//        try {
//            Robot pressbot = new Robot();
//            pressbot.keyPress(17); // Holds CTRL key.
//            pressbot.keyPress(76); // Holds L key.
//            pressbot.keyRelease(17); // Releases CTRL key.
//            pressbot.keyRelease(76); // Releases L key.
//        } catch (AWTException ex) {
//            Logger.getLogger(Utility.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    public static void exitSystem() {
        System.out.println("Your about to quit the system, press enter to quit...");
        new Scanner(System.in).nextLine();
        System.exit(0);
    }

    public static void titleViewer(String title) {
        System.out.println("*****" + title + "*****");
    }

    public static void menuViewer(String[] menuArray) {
        for (int i = 0; i < menuArray.length; i++) {
            System.out.println(i + " - " + menuArray[i]);
        }
    }

    public static void SuccessfullViewer(String message) {
        System.out.println(message + "...");
    }

    public static void tableViewer(List<?> entityClass) {
        //inspect(entityClass.get(0).getClass());
        String[] columnNames = retriveProperties(entityClass);

        Object[][] data = retrieveListValues(entityClass);

        TextTable tt = new TextTable(columnNames, data);
        // this adds the numbering on the left 
        tt.setAddRowNumbering(true);
        // sort by the first column 
        tt.setSort(0);
        tt.printTable();
    }

    private static String[] retriveProperties(List<?> entityClass) {
        List<String> names = new ArrayList<>();
        Field[] fields = entityClass
                .get(0)
                .getClass()
                .getDeclaredFields();
        for (Field field : fields) {
            names.add(field.getName());
        }
        return names.toArray(new String[names.size()]);
    }

    private static Object[][] retrieveListValues(List<?> entityList) {
        List<Object[]> objList = new ArrayList<>();
        entityList.stream().forEach((entity) -> {
            objList.add(retriveEntityValue(entity));
        });
        return objList.toArray(new Object[entityList.size()][objList.size()]);
    }

    private static Object[] retriveEntityValue(Object enuObjects) {
        List<Object> objList = new ArrayList<>();
        try {
            Field[] fields = enuObjects
                    .getClass()
                    .getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                objList.add(field.get(enuObjects));
            }
        } catch (IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(Utility.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex);
        }
        return objList.toArray();
    }
}
