package application;
	


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane grid= new GridPane();
			grid.setAlignment(Pos.CENTER);
			grid.setHgap(10);
			grid.setVgap(10);
			grid.setPadding(new Insets(25,25,25,25));
			
			Scene scene = new Scene(grid,500,500);
			
			Label etiqueta = new Label("Etiqueta");
			grid.add(etiqueta, 0, 1);
			TextField numero= new TextField();
			grid.add(numero, 1, 1);
			Button factorial= new Button("Factorial");
			grid.add(factorial, 1, 2);
			Label resultado= new Label();
			grid.add(resultado, 2, 1);
			factorial.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle(ActionEvent event) {
					String dato= numero.getText();
					int n= Integer.parseInt(dato);
					int suma=1;
					for(int i=n;i>=1;i--) {
						suma*=i;
					}
					
					resultado.setText(String.valueOf("Resultado: "+suma));
				}
			});
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
