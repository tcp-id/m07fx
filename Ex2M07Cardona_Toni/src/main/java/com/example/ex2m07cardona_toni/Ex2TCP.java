package com.example.ex2m07cardona_toni;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Ex2TCP extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        BorderPane border = new BorderPane();
        Scene scene = new Scene(border);
        HBox hbox = this.addHBox();

        border.setTop(hbox);
        border.setLeft(this.addVBox()); this.addStackPane(hbox);
        border.setRight(this.addTilePane());
        border.setCenter(this.addAnchorPane(this.addGridPane()));
        border.setBottom(this.addVBox()); this.addStackPane(hbox);

        stage.setScene(scene);
        stage.setTitle("TCP Ex2");
        stage.show();
    }

    private HBox addHBox() {
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(15.0D, 12.0D, 15.0D, 12.0D));
        hbox.setSpacing(10.0D);
        hbox.setStyle("-fx-background-color: #336699;");

        Button buttonClients = new Button("Clients");
        buttonClients.setPrefSize(100.0D, 20.0D);
        Button buttonExpedients = new Button("Expedients");
        buttonExpedients.setPrefSize(100.0D, 20.0D);
        Button buttonTramit = new Button("Tràmits");
        buttonTramit.setPrefSize(100.0D, 20.0D);
        Button buttonAdmini = new Button("Administració");
        buttonAdmini.setPrefSize(100.0D, 20.0D);
        Button buttonllistat = new Button("Llistats");
        buttonllistat.setPrefSize(100.0D, 20.0D);

        hbox.getChildren().addAll(buttonClients, buttonExpedients, buttonTramit, buttonAdmini, buttonllistat);
        return hbox;
    }
    private VBox addVBox() {
        Text titul = new Text("Caprabo");
        VBox vbox = new VBox();
        FlowPane flo = new FlowPane();
        ImageView[] pages = new ImageView[3];

        vbox.setPadding(new Insets(10.0D));
        vbox.setSpacing(8.0D);

        Text title = new Text("Clients");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 14.0D));
        vbox.getChildren().add(title);

        flo.setVgap(3);
        flo.setHgap(3);
        flo.setStyle("-fx-background-color: DAE6F3;");

        for (int i = 0; i < 4; ++i) {
            pages[i] = new ImageView(new Image(Ex2TCP.class.getResourceAsStream("img/fruta.jpg")));
            flo.getChildren().add(pages[i]);
        }
        return vbox;
    }

    private void addStackPane(HBox hb) {
        StackPane stack = new StackPane();

    }

    public AnchorPane addAnchorPane(GridPane grid) {
        AnchorPane anchorpane = new AnchorPane();
        Button buttonEdit = new Button("Editar");
        Button buttonCons = new Button("Consultar");
        Button buttonEsbo = new Button("Esborrar");
        HBox hb = new HBox();

        hb.getChildren().addAll(buttonEdit, buttonCons, ButtonEsbo);
        anchorpane.getChildren().addAll(grid,hb);

        return anchorpane;
    }
}