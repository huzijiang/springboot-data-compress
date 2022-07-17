package com.demo.data.compress.util;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 *字符串压缩
 *
 *  * @author huzj
 *  * @version 1.0
 *  * @date 2022/7/16 17:37
 *
 **/
public class StringCompress{
    /**压缩字符串
     * @param str：正常的需要压缩的字符串
     * @return 压缩后的字符串
     **/
    public static String compress(String str) {
        if (str.length() <= 0) {
            return str;
        }
        try{
            ByteArrayOutputStream bos = null;
            //使用默认缓冲区大小创建新的输出流
            GZIPOutputStream os=null;
            byte[] bs =null;
            try{
                bos = new ByteArrayOutputStream();
                os = new GZIPOutputStream(bos);
                //写入输出流
                os.write(str.getBytes());

                os.close();
                bos.close();

                bs = bos.toByteArray();
                return new String(bs,"utf8");
            }finally{
                bs = null;
                bos = null;
                os = null;
            }
        }catch(Exception ex){
            return str;
        }
    }

}
