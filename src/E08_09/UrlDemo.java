package E08_09;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class UrlDemo {
    public static void main(String[] args) {
        try {
          URL url = new URL("https://lt.wikipedia.org/wiki/Lietuva");
         InputStream is = url.openStream();
            OutputStream os = new FileOutputStream("c.txt");


            int c = is.read();
            while (c != -1){
                os.write(c);
                c = is.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
