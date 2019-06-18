package com.example.mybatisplugdemo.base.core;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.*;

/**
 * @ClassNameRequestWrapper
 * @Description
 * @Author ASUS
 * @Date2019/6/5 9:15
 * @Version V1.0
 **/
@Data
@Slf4j
public class RequestWrapper extends HttpServletRequestWrapper {

    private final String requestBody;

    public RequestWrapper(HttpServletRequest request) {
        super(request);
        StringBuilder sb = new StringBuilder("");
        BufferedReader br = null;
        InputStream is = null;
        try {
            is = request.getInputStream();
            if (null != is) {
                br = new BufferedReader(new InputStreamReader(is));
                char[] tempBuffer = new char[1024];
                int tempRead = -1;
                while ((tempRead = br.read(tempBuffer)) >  0) {
                    sb.append(tempBuffer, 0, tempRead);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            log.info("HTTP_SERVLET_REQUEST IO 读写异常");
        } finally {
            if (null != is){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    log.info("HTTP_SERVLET_REQUEST IO 关闭异常");
                }
            }
            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    log.info("HTTP_SERVLET_REQUEST IO 关闭异常");
                }
            }
        }
        requestBody = sb.toString();
    }

    @Override
    public ServletInputStream getInputStream() throws IOException {
        final ByteArrayInputStream bis = new ByteArrayInputStream(requestBody.getBytes());
        return new ServletInputStream() {
            @Override
            public int read() throws IOException {
                return bis.read();
            }

            @Override
            public boolean isFinished() {
                return false;
            }

            @Override
            public boolean isReady() {
                return false;
            }

            @Override
            public void setReadListener(ReadListener readListener) {

            }
        };
    }

    @Override
    public BufferedReader getReader() throws IOException {
        return new BufferedReader(new InputStreamReader(this.getInputStream()));
    }
}
