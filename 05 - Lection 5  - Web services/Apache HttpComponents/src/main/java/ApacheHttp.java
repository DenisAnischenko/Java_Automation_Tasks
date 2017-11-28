import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

public class ApacheHttp {
    public static void getCollaborators() throws IOException {
        HttpGet httpget = new HttpGet("https://api.github.com/repos/DenisAnischenko/Java_Automation_Tasks/collaborators");
        httpget.addHeader("Authorization", "Basic ZGVuaXNhbmlzY2hlbmtvOmdiaGZ2YmxmMTk4NA==");
        httpget.addHeader("User-Agent", "Chrome");
        HttpClient client = HttpClientBuilder.create().build();
        HttpResponse response = client.execute(httpget);
        HttpEntity entity = response.getEntity();
        String result = EntityUtils.toString(response.getEntity());
        System.out.println("GET Response:" + result);
        JSONArray array = new JSONArray(result);
        JSONObject jsonObj = new JSONObject(array.get(0).toString());
        System.out.println(jsonObj.get("login"));
    }

    public static void sentInvite() throws IOException {
        HttpPut httpget = new HttpPut("https://api.github.com/repos/DenisAnischenko/Java_Automation_Tasks/collaborators/EkaterinaSvitina");
        httpget.addHeader("Authorization", "Basic ZGVuaXNhbmlzY2hlbmtvOmdiaGZ2YmxmMTk4NA==");
        httpget.addHeader("User-Agent", "Chrome");
        HttpClient client = HttpClientBuilder.create().build();
        HttpResponse response = client.execute(httpget);
        System.out.println(response.getStatusLine().getStatusCode());
    }
}
