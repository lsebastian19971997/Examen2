package uia.com.agendafx.agendafx;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RecordatorioEdicionDialogoController {

    @FXML
    private TextField tipoFieldRecordatorio;
    @FXML
    private TextField nombreFieldRecordatorio;
    @FXML
    private TextField fechaFieldRecordatorio;
    @FXML
    private TextField fechaRecordatorioFieldRecordatorio;


    private Stage dialogStage;
    private Recordatorio recordatorio;
    private boolean okClicked = false;

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
    }

    /**
     * Sets the stage of this dialog.
     *
     * @param dialogStage
     */
    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    /**
     * Sets the contacto to be edited in the dialog.
     *
     * @param recordatorio
     */
    public void setRecordatorio(Recordatorio recordatorio) {
        this.recordatorio = recordatorio;

        tipoFieldRecordatorio.setText(recordatorio.getTipoRecordatorio());
        nombreFieldRecordatorio.setText(recordatorio.getNombreRecordatorio());
        fechaFieldRecordatorio.setText(recordatorio.getFechaRecordatorioRec());
        fechaRecordatorioFieldRecordatorio.setText(recordatorio.getFechaRec());
    }

    /**
     * Returns true if the user clicked OK, false otherwise.
     *
     * @return
     */
    public boolean isOkClicked() {
        return okClicked;
    }

    /**
     * Called when the user clicks ok.
     */
    @FXML
    private void handleOk() {
        if (isInputValid()) {

            this.recordatorio.setTipo(tipoFieldRecordatorio.getText());
            this.recordatorio.setNombre(nombreFieldRecordatorio.getText());
            this.recordatorio.setFecha(fechaFieldRecordatorio.getText());
            this.recordatorio.setFechaRecordatorio(fechaRecordatorioFieldRecordatorio.getText());

            okClicked = true;
            dialogStage.close();
        }
    }

    /**
     * Called when the user clicks cancel.
     */
    @FXML
    private void handleCancel() {
        dialogStage.close();
    }

    /**
     * Validates the user input in the text fields.
     *
     * @return true if the input is valid
     */
    private boolean isInputValid() {
        String errorMessage = "";

        if (tipoFieldRecordatorio.getText() == null || tipoFieldRecordatorio.getText().length() == 0) {
            errorMessage += "No valid first name!\n";
        }
        if (nombreFieldRecordatorio.getText() == null || nombreFieldRecordatorio.getText().length() == 0) {
            errorMessage += "No valid last name!\n";
        }
        if (fechaFieldRecordatorio.getText() == null || fechaFieldRecordatorio.getText().length() == 0) {
            errorMessage += "No valid fecha!\n";
        }

        if (fechaRecordatorioFieldRecordatorio.getText() == null || fechaRecordatorioFieldRecordatorio.getText().length() == 0) {
            errorMessage += "No valid postal code!\n";
        }

        if (errorMessage.length() == 0) {
            return true;
        } else {
            // Show the error message.
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.initOwner(dialogStage);
            alert.setTitle("Invalid Fields");
            alert.setHeaderText("Please correct invalid fields");
            alert.setContentText(errorMessage);

            alert.showAndWait();

            return false;
        }
    }
}
