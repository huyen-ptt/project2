module aptech.group3.khutro {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;

	requires org.kordamp.bootstrapfx.core;

	opens aptech.group3.khutro to javafx.fxml;
	
	exports aptech.group3.khutro;
}