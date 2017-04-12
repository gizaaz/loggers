package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Controller {
    public static Boolean X;
    public static Boolean Y;

    /**Getters and setters*/
    public static Boolean isX(Boolean x) {
        return x;
    }
    public void setX(Boolean x) {
        X = x;
    }
    public static Boolean isY(Boolean y) {
        return y;
    }
    public void setY(Boolean y) {
        Y = y;
    }
    /***/

    String errorMessage = "!ERROR!\n Problem is caused by \"null\" variable";
    @FXML AnchorPane anchorPane;

    @FXML TextArea textArea;



    @FXML MenuButton xMenu;
    @FXML MenuButton yMenu;
    @FXML MenuItem xTrue;
    @FXML MenuItem xFalse;
    @FXML MenuItem xNaN;
    @FXML MenuItem yTrue;
    @FXML MenuItem yFalse;
    @FXML MenuItem yNaN;


    // Menu with X
    @FXML public void xTrueClick(){
        setX(true);
        xMenu.setText("True");
    }
    @FXML public void xFalseClick(){
        setX(false);
        xMenu.setText("False");
    }
    @FXML public void xNaNClick(){
        xMenu.setText("null");
        setX(null);
    }
    // Menu with Y
    @FXML public void yTrueClick(){
        setY(true);
        yMenu.setText("True");
    }
    @FXML public void yFalseClick(){
        setY(false);
        yMenu.setText("False");
    }
    @FXML public void yNaNClick(){
        yMenu.setText("null");
        setY(null);
    }

    /** <Button functions> */

    @FXML public void f1ButtonClick() {
        try {
            textArea.setText(X+"^"+Y+" = "+BoolCalculator.conjunction(X,Y));
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
        }
    }
    @FXML public void f2ButtonClick() {
        try {
            textArea.setText(X+"!→"+Y+" = "+BoolCalculator.denial_implication(X,Y));
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
        }
    }
    @FXML public void f3ButtonClick() {
        try {
            textArea.setText(X+"(Transfer X)"+Y+" = "+BoolCalculator.repeat_x(X,Y));
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
        }
    }
    @FXML public void f4ButtonClick() {
        try {
            textArea.setText(X+"!←"+Y+" = "+BoolCalculator.denial_inverse_implication(X,Y));
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
        }
    }
    @FXML public void f5ButtonClick() {
        try {
            textArea.setText(X+"(Transfer Y)"+Y+" = "+BoolCalculator.repeat_y(X,Y));
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
        }
    }
    @FXML public void f6ButtonClick() {
        try {
            textArea.setText(X+"(XOR)"+Y+" = "+BoolCalculator.denial_equivalence(X,Y));
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
        }
    }
    @FXML public void f7ButtonClick() {
        try {
            textArea.setText(X+"∨"+Y+" = "+BoolCalculator.disjunction(X,Y));
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
        }
    }
    @FXML public void f8ButtonClick() {
        try {
            textArea.setText(X+"↓"+Y+" = "+BoolCalculator.denial_disjunction(X,Y));
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
        }
    }
    @FXML public void f9ButtonClick() {
        try {
            textArea.setText(X+"↔"+Y+" = "+BoolCalculator.equivalence(X,Y));
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
        }
    }
    @FXML public void f10ButtonClick() {
        try {
            textArea.setText(X+"(Not Y)"+Y+" = "+BoolCalculator.denial_repeat_y(X,Y));
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
        }
    }
    @FXML public void f11ButtonClick() {
        try {
            textArea.setText(X+"←"+Y+" = "+BoolCalculator.inverse_implication(X,Y));
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
        }
    }
    @FXML public void f12ButtonClick() {
        try {
            textArea.setText(X+"(Not X)"+Y+" = "+BoolCalculator.denial_repeat_x(X,Y));
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
        }
    }
    @FXML public void f13ButtonClick() {
        try {
            textArea.setText(X+"→"+Y+" = "+BoolCalculator.implication(X,Y));
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
        }
    }
    @FXML public void f14ButtonClick() {
        try {
            textArea.setText(X+"↑"+Y+" = "+BoolCalculator.denial_conjunction(X,Y));
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
        }
    }

    /** </Button functions> */


    boolean flag = false; //Anchorpane unvisibillity flag that is used in method "hideAnchorPane()"
    @FXML public void hideAnchorPane(){
            anchorPane.setVisible(flag);
            flag=!flag;
    }

}
