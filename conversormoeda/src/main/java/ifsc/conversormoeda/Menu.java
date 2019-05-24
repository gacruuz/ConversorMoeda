package ifsc.conversormoeda;

import Moedas.Dolar;
import Moedas.Euro;
import Moedas.Libra;
import Moedas.Peso;
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
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Menu extends Application {

	
	@Override
	public void start(Stage window) throws Exception {
		// TODO Auto-generated method stub
		
		AnchorPane pane2 = new AnchorPane();

		BackgroundImage myBI= new BackgroundImage(new Image("file:C:\\Users\\CRUZ\\Desktop\\menu.png",0,0,false,true),
		        BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
		          BackgroundSize.DEFAULT);
		//then you set to your node
		pane2.setBackground(new Background(myBI));
		
		
		
		
		Button botaodeslogar = new Button("Deslogar");
		botaodeslogar.setLayoutX(20);
		botaodeslogar.setLayoutY(30);
		botaodeslogar.setOnAction(e -> botaodeslogaracao(window));
		botaodeslogar.setFont(Font.font("Bebas", FontWeight.BOLD, 12));
		
		
		Button botaodolar = new Button("Dólar");
		botaodolar.setLayoutX(60);
		botaodolar.setLayoutY(100);
		botaodolar.setPrefWidth(60);
		botaodolar.setOnAction(e -> botaodolaropen(window));
		botaodolar.setFont(Font.font("Bebas", FontWeight.BOLD, 12));
		
		
		Button botaoeuro = new Button("Euro");
		botaoeuro.setLayoutX(60);
		botaoeuro.setLayoutY(160);
		botaoeuro.setPrefWidth(60);
		botaoeuro.setOnAction(e -> botaoeuroopen(window));
		botaoeuro.setFont(Font.font("Bebas", FontWeight.BOLD, 12));
		
		Button botaolibra = new Button("Libra");
		botaolibra.setLayoutX(60);
		botaolibra.setLayoutY(220);
		botaolibra.setPrefWidth(60);
		botaolibra.setOnAction(e -> botaolibraopen(window));
		botaolibra.setFont(Font.font("Bebas", FontWeight.BOLD, 12));
		
		Button botaopeso = new Button("Peso");
		botaopeso.setLayoutX(60);
		botaopeso.setLayoutY(280);
		botaopeso.setPrefWidth(60);
		botaopeso.setOnAction(e -> botaopesoopen(window));
		botaopeso.setFont(Font.font("Bebas", FontWeight.BOLD, 12));
		
		Button botaocotacao = new Button("Cambio");
		botaocotacao.setLayoutX(200);
		botaocotacao.setLayoutY(100);
		botaocotacao.setPrefWidth(60);
		botaocotacao.setOnAction(e -> botaocotacaoopen(window));
		botaocotacao.setFont(Font.font("Bebas", FontWeight.BOLD, 12));
		
		Button botaobolsa = new Button("Bolsa");
		botaobolsa.setLayoutX(200);
		botaobolsa.setLayoutY(160);
		botaobolsa.setPrefWidth(60);
		botaobolsa.setOnAction(e -> botaobolsaopen(window));
		botaobolsa.setFont(Font.font("Bebas", FontWeight.BOLD, 12));
		
		Button botaoacoes = new Button("Ações");
		botaoacoes.setLayoutX(200);
		botaoacoes.setLayoutY(220);
		botaoacoes.setPrefWidth(60);
		botaoacoes.setOnAction(e -> botaoacoesopen(window));
		botaoacoes.setFont(Font.font("Bebas", FontWeight.BOLD, 12));
		
		
		
		pane2.setPrefSize(500, 400);
		pane2.getChildren().addAll(botaodolar,botaoeuro,botaolibra,botaopeso,botaodeslogar, botaocotacao, botaobolsa, botaoacoes);
		Scene scene2 = new Scene(pane2);
		window.setScene(scene2);
		window.show();
		
		
	}
	
	
	
	private void botaoacoesopen(Stage window) {
		
		try {
			new Acoes().start(window);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void botaodeslogaracao(Stage window) {
		
		try {
			new Main().start(window);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void botaodolaropen(Stage window) {
		
		try {
			new Dolar().start(window);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void botaoeuroopen(Stage window) {
		
		try {
			new Euro().start(window);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void botaolibraopen(Stage window) {
		
		try {
			new Libra().start(window);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	private void botaopesoopen(Stage window) {
		
		try {
			new Peso().start(window);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void botaocotacaoopen(Stage window) {
		
		try {
			new Cotacao().start(window);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
private void botaobolsaopen(Stage window) {
		
		try {
			new Bolsa().start(window);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	

}