import javafx.application.Application;
import javafx.stage.Stage;

public class Launcher extends Application {

  @Override
  public void start(Stage primaryStage) {
    new GUI(primaryStage);
    primaryStage.setResizable(false);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
