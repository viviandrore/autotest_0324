/**
 * Created by q on 2016/4/15.
 */

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class login {
    public static void main(String[] args) {
        try {
            test();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void test() throws IOException {
        URL url = new URL("http://www.baidu.com");
        System.out.println("==================以下为网站内容==================");
        URLConnection urlcon = url.openConnection();
        int i = urlcon.getContentLength();
        if (i > 0) {
            InputStream is = urlcon.getInputStream();
            int a;
            while ((a = is.read()) != -1) {
                System.out.print((char) a);
            }
            is.close();
        } else {
            System.out.println("响应内容为空...");
        }
    }
}
