package model;

/**
 *
 * @author dcero
 */
public class Parameter {
    private String host;
    private String user;
    private String pass;

    public Parameter(String host, String user, String pass) {
        this.host = host;
        this.user = user;
        this.pass = pass;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}