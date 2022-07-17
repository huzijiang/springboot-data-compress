package com.demo.data.compress.controller;

import com.demo.data.compress.bean.Point;
import com.demo.data.compress.util.GzipUtil;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

/**
 * @author huzj
 * @version 1.0
 * @date 2022/7/16 18:04
 */
@RestController
public class DataCompressController {

    /**
     * 模拟查询大量报表数据
     */
    @GetMapping("/getBigData")
    public String selectAllData() throws IOException {
        Gson gson=new Gson();
        LinkedList<Point> linkedList=new LinkedList<>();

        for (int i = 0; i < 51200; i++) {
            Point point=new Point();
                  point.setX(i);
                  point.setY(i/5);
            linkedList.add(point);
        }

        String result=gson.toJson(linkedList);
        //服务端开启压缩后 可不用再单独进行压缩
//        return  GzipUtil.compress(result);
        return result;
    }

}
