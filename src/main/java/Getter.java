import org.apache.commons.io.IOUtils;

import java.net.URL;

/**
 * Created by andrew on 2/28/17.
 * This class takes a String that is a URL and then retrieves and returns the data from
 *  the provided URL. Especially good for retrieving JSON files.
 */


public class Getter {
    public static String get(String urlString) throws Exception {
        URL url = new URL(urlString);
        return IOUtils.toString(url.openStream(), "UTF-8");
    }

}