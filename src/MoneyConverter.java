import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
import java.util.Optional;


public class MoneyConverter extends Application {
    @Override
    public void start(Stage primaryStage){
        final int Quarter = 25;
        final int Dime = 10;
        final int Nickel = 5;
        final int Penny = 1;
        TextInputDialog textInputDialog = new TextInputDialog();
        textInputDialog.setTitle("Money Converter");
        textInputDialog.setHeaderText("10's");
        textInputDialog.setContentText("Enter 10 Dollar Bills");
        Optional<String> Ten = textInputDialog.showAndWait();

        TextInputDialog fiveDialog = new TextInputDialog();
        fiveDialog.setTitle("Money Converter");
        fiveDialog.setHeaderText("5's");
        fiveDialog.setContentText("Enter 5 Dollar Bills");
        Optional<String> Five = fiveDialog.showAndWait();

        TextInputDialog oneDialog = new TextInputDialog();
        oneDialog.setTitle("Money COnverter");
        oneDialog.setHeaderText("1's");
        oneDialog.setContentText("Enter 1 Dollar Bills");
        Optional<String> One = textInputDialog.showAndWait();

        int tenVar = Integer.parseInt(Ten.get());
        int fiveVar = Integer.parseInt(Five.get());
        int oneVar = Integer.parseInt(One.get());

        int tenConvert = tenVar*1000;
        int fiveConvert = fiveVar*500;
        int oneConvert = oneVar*100;
        int sum = (tenConvert+fiveConvert+oneConvert);

        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Money Converter");
        alert.setContentText("Your change is " + sum/Quarter + "Quarters" + "\n" + sum/Dime + "Dimes" + "\n" + sum/Nickel + "Nickels" +
                "\n" + sum/Penny + "Pennies");
        alert.show();

    }

}