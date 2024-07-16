package attestation.util;

import java.io.FileInputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Log {
    
    static{
        try(FileInputStream in = new FileInputStream("C:\\OOP\\Seminars\\Sem7\\oop-patterns-v2\\attestation\\util\\log.config")){
            LogManager.getLogManager().readConfiguration(in);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static Logger log (String className){
        return Logger.getLogger(className);
    }
}
