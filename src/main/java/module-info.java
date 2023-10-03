module com.example.comp1011assingment1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.comp1011assingment1 to javafx.fxml;
    exports com.example.comp1011assingment1;
}