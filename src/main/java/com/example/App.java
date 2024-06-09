package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 400,400);

        MenuBar menuBar = new MenuBar();
        
        Menu menu0 = new Menu("Archivo");
        Menu menu1 = new Menu("Editar");
        Menu menu2 = new Menu("Ayuda");

        menuBar.getMenus().addAll(menu0, menu1, menu2);

       MenuItem archivo01Item = new MenuItem("Nuevo Archivo ");
       MenuItem archivo02Item = new MenuItem("Nueva Ventana");
       MenuItem archivo03Item = new MenuItem("Abrir Archivo");
       MenuItem archivo04Item = new MenuItem("Abrir Carpeta");
       MenuItem archivo05Item = new MenuItem("Abrir Area de Trabajo desde Archivo");
       MenuItem archivo06Item = new MenuItem("Abrir Reciente");
       MenuItem archivo07Item = new MenuItem("Guardar");
       MenuItem archivo08Item = new MenuItem("Guardar Como");
       MenuItem archivo09Item = new MenuItem("Guardar Todo");
       MenuItem archivo10Item = new MenuItem("Compartir");
       MenuItem archivo11Item = new MenuItem("Cerrar Carpeta");
       MenuItem archivo12Item = new MenuItem("Cerrar Programa");
       SeparatorMenuItem separation01Item = new SeparatorMenuItem();
       SeparatorMenuItem separation02Item = new SeparatorMenuItem();
       SeparatorMenuItem separation03Item = new SeparatorMenuItem();
       SeparatorMenuItem separation04Item = new SeparatorMenuItem();
       menu0.getItems().addAll(archivo01Item, archivo02Item, separation01Item, archivo03Item, archivo04Item, archivo05Item, archivo06Item, separation02Item, archivo07Item, archivo08Item, archivo09Item, separation03Item, archivo10Item, separation04Item, archivo11Item, archivo12Item);


       MenuItem Editar01Item = new MenuItem("Deshacer");
       MenuItem Editar02Item = new MenuItem("Rehacer");
       MenuItem Editar03Item = new MenuItem("Cortar");
       MenuItem Editar04Item = new MenuItem("Copiar");
       MenuItem Editar05Item = new MenuItem("Pegar");
       MenuItem Editar06Item = new MenuItem("Buscar");
       MenuItem Editar07Item = new MenuItem("Reemplazar");
       MenuItem Editar08Item = new MenuItem("Buscar en Archivo");
       MenuItem Editar09Item = new MenuItem("Reemplazar en Files");
       SeparatorMenuItem separatorMenuItem1 = new SeparatorMenuItem();
       SeparatorMenuItem separatorMenuItem2 = new SeparatorMenuItem();
       SeparatorMenuItem separatorMenuItem3 = new SeparatorMenuItem();
       menu1.getItems().addAll(Editar01Item, Editar02Item, separatorMenuItem1, Editar03Item, Editar04Item, Editar05Item, separatorMenuItem2, Editar06Item, Editar07Item, separatorMenuItem3, Editar08Item, Editar09Item);

       MenuItem Ayuda00Item = new MenuItem("Mostrar todos los comandos");
       MenuItem Ayuda01Item = new MenuItem("Documentacion");
       MenuItem Ayuda02Item = new MenuItem("Mostrar notas de la version");
       MenuItem Ayuda03Item = new MenuItem("Ver licencia");
       MenuItem Ayuda04Item = new MenuItem("Declaracion de privacidad");
       MenuItem Ayuda05Item = new MenuItem("Alternar herramientas de desarrollo");
       MenuItem Ayuda06Item = new MenuItem("Abrir explorador de procesos");
       MenuItem Ayuda07Item = new MenuItem("Instalar actualizacion");
       MenuItem Ayuda08Item = new MenuItem("Acerca de");
       SeparatorMenuItem separatioItem001 = new SeparatorMenuItem();
       SeparatorMenuItem separatioItem002 = new SeparatorMenuItem();
       SeparatorMenuItem separatioItem003 = new SeparatorMenuItem();
       SeparatorMenuItem separatioItem004 = new SeparatorMenuItem();
       menu2.getItems().addAll(Ayuda00Item, Ayuda01Item, Ayuda02Item, separatioItem001, Ayuda03Item, Ayuda04Item, separatioItem002, Ayuda05Item, Ayuda06Item, separatioItem003, Ayuda07Item, separatioItem004, Ayuda08Item);

        root.setTop(menuBar);

        //! ARCHIVO
        archivo01Item.setOnAction(e->{
            System.out.println("Haz seleccionado Crear nuevo archivo");
        });
        archivo02Item.setOnAction(e->{
            System.out.println("Haz seleccionado una nueva ventana");
        });
        archivo03Item.setOnAction(e->{
            System.out.println("Haz seleccionado abrir un archivo");
        });
        archivo04Item.setOnAction(e->{
            System.out.println("Haz seleccionado abrir una carpeta");
        });
        archivo05Item.setOnAction(e->{
            System.out.println("Haz seleccionado abrir area de trabajo desde archivo");
        });
        archivo06Item.setOnAction(e->{
            System.out.println("Haz seleccionado abrir reciente");
        });
        archivo07Item.setOnAction(e->{
            System.out.println("Haz seleccionado guardar el archivo");
        });
        archivo08Item.setOnAction(e->{
            System.out.println("Haz seleccionado guardar como");
        });
        archivo09Item.setOnAction(e->{
            System.out.println("Haz seleccionado guardar todo");
        });
        archivo10Item.setOnAction(e->{
            System.out.println("Haz seleccionado compartir");
        });
        archivo11Item.setOnAction(e->{
            System.out.println("Haz seleccionado cerrar carpeta");
        });
        archivo12Item.setOnAction(e->{
            System.out.println("Haz seleccionado cerrar programa");
        });

        //! EDITAR
        Editar01Item.setOnAction(e->{
            System.out.println("Haz seleccionado deshacer");
        });
        Editar02Item.setOnAction(e->{
            System.out.println("Haz seleccionado rehacer");
        });
        Editar03Item.setOnAction(e->{
            System.out.println("Haz seleccionado cortar");
        });
        Editar04Item.setOnAction(e->{
            System.out.println("Haz seleccionado copiar");
        });
        Editar05Item.setOnAction(e->{
            System.out.println("Haz seleccionado pegar");
        });
        Editar06Item.setOnAction(e->{
            System.out.println("Haz seleccionado buscar");
        });
        Editar07Item.setOnAction(e->{
            System.out.println("Haz seleccionado reemplazar");
        });
        Editar08Item.setOnAction(e->{
            System.out.println("Haz seleccionado buscar en archivo");
        });
        Editar09Item.setOnAction(e->{
            System.out.println("Haz Seleccionado reemplazar en files");
        });

        //! AYUDA
        Ayuda00Item.setOnAction(e->{
            System.out.println("Haz seleccionado mostar todos los comandos");
        });
  
        Ayuda01Item.setOnAction(e->{
            System.out.println("Haz seleccionado documentacion");
        });
  
        Ayuda02Item.setOnAction(e->{
            System.out.println("Haz seleccionado mostrar notas de la version");
        });
  
        Ayuda03Item.setOnAction(e->{
            System.out.println("Haz seleccionado ver licencia");
        });
  
        Ayuda04Item.setOnAction(e->{
            System.out.println("Haz seleccionado declaracion de privacidad");
        });
  
        Ayuda05Item.setOnAction(e->{
            System.out.println("Haz seleccionado alternar herramientas de desarrollo");
        });
  
        Ayuda06Item.setOnAction(e->{
            System.out.println("Haz seleccionado abrir explorador de procesos");
        });
  
        Ayuda07Item.setOnAction(e->{
            System.out.println("Haz seleccionado instalar actualización");
        });
  
        Ayuda08Item.setOnAction(e->{
            System.out.println("Haz seleccionado acerca de");
        });
  

        primaryStage.setTitle("Menú");
        primaryStage.setScene(scene);
        primaryStage.show();

    }











    public static void main(String[] args) {
        launch(args);
    }

    

}