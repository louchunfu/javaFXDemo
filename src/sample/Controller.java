package sample;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.text.TextAlignment;

import java.awt.*;



public class Controller {
    public Label label ;
    public void test(){

//        System.out.println("hello,JavaFX");

        label.setAlignment(Pos.CENTER);
        label.setText("Hello,JavaFX!");
    }
}
