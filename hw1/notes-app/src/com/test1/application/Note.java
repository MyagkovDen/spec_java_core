package com.test1.application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Timestamp;

public class Note {
    String title;
    StringBuilder body;
    Timestamp date;

    public Note(String title, StringBuilder text) {
        this.title = title;
        this.date = new Timestamp(System.currentTimeMillis());
        this.body = text;
    }

    public Note() {
    }

    @Override
    public String toString() {
        return this.date + ": " + title + "\n" + this.body + "\n";
    }

    public void createNote() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String input;
            System.out.println("Введите название заметки:");
            String title = reader.readLine().toUpperCase();
            System.out.println("Введите текст. Если хотите выйти из режима редактирования, введите \"ESC\"");
            StringBuilder text = new StringBuilder();
            while (!(input = reader.readLine()).equals("ESC")) {
                text.append(input);
                text.append("\n");
            }
            Note note = new Note(title, text);
            com.test1.application.File file = new File();
            file.addNote(note);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
