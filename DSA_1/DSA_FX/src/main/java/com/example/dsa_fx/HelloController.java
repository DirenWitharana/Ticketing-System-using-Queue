package com.example.dsa_fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    String temp ="";
    Queue Day1 = new Queue(1000);
    Queue Day2 = new Queue(1000);
    Queue Day3 = new Queue(1000);

    @FXML
    TextField day1Tickets;
    @FXML
    TextField day2Tickets;
    @FXML
    TextField day3Tickets;
    @FXML
    TextField yourOrder;
    @FXML
    CheckBox day1CHK;
    @FXML
    CheckBox day2CHK;
    @FXML
    CheckBox day3CHK;
    @FXML
    Label error;


    public void setDay1(Queue tickets) {
        for (int i = 1000; i < 2000; i++) {
            tickets.enqueue(i);
        }
    }

    public void setDay2(Queue tickets) {
        for (int i = 2000; i < 3000; i++) {
            tickets.enqueue(i);
        }
    }

    public void setDay3(Queue tickets) {
        for (int i = 3000; i < 4000; i++) {
            tickets.enqueue(i);
        }
    }

    public void order(ActionEvent event) throws Exception {
        if (day1CHK.isSelected() || day2CHK.isSelected() || day3CHK.isSelected()) {
            if ((day1CHK.isSelected() && Day1.isEmpty()) || (day2CHK.isSelected() && Day2.isEmpty()) || (day3CHK.isSelected() && Day3.isEmpty())) {
                error.setText("Tickets are finish for the selected day(s)");
                day1CHK.setSelected(false);
                day2CHK.setSelected(false);
                day3CHK.setSelected(false);
            } else {

                if (day1CHK.isSelected() && !(Day1.isEmpty())) {
                    temp = Day1.queueArray[Day1.front] + ", ";
                    Day1.dequeue();
                }

                if (day2CHK.isSelected() && !(Day2.isEmpty())) {
                    temp = temp + Day2.queueArray[Day2.front] + ", ";
                    Day2.dequeue();
                }
                if (day3CHK.isSelected() && !(Day3.isEmpty())) {
                    temp = temp + Day3.queueArray[Day3.front] + " ";
                    Day3.dequeue();
                }
                yourOrder.setText("Your ticket numbers are :" + temp);
                temp = "";

                day1CHK.setSelected(false);
                day2CHK.setSelected(false);
                day3CHK.setSelected(false);

                error.setText(null);


            }
        }
        else{
            error.setText("Please select day(s)");
        }
        day1Tickets.setText(String.valueOf(Day1.size()));
        day2Tickets.setText(String.valueOf(Day2.size()));
        day3Tickets.setText(String.valueOf(Day3.size()));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setDay1(Day1);
        setDay2(Day2);
        setDay3(Day3);

        day1Tickets.setText(String.valueOf(Day1.size()));
        day2Tickets.setText(String.valueOf(Day2.size()));
        day3Tickets.setText(String.valueOf(Day3.size()));

    }


}