package Janelas;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.stage.Stage;


public class Acoes extends Application {

	@Override
	public void start(Stage window) throws Exception {
		// TODO Auto-generated method stub
		
		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(500, 400);
		
		Button botaovoltar = new Button("Voltar");
		botaovoltar.setLayoutX(20);
		botaovoltar.setLayoutY(30);
		botaovoltar.setOnAction(e -> botaovoltaracao(window));
		
		BackgroundImage myBI= new BackgroundImage(new Image("https://i.imgur.com/BOXw1AR.png",0,0,false,true),
		        BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
		          BackgroundSize.DEFAULT);
		//then you set to your node
		pane.setBackground(new Background(myBI));
		
		pane.getChildren().addAll(botaovoltar);
		Scene scene2 = new Scene(pane);
		window.setScene(scene2);
		window.show();

	}
	
private void botaovoltaracao(Stage window) {
		
		try {
			new Menu().start(window);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}