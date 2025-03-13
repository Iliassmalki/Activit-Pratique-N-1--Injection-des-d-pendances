package dao;

import metier.IMetier;

public class DapImlv2 implements IDao {

    @Override
    public double getData() {
        System.out.println("version web service");
        return 41;
    }
}
