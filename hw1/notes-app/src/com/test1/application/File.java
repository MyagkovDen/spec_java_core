package com.test1.application;

import java.io.*;

public class File {
    public File() {
    }

    public void addNote(Note note) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("notions.txt", true))) {
            writer.write(note.toString());
            writer.write("\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readNote() {
        try (BufferedReader reader = new BufferedReader(new FileReader("notions.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
