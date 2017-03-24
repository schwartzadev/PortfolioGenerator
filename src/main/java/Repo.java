/**
 * Created by andrew on 3/23/17.
 */
public class Repo {
    public class Download {
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        String name;

        public String getHtml_url() {
            return html_url;
        }

        public void setHtml_url(String html_url) {
            this.html_url = html_url;
        }

        String html_url;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        String description;
        String updated_at;
        int stargazers_count;

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        String language;
        int forks_count;



        public Download(){
        }

        @Override
        public String toString() {
            return  "\nName: " + this.name +
                    "\nDescription: " + this.description +
                    "\nUpdated At: " + this.updated_at +
                    "\n# of Stargazers: " + this.stargazers_count +
                    "\nLanguage: " + this.language +
                    "\n# of Forks: " + this.forks_count +
                    "\nURL: " + this.html_url+"\n";
        }
    }
}
