package dataLayer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author USER
 */
public class ReadFirstClue extends Read {

    private static ArrayList<String> clues = new ArrayList();
    private static ReadFirstClue read = new ReadFirstClue();

    public static ReadFirstClue getInstance() {
        return read;
    }

    /**
     *
     * @throws IOException
     */
    public void read() throws IOException {
        String line = getReader().readLine();
        if (line != null) {
            String[] aux = line.split("-");
            clues.addAll(Arrays.asList(aux));//Copia las cosas del Array
        }
    }

    public ArrayList getWordList() {
        return clues;
    }

}
