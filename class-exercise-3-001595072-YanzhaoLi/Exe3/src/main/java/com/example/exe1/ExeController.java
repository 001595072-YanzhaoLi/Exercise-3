package com.example.exe1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * exe controller
 *
 * @author Yanzhao Li
 * @date 2021/10/13
 */
public class ExeController {
    @FXML
    protected TextField num1;
    @FXML
    protected Label sign;
    @FXML
    protected TextField num2;
    @FXML
    protected Label re;
    private int s;
    private int n1;
    private int n2;

    /**
     * plus
     *
     * @param actionEvent actionEvent
     */
    @FXML
    protected void plus(ActionEvent actionEvent) {
        sign.setText("+");
        s=0;
    }

    /**
     * minus
     *
     * @param actionEvent actionEvent
     */
    @FXML
    protected void minus(ActionEvent actionEvent) {
        sign.setText("-");
        s=1;
    }

    /**
     * multiplication
     *
     * @param actionEvent actionEvent
     */
    @FXML
    protected void mult(ActionEvent actionEvent) {
        sign.setText("*");
        s=2;
    }

    /**
     * division
     *
     * @param actionEvent actionEvent
     */
    @FXML
    protected void divi(ActionEvent actionEvent) {
        sign.setText("/");
        s=3;
    }

    /**
     * EqualTo
     *
     * @param actionEvent actionEvent
     */
    @FXML
    protected void eq(ActionEvent actionEvent) {
        try{
            if(s==0){
                n1=Integer.parseInt(num1.getText());
                n2=Integer.parseInt(num2.getText());
                re.setText("="+(n1+n2));
            }else if(s==1){
                n1=Integer.parseInt(num1.getText());
                n2=Integer.parseInt(num2.getText());
                re.setText("="+(n1-n2));
            }else if (s==2){
                n1=Integer.parseInt(num1.getText());
                n2=Integer.parseInt(num2.getText());
                re.setText("="+(n1*n2));
            }else if (s==3){
                n1=Integer.parseInt(num1.getText());
                n2=Integer.parseInt(num2.getText());
                re.setText("="+n1/n2);
            }
        } catch (NumberFormatException e) {
            re.setText("error result");
        }


    }
}
