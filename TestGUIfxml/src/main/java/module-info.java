module com.cirdles.testguifxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cirdles.testguifxml to javafx.fxml;
    exports com.cirdles.testguifxml;
}