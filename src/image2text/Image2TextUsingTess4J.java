package image2text;


import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class Image2TextUsingTess4J {

    public static void main(String[] args) {
        File imageFile = new File("Golden_Globe_text_logo.png");
        //ITesseract instance = new Tesseract();  // JNA Interface Mapping
        ITesseract instance = new Tesseract(); // JNA Direct Mapping
       // String string = "<html> <body> </body></html>";
        try {
            String result;
            result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }
}