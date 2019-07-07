package com.coming.look.utils;

import org.springframework.util.StringUtils;

import java.io.*;
import java.util.List;

/**
 * 将文本的sql语句插入到数据库中，主要是给单元测试使用，这样就不用建临时表
 * @author yigang.wu
 * @date created in $time $date
 */
public class DataProcess {


    public List<String> readStrFromFile(String path) throws Exception{
        BufferedReader input=new BufferedReader(new InputStreamReader
                (new BufferedInputStream(
                        new FileInputStream(new File(path))),"utf-8"));
        String line = null;
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while((line = input.readLine()) != null) {
                //对文本的数据的行进行解析，如果行为空的话，就换行
                if(!StringUtils.isEmpty(line)){
                    //对每一行数据进行空格分隔，然后取不为空的数据进行重新组装
                    String[] strs = line.split(" ");
                    StringBuffer sb = new StringBuffer("");
                    for(String str:strs){
                        if(!StringUtils.isEmpty(str)){
                            sb.append(str+" ");
                        }
                    }
                    stringBuffer.append(sb.toString()+" ");
                }else{
                    stringBuffer.append("\n");
                }
            }
        return null;
    }


}
