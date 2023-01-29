import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import com.sun.org.apache.xpath.internal.operations.Bool;
import com.sun.xml.internal.bind.v2.runtime.ClassBeanInfoImpl;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class GICGUI extends Application {
    private Image investmentsImg = new Image("https://img2.10bestmedia.com/Images/Photos/351175/luxury-" +
            "family-hotels-thornbury-castle-gloucestershire-stay-deluxe-5_54_990x660.jpg");
    private Image bankImg = new Image("https://i.pinimg.com/originals/87/4e/0d/" +
            "874e0dcac56479ad7e69c2236e68b1a4.jpg");
    private Image loanImg = new Image("https://images.ctfassets.net/iyiurthvosft/featured-img-of-post-201578/c4821aa7795e6fcd5fb3f6f4e47ec89d/featured-img-of-post-201578.jpg?fm=jpg&fl=progressive&q=50&w=1200");
    private Image stocksImg = new Image("https://media.timeout.com/images/105402958/image.jpg");

    private Image homeImg = new Image("https://media.thetot.com/wp-content/uploads" +
            "/2019/10/29022812/Guidecraft-Hollow-Blocks-Feature.jpg");
    private ImageView imageView = new ImageView(homeImg);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        imageView.setPreserveRatio(true);
        imageView.setFitHeight(300);
        Button homeBtn = new Button ("Home");
        Button bankImgBtn = new Button ("Bank");
        Button loanImgBtn = new Button ("Loans");
        Button stocksBtn = new Button ("Stocks");
        Button investmentsBtn = new Button ("Investments");


        homeBtn.setOnAction(new ImageChangeHandlerHome());
        bankImgBtn.setOnAction(new ImageChangeHandlerBank());
        loanImgBtn.setOnAction(new ImageChangeHandlerLoans());
        stocksBtn.setOnAction(new ImageChangeHandlerStocks());
        investmentsBtn.setOnAction(new ImageChangeHandlerInvestments());

        //Title
        Text title = new Text("Welcome to the Capital Kids");
        title.setFont(Font.font("Tahoma", FontWeight.BOLD, 25));

        TextArea descriptionArea = new TextArea();
        descriptionArea.setWrapText(true);
        descriptionArea.setMaxWidth(600);


        HBox hbox = new HBox(20, homeBtn, bankImgBtn, loanImgBtn, stocksBtn, investmentsBtn);
        hbox.setAlignment(Pos.BOTTOM_CENTER);
        VBox vbox = new VBox(20, title, hbox,imageView, descriptionArea);
        vbox.setAlignment(Pos.TOP_CENTER);

        //change background color
        vbox.setStyle("-fx-background-color: #FFFFFF;");
hbox.setStyle("-fx-background-color: #FFFFFF;");

        Scene scene = new Scene(vbox,800,800);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Image Changer");
        primaryStage.show();
    }


    //IMAGE CHANGE HANDLERS
    public class ImageChangeHandlerHome implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event){
            if(!imageView.getImage().equals(homeImg))
                imageView.setImage(homeImg);
            else
                imageView.setImage(homeImg);
        }
    }public class ImageChangeHandlerBank implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event){
            if(!imageView.getImage().equals(bankImg))
                imageView.setImage(bankImg);
            else
                imageView.setImage(bankImg);
        }
    }public class ImageChangeHandlerLoans implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event){
            if(!imageView.getImage().equals(loanImg))
                imageView.setImage(loanImg);
            else
                imageView.setImage(loanImg);
        }
    }public class ImageChangeHandlerStocks implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event){
            if(!imageView.getImage().equals(stocksImg))
                imageView.setImage(stocksImg);
            else
                imageView.setImage(stocksImg);
        }
    }public class ImageChangeHandlerInvestments implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event){
            if(!imageView.getImage().equals(investmentsImg))
                imageView.setImage(investmentsImg);
            else
                imageView.setImage(investmentsImg);
        }
    }
}
