package design.patterns.java.snemmani.structural.facade;

import design.patterns.java.snemmani.creational.singleton.DbSingleton;

import java.sql.Connection;

public class JdbcFacade {
    DbSingleton instance = null;

    public JdbcFacade() {
        this.instance = DbSingleton.getInstance();
    }

    public int createTable() {
        int count = 0;
        // Do somethingg here
        return count;
    }

    public int insertIntoTable() {
        return 2;
    }
}
