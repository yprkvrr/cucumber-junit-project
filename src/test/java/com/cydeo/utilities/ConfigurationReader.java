package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties = new Properties();

    static {
        FileInputStream file = null;
        try {
            file = new FileInputStream("configuration.properties");

            properties.load(file);
            file.close();
        } catch (IOException e) {
            System.out.println("Error occured while reading configuration file");
            e.printStackTrace();
        }

    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
