import java.io.IOException;

public class GitHubApp {


    public static void main(String[] args) throws IOException {
        ApacheHttp.getCollaborators();
        ApacheHttp.sentInvite();
    }
}
