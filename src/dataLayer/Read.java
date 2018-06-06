package dataLayer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author USER
 */
public class Read {

    private BufferedReader reader;

    /**
     *
     * @param fileName
     * @throws FileNotFoundException
     */
    public void open(String fileName) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(fileName));
    }

    /**
     *
     * @return
     */
    public BufferedReader getReader() {
        return reader;
    }

    /**
     *
     * @param reader
     */
    public void setReader(BufferedReader reader) {
        this.reader = reader;
    }

    /**
     *
     * @throws IOException
     */
    public void close() throws IOException {
        getReader().close();
    }
}
