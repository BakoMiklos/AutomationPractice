package PropertyUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesFile {

    //gandim un algoritm care sa citeasca un fisier si sa il incarce la extensia de .properties
    public Properties properties;
    public FileInputStream fileInputStream;

    public PropertiesFile(String path){
        loadFile(path);
    }

    //trebuie sa facem o metoda care sa incarce un fisier pe baza de nume
    public void loadFile(String path){
        properties = new Properties();
        try {
            fileInputStream = new FileInputStream("src/test/resources/"+path+"Resource.properties");
            properties.load(fileInputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //facem o metoda care returneaza o valoare pe baza de cheie
    public String getValueByKey(String key){
        return properties.getProperty(key);
    }

    //facem o metoda care sa returneze toate cheile + valorile intr-un hashmap
    public HashMap<String, String> getAllKeyValues(){
        HashMap<String, String> value = new HashMap<>();
        for (Object key: properties.keySet()) {
            value.put(key.toString(), properties.getProperty(key.toString()));
        }
        return value;
    }
}
