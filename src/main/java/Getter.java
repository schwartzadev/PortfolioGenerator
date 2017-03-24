import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by andrew on 2/28/17.
 * This class takes a String that is a URL and then retrieves and returns the data from
 *  the provided URL. Especially good for retrieving JSON files.
 */


public class Getter {
    public static String get(String urlString) {
        StringBuilder sb = new StringBuilder();
        try {
            URL url = new URL (urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setDoOutput(true);
            connection.setRequestProperty  ("Authorization", "Basic " + Config.key);
            InputStream content = connection.getInputStream();
            BufferedReader in = new BufferedReader (new InputStreamReader(content));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
                sb.append(line);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

}