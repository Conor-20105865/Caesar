package com.example.caesar;

public class Launcher {
    public static void main(String[] args) {
        // Force software rendering to avoid potential GPU/Metal-related crashes in some IDE runtimes
        // This helps when running via "mvn javafx:run" inside IntelliJ on macOS where JBR may crash.
        System.setProperty("prism.order", "sw");
        CaesarCipherApp.main(args);
    }
}
