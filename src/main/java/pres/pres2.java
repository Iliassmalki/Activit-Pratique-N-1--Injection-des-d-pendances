package pres;

import dao.IDao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class pres2 {
    Scanner sc = new Scanner( new File("config.txt") );
String daoClassName = sc.nextLine();
Class cdao= Class.forName(daoClassName);
IDao dao = (IDao) cdao.newInstance();
    public pres2() throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException {
    }
}
