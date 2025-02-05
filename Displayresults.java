import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StockUI extends Application {
    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        Label buySellSignal = new Label("Buy/Sell Signal: Neutral");
        Label trendPrediction = new Label("Trend Prediction: Stable");
        Label sentiment = new Label("Sentiment: Neutral");

        root.getChildren().addAll(buySellSignal, trendPrediction, sentiment);

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Stock Analysis Tool");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}