package eu.theritual.phisher.editor;
import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Editor extends Application {
    private ConfigurableApplicationContext springContext;

    public static void main(String[] args) {
        System.out.println("Running!");
        launch(args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> System.out.println("Hello World");
    }

    @Override
    public void init(){
        springContext = SpringApplication.run(Editor.class);
    }

    @Override
    public void start(Stage primaryStage){
        EditorWindow appWindow = new EditorWindow(primaryStage);
    }

    @Override
    public void stop() {
        springContext.stop();
    }
}