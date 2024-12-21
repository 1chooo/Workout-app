package gym_route.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

public class CalendarController {
  // dayLabel_row_column
  @FXML
  Label d00, d01, d02, d03, d04, d05, d06,
      d10, d11, d12, d13, d14, d15, d16,
      d20, d21, d22, d23, d24, d25, d26,
      d30, d31, d32, d33, d34, d35, d36,
      d40, d41, d42, d43, d44, d45, d46;
  // vbox_row_column
  @FXML
  VBox b00, b01, b02, b03, b04, b05, b06,
      b10, b11, b12, b13, b14, b15, b16,
      b20, b21, b22, b23, b24, b25, b26,
      b30, b31, b32, b33, b34, b35, b36,
      b40, b41, b42, b43, b44, b45, b46;

  @FXML
  ListView<String> lv00, lv01, lv02, lv03, lv04, lv05, lv06,
      lv10, lv11, lv12, lv13, lv14, lv15, lv16,
      lv20, lv21, lv22, lv23, lv24, lv25, lv26,
      lv30, lv31, lv32, lv33, lv34, lv35, lv36,
      lv40, lv41, lv42, lv43, lv44, lv45, lv46;

  @FXML
  Button returnHome;

  @FXML
  Label year;

  Calendar calendarUseForDisplay = Calendar.getInstance();
  Calendar calendarCurrent = Calendar.getInstance();
  static Label[][] dateLabelMatrix;
  static VBox[][] cellVboxMatrix;
  static ListView[][] curriculumListViewMatrix;

  @FXML
  public void initialize() {

    dateLabelMatrix = new Label[][] {
        { d00, d01, d02, d03, d04, d05, d06 },
        { d10, d11, d12, d13, d14, d15, d16 },
        { d20, d21, d22, d23, d24, d25, d26 },
        { d30, d31, d32, d33, d34, d35, d36 },
        { d40, d41, d42, d43, d44, d45, d46 } };

    cellVboxMatrix = new VBox[][] {
        { b00, b01, b02, b03, b04, b05, b06 },
        { b10, b11, b12, b13, b14, b15, b16 },
        { b20, b21, b22, b23, b24, b25, b26 },
        { b30, b31, b32, b33, b34, b35, b36 },
        { b40, b41, b42, b43, b44, b45, b46 } };

    curriculumListViewMatrix = new ListView[][] {
        { lv00, lv01, lv02, lv03, lv04, lv05, lv06 },
        { lv10, lv11, lv12, lv13, lv14, lv15, lv16 },
        { lv20, lv21, lv22, lv23, lv24, lv25, lv26 },
        { lv30, lv31, lv32, lv33, lv34, lv35, lv36 },
        { lv40, lv41, lv42, lv43, lv44, lv45, lv46 } };

    int currentYear = calendarCurrent.get(Calendar.YEAR);
    year.setText(currentYear + "");
  }

  static ArrayList<ObservableList<String>> dayListOfWeek = new ArrayList<>();

  public void loadCurriculumToWeekToDayListOfWeek() {
    for (int column = 0; column <= 6; column++) {
      ObservableList<String> tempDayList = FXCollections.observableArrayList();
      for (int row = 0; row <= 7; row++) {
        if (CurriculumController.curriculumForWeek[row][column] != null) {
          tempDayList.add(CurriculumController.curriculumForWeek[row][column]);
        }
      }
      dayListOfWeek.add(tempDayList);
    }
  }

  public void displayCalendar() {
    calendarUseForDisplay.set(Calendar.DATE, 1);

    int currentYear = calendarCurrent.get(Calendar.YEAR);
    int currenMonth = calendarCurrent.get(Calendar.MONTH) + 1;
    int currentDate = calendarCurrent.get(Calendar.DATE);
    int weekOf1th = calendarUseForDisplay.get(Calendar.DAY_OF_WEEK) - 1;
    int daysInMonth = calendarCurrent.getActualMaximum(Calendar.DATE);

    int day = 1;
    int dayOfWeek = weekOf1th;

    for (int row = 0; row <= 4; row++) {
      for (int column = 0; column <= 6; column++) {
        if (row == 0 && column < weekOf1th) {
          dateLabelMatrix[row][column].setText("");
        } else if (day <= daysInMonth) {
          // label
          String text = String.format(" %d / %d", currenMonth, day);
          dateLabelMatrix[row][column].setText(text);
          if (day == currentDate) {
            cellVboxMatrix[row][column].setStyle("-fx-background-color: #d5ffd5");
          }
          day++;
          // listview
          curriculumListViewMatrix[row][column].setItems(dayListOfWeek.get(dayOfWeek));
          if (dayOfWeek == 6) {
            dayOfWeek = 0;
          } else {
            dayOfWeek++;
          }
        } else {
          dateLabelMatrix[row][column].setText("");
        }
      }
    }
  }

  @FXML
  protected void onBackButtonClick() throws IOException {
    SceneController.switchScene(PAGE.HOME);
    dayListOfWeek.clear();
    curriculumListViewMatrix = new ListView[][] {
        { lv00, lv01, lv02, lv03, lv04, lv05, lv06 },
        { lv10, lv11, lv12, lv13, lv14, lv15, lv16 },
        { lv20, lv21, lv22, lv23, lv24, lv25, lv26 },
        { lv30, lv31, lv32, lv33, lv34, lv35, lv36 },
        { lv40, lv41, lv42, lv43, lv44, lv45, lv46 } };
  }
}