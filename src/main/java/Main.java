import com.google.gson.Gson;
import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.*;
import java.util.*;

/**
 * Created by andrew on 3/20/17.
 */
public class Main {
    public static void main(String[] args) throws Exception{
        String userName = "torvalds";
        String userInput = Getter.get("https://api.github.com/users/" + userName);

        Gson gson = new Gson();
        User.Download user = gson.fromJson(userInput, User.Download.class); // creates POJO from Weather.java and the weather JSON
        System.out.println(user);

        String reposInput = Getter.get("https://api.github.com/users/" + userName + "/repos");
        Repo.Download[] repos = gson.fromJson(reposInput, Repo.Download[].class); // creates POJO from Weather.java and the weather JSON
        System.out.println(Arrays.toString(repos));

        /* ********* USE https://developer.github.com/v3/users/#get-a-single-user ********* */
        //Freemarker configuration object
        Configuration cfg = new Configuration();
        try {
            //Load template from source folder
            Template template = cfg.getTemplate("src/main.ftl");
            // Build the data-model

            Map<String, Object> data = new HashMap<String, Object>();
            List<Repo.Download> reposList = Arrays.asList(repos);
            data.put("reposList", reposList);
            data.put("handle", "@" + user.login);
            data.put("name", user.name);
            data.put("githuburl", user.html_url);
            data.put("bio", user.bio);
            data.put("location", user.location);

            // File output
            Writer file = new FileWriter(new File("test.html"));
            template.process(data, file);
            file.flush();
            file.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}