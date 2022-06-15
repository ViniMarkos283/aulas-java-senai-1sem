package application;
	

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane(); //borderpane cria um painel | instancia de painel pelo root
			Scene scene = new Scene(root,400,400); //instancia de scene e seu tamanho
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm()); // estilacao da cena usando um css, o msm css do visual studio
			
			GridPane grid = new GridPane();
			grid.setHgap(5.0); // grade em horizontal
			grid.setVgap(7.0); // grade em vertical
			
			grid.add(new Label("Nome: "), 0, 0); // criou o label dentro do grid add | esse label é o texto em exibicao 
			TextField txtNome = new TextField(); // instancia do txt q vai pegar o label | o testfield e um input igual o do visual studio
			grid.add(txtNome, 1, 0); // os zeros sao a posicao | (coluna , linha)
			
			grid.add(new Label("Sexo: "), 0, 1);
			RadioButton btnMasc = new RadioButton("Masculino"); // radiobutton é a bolinha de escolha
			RadioButton btnFem = new RadioButton("Feminino");
			btnMasc.setSelected(true); // comeca marcado quando inicia
			
			ToggleGroup group = new ToggleGroup(); //agrupa os botoes no grupo | faz com que um desmarque o outro quando seleciona
			btnFem.setToggleGroup(group);
			btnMasc.setToggleGroup(group); // coloca ambos dentro de um grupo
			
			HBox radioBox = new HBox(5.0, btnFem, btnMasc); //Hbox cria um layout horizontal | (padding, seletor, seletor)
			grid.add(radioBox, 1, 1);
			
			ChoiceBox<String> chcEstados = new ChoiceBox<>(); //e o seletor que desce as opcoes
			
			ObservableList<String> estados = FXCollections.observableArrayList("Sao Paulo", "Rio de Janeiro", "Minas Gerais"); // opcoes que vao na caixa de escolha
			
			chcEstados.setItems(estados); // setItens recebe a Observablelist
			
			grid.add(new Label("Estado: "), 0, 2);
			grid.add(chcEstados, 1, 2);
			
			Label lblTeste = new Label();
			
			Button btnTeste = new Button("Teste");
			btnTeste.setOnAction(event -> lblTeste.setText(txtNome.getText())); // setonaction gera uma acao | operacao lambda | -> é o arrow, mostra o que ocorre depois do evento
			btnTeste.setOnMouseEntered(event -> lblTeste.setText("Passou")); // evento quando o mouse sobe no botao
			btnTeste.setOnMouseExited(event -> lblTeste.setText("Saiu")); // evento quando o mouse sai
			
			CheckBox cxbTeste = new CheckBox("teste"); // o checkbox e o marcador de caixinha do input do visual studio
			
			grid.add(btnTeste, 1, 3);
			grid.add(lblTeste, 1, 4);
			grid.add(cxbTeste, 1, 5);
			
			root.setCenter(grid);
			primaryStage.setScene(scene); //criacao de telas sobre outras
			primaryStage.show(); // exibe a tela
		} catch(Exception e) {// caso de errado vai invocar o catch
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
