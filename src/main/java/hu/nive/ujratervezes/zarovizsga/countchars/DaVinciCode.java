package hu.nive.ujratervezes.zarovizsga.countchars;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DaVinciCode {

    public int encode(String path, char c) {
        if (c != '0' && c != '1' && c != 'x') {
            throw new IllegalArgumentException("The second parameter must be 0, 1, or x!");
        }
        try (BufferedReader reader = Files.newBufferedReader(Path.of(path))) {
            return countingChar(c, reader);
        } catch (IOException ioe) {
            throw new IllegalStateException("can not read the file!", ioe);
        }
    }

    private int countingChar(char c, BufferedReader reader) throws IOException {
        String line;
        int count = 0;
        while ((line = reader.readLine()) != null) {
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == c) {
                    count++;
                }
            }
        }
        return count;
    }
}
