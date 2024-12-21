package gym_route.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class PreviewController {
    @FXML
    Button backCurriculum;
    @FXML
    Button viewCalender;
    @FXML
    Label c00, c01, c02, c03, c04, c05, c06,
            c10, c11, c12, c13, c14, c15, c16,
            c20, c21, c22, c23, c24, c25, c26,
            c30, c31, c32, c33, c34, c35, c36,
            c40, c41, c42, c43, c44, c45, c46,
            c50, c51, c52, c53, c54, c55, c56,
            c60, c61, c62, c63, c64, c65, c66,
            c70, c71, c72, c73, c74, c75, c76;

    static Label[][] curriculumLabelMatrix;

    public void clickedBackCurriculum() throws IOException {
        SceneController.switchScene(PAGE.CURRICULUM);
    }

    public void clickedViewCalender() throws IOException {
        CalendarController calendarController = new CalendarController();
        calendarController.loadCurriculumToWeekToDayListOfWeek();
        SceneController.switchScene(PAGE.CALENDAR);
        System.out.println(CalendarController.dayListOfWeek);// test
        calendarController.displayCalendar();
    }

    public static void displayScreenArrayToPreview() throws IOException {
        for (int row = 0; row <= 7; row++) {
            for (int column = 0; column <= 6; column++) {
                curriculumLabelMatrix[row][column].setText(CurriculumController.curriculumForWeek[row][column]);
            }
        }
    }

    @FXML
    public void initialize() throws IOException {
        curriculumLabelMatrix = new Label[][] {
                { c00, c01, c02, c03, c04, c05, c06 },
                { c10, c11, c12, c13, c14, c15, c16 },
                { c20, c21, c22, c23, c24, c25, c26 },
                { c30, c31, c32, c33, c34, c35, c36 },
                { c40, c41, c42, c43, c44, c45, c46 },
                { c50, c51, c52, c53, c54, c55, c56 },
                { c60, c61, c62, c63, c64, c65, c66 },
                { c70, c71, c72, c73, c74, c75, c76 } };
    }

}