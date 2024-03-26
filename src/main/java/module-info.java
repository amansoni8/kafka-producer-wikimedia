module org.example.kafkaproducerwikimedia {
    requires javafx.controls;
    requires javafx.fxml;
    requires kafka.clients;
    requires java.desktop;
    requires okhttp.eventsource;


    opens org.example.wikimedia.kafkaproducerwikimedia to javafx.fxml;
    exports org.example.wikimedia.kafkaproducerwikimedia;
}