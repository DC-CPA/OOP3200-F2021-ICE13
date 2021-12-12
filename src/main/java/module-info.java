module ca.durhamcollege.oop3200f2021ice {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.durhamcollege.oop3200f2021ice to javafx.fxml;
    exports ca.durhamcollege.oop3200f2021ice;
}