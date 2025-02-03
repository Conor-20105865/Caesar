package com.example.caesar;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class CaesarCipherController {
    @FXML private TextArea inputText;
    @FXML private TextArea outputText;

    //TODO: make the shift value changeable through ui
    //TODO: allow for other ciphers to be encoded and decode

    public void encode() {
        String text = inputText.getText();
        //shift value below
        int shift = 3;
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
        //shift value below
        int shift = 3;
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
}
