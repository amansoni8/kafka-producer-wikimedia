module org.example.kafkaproducerwikimedia {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.kafkaproducerwikimedia to javafx.fxml;
    exports org.example.kafkaproducerwikimedia;
}