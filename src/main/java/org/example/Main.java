package org.example;

import io.qt.widgets.*;
public class Main {
    public static void main(String[] args) {
        QApplication.initialize(args);
        QMessageBox.information(null, "QtJambi_Demo", "This is a simple QtJambi Demo with java maven!\n");
        QApplication.shutdown();
    }
}