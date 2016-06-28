package com.game.assistance.controller;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.ObjectMetadata;
import com.game.assistance.response.Response;
import com.game.assistance.util.OssFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wenqing on 2016/6/28 0028.
 */
@RestController
public class UploadController {

    private static Logger LOGGER = LoggerFactory.getLogger(UploadController.class);

    public final static String BUCKET_NAME = "test-xiaoxin";

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public Response save(HttpServletRequest request) {
        String content = request.getParameter("content");
        String name = request.getParameter("name");
        StringBuffer p = new StringBuffer();
        p.append("<!DOCTYPE html> \n" +
                "<html>\n" +
                "<head>\n" +
                "<meta charset=\"utf-8\">\n" +
                "<meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no\"/>" +
                "<title>jQuery Mobile Web 应用程序</title>\n" +
                "<link rel=\"stylesheet\" href=\"http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.css\">" +
                "<script src=\"http://code.jquery.com/jquery-1.8.3.min.js\"></script>" +
                "<script src=\"http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.js\"></script>" +
                "</head> \n" +
                "<body><!--<div data-role=\"header\"></div>--> ");
        p.append(content);
        p.append("<!--<div data-role=\"footer\"> </div>-->" +
                "</body>\n" +
                "</html>");
        p.append("\r\n");
        OSSClient client = OssFactory.getClient();
        ObjectMetadata metadata = new ObjectMetadata();
        metadata.setContentType("text/html");
        try {
            client.putObject(BUCKET_NAME, "htmls/" + name + ".html", new ByteArrayInputStream(p.toString().getBytes("utf-8")), metadata);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String url = "http://" + BUCKET_NAME + ".oss-cn-shanghai.aliyuncs.com/htmls/" + name + ".html";
        return new Response(1, "success", url);
    }

    /**
     * 上传Froala Editor 图片
     *
     * @throws Exception
     */
    @RequestMapping(value = "/uploadImgEditor", method = RequestMethod.POST)
    @ResponseBody
    Map<String, String> uploadImgEditor(@RequestParam("file") MultipartFile file) {
        Map<String, String> map = new HashMap<>();
        OSSClient client = OssFactory.getClient();
        ObjectMetadata metadata = new ObjectMetadata();
        metadata.setContentType(file.getContentType());
        try {
            client.putObject(BUCKET_NAME, "image/" + file.getOriginalFilename(), file.getInputStream(), metadata);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String url = "http://" + BUCKET_NAME + ".oss-cn-shanghai.aliyuncs.com/image/" + file.getOriginalFilename();
        LOGGER.info("url:{}", url);
        map.put("link", url);
        return map;
    }

}
