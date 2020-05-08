import com.athaydes.json.JSON;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;

public class TestJSONParsing {

    public static boolean isValidJSON(InputStream stream) {
        try {
            new JSON().parse(stream, Object.class);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Usage: java TestJSONParsing file.json");
            System.exit(2);
        }

        try (var stream = new FileInputStream(Paths.get(args[0]).toFile())) {
            if (isValidJSON(stream)) {
                System.out.println("valid");
                System.exit(0);
            }
            System.out.println("invalid");
            System.exit(1);
        } catch (IOException e) {
            System.out.println("not found");
            System.exit(2);
        }
    }
}
