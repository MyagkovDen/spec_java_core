package com.test1.in;

import com.test1.application.File;
import com.test1.application.Note;

import java.util.Scanner;

public class Console {
    Note note;
    File file;
    Scanner scanner;

    public Console() {
        this.note = new Note();
        this.file = new File();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Выберите действие:\n" +
                "1 - добавить заметку;\n" +
                "2 - просмотреть заметки;\n" +
                "3 - выйти из программы");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                note.createNote();
            case "2":
                file.readNote();
            case "3":
                return;
        }
    }
}
