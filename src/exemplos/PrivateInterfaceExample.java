package exemplos;

import models.EventLogs;

public class PrivateInterfaceExample {

    public static void main(String[] args) {
        EventLogs log = new EventLogs() {};
        log.logError("Error log test!");
    }

}
