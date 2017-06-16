package model;

/**
 *
 * @author dcero
 */
public class DataBase {
    private String name;

    public DataBase() {
    }

    public DataBase(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}