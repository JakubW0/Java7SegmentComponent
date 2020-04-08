package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Slider;

public class Controller {
    @FXML
    CustomSevenSegmentComponent custom;
    @FXML
    Button btn,btn1;
    @FXML
    ColorPicker pickerOn,pickerOFF,pickerBackground;
    @FXML
    Slider sliderValue,stroke;
    @FXML
    CheckBox firstDot,secondDot,thirdDot,fourthDot;

    public void Controller() {
    }

    @FXML
    public void initialize() {

    }

    @FXML
    public void onBtn() {
 custom.startAlarm();
    }
    @FXML
    public void onBtn1() {
        custom.stopAlarm();
    }
    @FXML
    public void OnPickerOn(){
        custom.setColorOnSegment(pickerOn.getValue());
    }
    @FXML
    public void OnPickerOFF(){
        custom.setColorOFFSegment(pickerOFF.getValue());
    }
    @FXML
    public  void OnPickerBackground(){
        custom.setBackgroundSegment(pickerBackground.getValue());
    }
    @FXML
    public void onDrag(){
        custom.setValue((int)sliderValue.getValue());
        System.out.println((int)sliderValue.getValue());
    }
  @FXML
  public void onStroke(){
        custom.setStroke(stroke.getValue());
  }
    @FXML
    public void onDot1(){
        if(firstDot.isSelected() == true) {
            custom.showDotFirst(true);
        }
        else{
            custom.showDotFirst(false);
        }
    }
    @FXML
    public void onDot2(){
        if(secondDot.isSelected() == true) {
            custom.showDotSecond(true);
        }
        else{
            custom.showDotSecond(false);
        }
    }
    @FXML
    public void onDot3(){
        if(thirdDot.isSelected() == true) {
            custom.showDotThird(true);
        }
        else{
            custom.showDotThird(false);
        }
    }
    @FXML
    public void onDot4(){
        if(fourthDot.isSelected() == true) {
            custom.showDotFourth(true);
        }
        else{
            custom.showDotFourth(false);
        }
    }

}


