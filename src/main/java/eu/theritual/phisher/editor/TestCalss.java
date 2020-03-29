package eu.theritual.phisher.editor;
import eu.theritual.phisher.rider.*;

import java.io.File;

public class TestCalss {

    public static void main(String[] args) {
        Deck deck = Utils.load(new File("xxx.json"));
        deck.show();
    }


}
