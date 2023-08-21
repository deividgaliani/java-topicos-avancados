package models;

public interface EventLogs {

    default void logInfo(String mensagem){
        log(mensagem, "INFO");
    }

    default void logWarn(String mensagem){
        log(mensagem, "WARN");
    }

    default void logError(String mensagem){
        log(mensagem, "ERROR");
    }

    private void log(String message, String type){
        System.out.println(type + ": " + message);
    }
}
