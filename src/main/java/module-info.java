module com.example.the_will_hero_game {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.the_will_hero_game to javafx.fxml;
    exports com.example.the_will_hero_game;
}