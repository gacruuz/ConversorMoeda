package Moedas;


import ifsc.conversormoeda.Menu;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Libra extends Application {

	@Override
	public void start(Stage window) throws Exception {
		// TODO Auto-generated method stub
		
		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(500, 400);
		
		BackgroundImage myBI= new BackgroundImage(new Image("file:C:\\Users\\CRUZ\\Desktop\\telalibra.png",0,0,false,true),
		        BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
		          BackgroundSize.DEFAULT);
		//then you set to your node
		pane.setBackground(new Background(myBI));
		
		TextField valor = new TextField();
		valor.setLayoutX(185);
		valor.setLayoutY(130);
		valor.setPrefWidth(120);
		
		Button botaovoltar = new Button("Voltar");
		botaovoltar.setLayoutX(20);
		botaovoltar.setLayoutY(30);
		
		Button botao1 = new Button("Converter");
		botao1.setLayoutX(197);
		botao1.setLayoutY(180);
		botao1.setPrefWidth(100);
		
		Text texto1 = new Text();
		texto1.setText("");
		texto1.setLayoutX(130);
		texto1.setLayoutY(250);
		
		// -------- ACOES -------//
		botao1.setOnAction(new	EventHandler<ActionEvent>()	{		
			
			@Override
			
			public	void	handle(ActionEvent	event)	{
				
				try {
				float numero = Float.parseFloat(valor.getText());
				numero = (float) (numero * 0.1952934);
				System.out.println("Dolar: " + numero);
				texto1.setText("VALOR CONVERTIDO: " + numero);
				texto1.setFont(Font.font("Bebas", FontWeight.BOLD, 20));
				}catch (Exception e) {
					texto1.setText("Digite apenas valores");
					texto1.setFont(Font.font("Bebas", FontWeight.BOLD, 20));
				}
				
				
			}
			
	    	});	
		
		botaovoltar.setOnAction(new	EventHandler<ActionEvent>()	{		
			
			@Override
			
			public	void	handle(ActionEvent	event)	{
							
				try {
					new Menu().start(window);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
							
			}
			
	    });	
		
		
		
		pane.getChildren().addAll(valor, botao1, texto1, botaovoltar);
		Scene scene2 = new Scene(pane);
		window.setScene(scene2);
		window.show();
		
		
		
		
	}

	
}
