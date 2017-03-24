/**
 * Created by andrew on 3/23/17.
 */
public class User {

    class Download {
        String login;
        int id;
        String avatar_url;
        String html_url;
        String name;
        String location;
        String email;
        String bio;


        public Download(){
        }

        @Override
        public String toString() {
            return "Login: " + this.login +
                    "\nID: " + this.id +
                    "\nHTML URL: " + this.html_url +
                    "\nName: " + this.name +
                    "\nLocation: " + this.location +
                    "\nEmail: " + this.email +
                    "\nEmail: " + this.bio +
                    "\nAvatar URL: " + this.avatar_url;
        }
    }
}