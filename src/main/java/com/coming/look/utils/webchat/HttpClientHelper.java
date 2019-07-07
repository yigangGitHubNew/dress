package com.coming.look.utils.webchat;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 发送请求的http帮助类
 * @author yigang.wu
 * @date created in $time $date
 */
public class HttpClientHelper {

    public static HttpClient httpClient = HttpClientBuilder.create().build();

    /**
     *
     * @param url
     * @return
     */
    public static String requestGet(String url) throws Exception{
        HttpGet httpGet = new HttpGet(url);
        HttpResponse execute = httpClient.execute(httpGet);
        HttpEntity entity = execute.getEntity();
        InputStream content = entity.getContent();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(content, "UTF-8"));
        String line = bufferedReader.readLine();
        return line;
    }
    /**
     * 发送http请求
     * @param urlParam
     * @param charset
     * @param requestType
     * @return
     */
    public static String sendPost(String urlParam,String charset,String requestType) {
        StringBuffer resultBuffer = null;
        HttpURLConnection con = null;
        OutputStreamWriter osw = null;
        BufferedReader br = null;
        // 发送请求
        try {
            URL url = new URL(urlParam);
            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod(requestType);
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setUseCaches(false);
            con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            osw = new OutputStreamWriter(con.getOutputStream(), charset);
            osw.write(urlParam);
            osw.flush();
            // 读取返回内容
            resultBuffer = new StringBuffer();
            int contentLength = Integer.parseInt(con.getHeaderField("Content-Length"));
            if (contentLength > 0) {
                br = new BufferedReader(new InputStreamReader(con.getInputStream(), charset));
                String temp;
                while ((temp = br.readLine()) != null) {
                    resultBuffer.append(temp);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (osw != null) {
                try {
                    osw.close();
                } catch (IOException e) {
                    osw = null;
                    throw new RuntimeException(e);
                } finally {
                    if (con != null) {
                        con.disconnect();
                        con = null;
                    }
                }
            }
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    br = null;
                    throw new RuntimeException(e);
                } finally {
                    if (con != null) {
                        con.disconnect();
                        con = null;
                    }
                }
            }
        }

        return resultBuffer.toString();
    }

}
