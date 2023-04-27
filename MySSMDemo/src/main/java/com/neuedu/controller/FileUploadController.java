package com.neuedu.controller;


import com.alibaba.fastjson2.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;


@Controller
public class FileUploadController {

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public @ResponseBody String fileUpload(@RequestParam("pFile") MultipartFile pFile, HttpServletRequest request) throws IOException {
        //取上下文路径
        String rootPath = request.getServletContext().getRealPath("/upload");
        //2、获取二级目录名称  使用当天日期作为目录名
        String dirName = new SimpleDateFormat("yyyyMMdd").format(new Date());
        //访问图片的url，web访问路径
        String url = request.getContextPath() + "/upload";
        //3、文件类型 白名单
        String[] exts = {".jpg", ".png", ".gif", ".doc", "docx", ".xls", ".xlsx"};

        //5、获取文件名
        String oldfileName = pFile.getOriginalFilename();
        //获取原文件名后缀
        String suffix = oldfileName.substring(oldfileName.lastIndexOf("."));

        HashMap<String, String> map = new HashMap<>();
        //将文件后缀和白名单列中项进行比对，任意一个匹配就允许上传
        if (Arrays.stream(exts).anyMatch(x -> x.equals(suffix))) {

            //判断二级存储目录是否存在，不存在则新建一个
            File dir = new File(rootPath + "/" + dirName);
            if (!dir.exists())
                dir.mkdirs();

            //保存上传文件
            //使用时间作为新的文件名，避免重名
            String fileName = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
            //组件新文件名
            String newfileName = rootPath + "/" + dirName + "/" + fileName + suffix;
            url += "/" + dirName + "/" + fileName + suffix;
            //保存文件
            File newFile = new File(newfileName);
            pFile.transferTo(newFile);
            //将web访问路径url放入 hashmap，转换成json数据格式进行返回
            map.put("img", url);
            return JSONObject.toJSONString(map);
        } else {
            map.put("errmsg", "文件格式不正确");
            return JSONObject.toJSONString(map);
        }
    }

}
