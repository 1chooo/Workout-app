package gym_route.handlers.Parts;

import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import gym_route.equipments.BodyPartEquipment;
import gym_route.equipments.ShoulderEquipments;
import gym_route.handlers.EquipmentHandler;
import gym_route.handlers.MusclePartHandler;
import gym_route.parts.SHOULDER;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.Pane;

public class ShoulderHandler extends MusclePartHandler {
    private ChoiceBox<String> shoulder;
    private ListView<String> machine;
    private ListView<String> cable;
    private ListView<String> freeWeight;
    private Pane display_muscle;

    private String imagePath = "./src/main/resources/gym_route/imgs/parts/shoulder.jpg";

    private ShoulderEquipments shoulderEquipments = new ShoulderEquipments();
    private BodyPartEquipment shoulderEquipment = shoulderEquipments.getShoulderEquipment();
    private BodyPartEquipment frontDeltoidEquipment = shoulderEquipments.getFrontDeltoidEquipment();
    private BodyPartEquipment middleDeltoidEquipment = shoulderEquipments.getMiddleDeltoidEquipment();
    private BodyPartEquipment rearDeltoidEquipment = shoulderEquipments.getRearDeltoidEquipment();
    private BodyPartEquipment trapeziusEquipment = shoulderEquipments.getTrapeziusEquipment();

    private EquipmentHandler equipmentHandler = new EquipmentHandler();

    private SHOULDER[] shoulders = {
            SHOULDER.SHOULDER, SHOULDER.FRONT_DELTOID, SHOULDER.MIDDLE_DELTOID,
            SHOULDER.REAR_DELTOID, SHOULDER.TRAPEZIUS };

    public ShoulderHandler(
            ChoiceBox<String> shoulder, Pane display_muscle,
            ListView<String> machine, ListView<String> cable,
            ListView<String> freeWeight) {
        this.shoulder = shoulder;
        this.display_muscle = display_muscle;
        this.machine = machine;
        this.cable = cable;
        this.freeWeight = freeWeight;
    }

    @Override
    public void handle(MouseEvent event) {
    }

    public void shoulderHandle() {
        displayArmImage(imagePath, display_muscle);

        equipmentHandler.updateEquipment(
                shoulder, SHOULDER.SHOULDER, shoulderEquipment,
                machine, cable, freeWeight);

        shoulder.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(
                    ObservableValue<? extends Number> observableValue,
                    Number number, Number t1) {
                if (shoulders[t1.intValue()] == SHOULDER.SHOULDER) {
                    equipmentHandler.setEquipment(
                            shoulderEquipment, machine, cable, freeWeight);
                } else if (shoulders[t1.intValue()] == SHOULDER.FRONT_DELTOID) {
                    equipmentHandler.setEquipment(
                            frontDeltoidEquipment, machine, cable, freeWeight);
                } else if (shoulders[t1.intValue()] == SHOULDER.MIDDLE_DELTOID) {
                    equipmentHandler.setEquipment(
                            middleDeltoidEquipment, machine, cable, freeWeight);
                } else if (shoulders[t1.intValue()] == SHOULDER.REAR_DELTOID) {
                    equipmentHandler.setEquipment(
                            rearDeltoidEquipment, machine, cable, freeWeight);
                } else if (shoulders[t1.intValue()] == SHOULDER.TRAPEZIUS) {
                    equipmentHandler.setEquipment(
                            trapeziusEquipment, machine, cable, freeWeight);
                } else {
                }
            }
        });
    }
}
