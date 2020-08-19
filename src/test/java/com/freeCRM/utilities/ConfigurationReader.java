package com.freeCRM.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties configFile;

    static {
        try {
            String path = System.getProperty("user.dir")+"/configuration.properties";
            FileInputStream fileInputStream = new FileInputStream("configuration.properties");
            //initialize properties object
            configFile = new Properties();
            //load configuration.properties file
            configFile.load(fileInputStream);
            //close input stream
            fileInputStream.close();
        } catch (Exception e) {
            System.out.println("Failed to load properties file!");
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return configFile.getProperty(key);
    }

}
