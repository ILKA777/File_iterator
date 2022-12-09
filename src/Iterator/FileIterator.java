package Iterator;

import java.io.*;
import java.util.*;

public class FileIterator implements Iterator<String> {
    private final String path;
    private final BufferedReader bf;

    public FileIterator(String path) throws FileNotFoundException {
        this.path = path;
        FileReader fl = new FileReader(path);
        bf = new BufferedReader(fl);
    }


    @Override
    public boolean hasNext() {
        try {
            return bf.ready();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    @Override
    public String next() {
        try {
            return bf.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}
