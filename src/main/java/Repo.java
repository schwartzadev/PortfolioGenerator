/**
 * Created by andrew on 3/23/17.
 */
public class Repo {
    class Download {
        int id;
        String name;
        String html_url;
        String description;
        String updated_at;
        int stargazers_count;
        String language;
        int forks_count;



        public Download(){
        }

        @Override
        public String toString() {
            return  "\nName: " + this.name +
                    "\nID: " + this.id +
                    "\nDescription: " + this.description +
                    "\nUpdated At: " + this.updated_at +
                    "\n# of Stargazers: " + this.stargazers_count +
                    "\nLanguage: " + this.language +
                    "\n# of Forks: " + this.forks_count +
                    "\nGravatar URL: " + this.html_url+"\n";
        }
    }
}
