package E08_09;

import java.io.*;

public class InputOuputDemo {

    public static void main(String[] args) {

        System.out.println("Start");
        long startTime = System.nanoTime();

        try {
            InputStream is = new BufferedInputStream( new FileInputStream("resources" + File.separator  + "wiki-lietuva.html"), 500000);
            OutputStream os = new BufferedOutputStream( new FileOutputStream("resources" + File.separator  + "copy.txt"), 500000);



            int c = is.read();

            while (c != -1){
                os.write(c);
                c = is.read();
            }

//          os.flush();

            is.close();
            os.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        System.out.println((endTime - startTime)/1_000_000L + "ms");


//        System.out.println("Norint baigti,  paspauskite <Enter>");
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//


    }
}
