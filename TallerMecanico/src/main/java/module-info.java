module TallerMecanico {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
	requires junit;

    opens JavaFX to javafx.fxml;
    exports JavaFX;
}
