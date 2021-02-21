package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Login Screen
        //Components
        Label loginInstructions = new Label("Enter your name and start.");
        TextField nameField = new TextField();
        Button startButton = new Button("Start");

        //Layout
        GridPane layout = new GridPane();
        layout.add(loginInstructions, 0,0);
        layout.add(nameField, 0, 1);
        layout.add(startButton, 0, 2);

        //Design
        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));

        //Scene Creation
        Scene loginView = new Scene(layout);


        // Welcome Screen
        //Components
        Label welcomeText = new Label("Welcome!");

        //Layout
        StackPane welcomeLayout = new StackPane();
        welcomeLayout.getChildren().add(welcomeText);

        //Design
        welcomeLayout.setPrefSize(300, 180);
        welcomeLayout.setAlignment(Pos.CENTER);

        //Scene Creation
        Scene welcomeView = new Scene(welcomeLayout);

        // Button functionality
        startButton.setOnAction(actionEvent -> {
            welcomeText.setText("Welcome " + nameField.getText() + "!");
            stage.setScene(welcomeView);
        });

        stage.setTitle("Greeter");
        stage.setScene(loginView);
        stage.show();
    }
}
