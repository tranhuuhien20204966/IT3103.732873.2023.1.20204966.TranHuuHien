package hust.soict.vn.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PaintController {

    @FXML
    private Pane drawingAreaPane;

    @FXML
    private ToggleGroup toggleGroup;

    @FXML
    private RadioButton Pen;

    @FXML
    private RadioButton Eraser;

    private Color currentColor;

    @FXML
    void initialize() {
        // Set default color for pen
        currentColor = Color.WHITE;

        // Set toggle group for radio buttons
        toggleGroup = new ToggleGroup();
        Pen.setToggleGroup(toggleGroup);
        Eraser.setToggleGroup(toggleGroup);

        // Set event handler for radio buttons
        Pen.setOnAction(event -> currentColor = Color.AQUA);
        Eraser.setOnAction(event -> currentColor = Color.WHITE);
    }

    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        Circle newCircle = new Circle(event.getX(), event.getY(), 4, currentColor);
        drawingAreaPane.getChildren().add(newCircle);
    }
}
