package org.example

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.StackPane
import javafx.stage.Stage

class MainApp : Application() {
    override fun start(primaryStage: Stage) {
        val button = Button("¡Haz clic aquí!")
        button.setOnAction {
            println("¡Botón presionado!")
            button.text = "¡Gracias!"
        }

        val root = StackPane()
        root.children.add(button)

        val scene = Scene(root, 300.0, 200.0)
        primaryStage.title = "Mi primera app JavaFX con Kotlin"
        primaryStage.scene = scene
        primaryStage.show()
    }
}

fun main() {
    Application.launch(MainApp::class.java)
}
