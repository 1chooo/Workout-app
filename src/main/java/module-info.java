module stu_109601003.finalproject {
  requires javafx.controls;
  requires javafx.fxml;

  requires org.controlsfx.controls;
  requires com.dlsc.formsfx;
  requires org.kordamp.bootstrapfx.core;
  requires transitive javafx.graphics;
  


  opens stu_109601003.finalproject to javafx.fxml;
  exports stu_109601003.finalproject;
}