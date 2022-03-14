module com.example.ex2m07cardona_toni {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.ex2m07cardona_toni to javafx.fxml;
    exports com.example.ex2m07cardona_toni;
}