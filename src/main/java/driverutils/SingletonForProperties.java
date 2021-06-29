package driverutils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SingletonForProperties {
    private static SingletonForProperties instance;
    private Properties property;
    public String url;
    public String login;
    public String password;

    private SingletonForProperties() {
        this.property = new Properties();
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
            property.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.url = property.getProperty("mainPageUrl");
        this.login = property.getProperty("login");
        this.password = property.getProperty("password");
    }

    public static SingletonForProperties getInstance() {
        if (instance == null) {
            instance = new SingletonForProperties();
        }
        return instance;
    }

}
