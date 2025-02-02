module com.example.scenebuilder {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.example.scenebuilder to javafx.fxml;
    exports com.example.scenebuilder;
}