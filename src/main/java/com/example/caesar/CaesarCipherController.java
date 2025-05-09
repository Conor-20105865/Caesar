package com.example.caesar;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CaesarCipherController {
    @FXML public TextField shiftField;
    @FXML private TextArea inputText;
    @FXML private TextArea outputText;

    @FXML private Button exitButton;


    public void encode() {
        String text = inputText.getText();
        //get inserted shift value from shifyField
        int shift = getShiftValue();
        StringBuilder encodedText = new StringBuilder();

        for (char c : text.toCharArray()) {
            //checks if its a letter if yes cont with encryption
            if (Character.isLetter(c)) {
                //is upper or lowercase? set base
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                //push letter forward in alphabet
                int shiftedIndex = (c - base + shift) % 26;
                encodedText.append((char) (base + shiftedIndex));
            } else {
                //if not letter of alphabet print it
                encodedText.append(c);
            }
        }

        outputText.setText(encodedText.toString());
    }

    public void decode() {
        String text = inputText.getText();
        //get shift val from shiftField
        int shift = getShiftValue();
        StringBuilder decodedText = new StringBuilder();

        //checks if is letter
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                //checks upper or lowercase
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                //pushes letter backwards in alphhabet
                int shiftedIndex = (c - base - shift + 26) % 26;

                decodedText.append((char) (base + shiftedIndex));
            } else {
                //if its not it just prints
                decodedText.append(c);
            }
        }

        outputText.setText(decodedText.toString());
    }


    //method for getting input from textfield
    private int getShiftValue() {
        String text = shiftField.getText().trim(); // Remove spaces
        if (text.isEmpty()) return 3; // Default to 3
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return 3;
        }
    }

    public void exitApp() {
        System.exit(0); // Closes the application
    }




}
