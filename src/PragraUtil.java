import java.io.Closeable;
import java.io.File;
import java.io.IOException;

public class PragraUtil implements AutoCloseable {

    public String covertTo20char() throws IOException {
        System.out.println("Opening file");
        if(true) throw new IOException();
        return  "Hello from Covert to 20 char";

    }

    @Override
    public void close()  {

        System.out.println("Closing File");

    }
}
