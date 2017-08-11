package com.mmall.service.impl;

import com.mmall.service.IFileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * 类说明：使用Spring MVC自带的文件上传工具
 *
 * @author: Casin
 * @Create: 2017-07-05 12:35
 * @HOME: https://qincasin.github.io/
 */
@Service("iFileService")
public class FileServiceImpl implements IFileService {

    private Logger logger = LoggerFactory.getLogger(FileServiceImpl.class);

    public String upload(MultipartFile file,String path){
        String fileName=file.getOriginalFilename();
        //获取扩展名
        //abc.jpg
        String fileExtensionName=fileName.substring(fileName.lastIndexOf(".")+1);//获取扩展名不包含" . "
        String uploadFileName= UUID.randomUUID().toString()+"."+fileExtensionName;
        logger.info("开始上传文件，上传文件的文件名：{},上传的路径：{}，新文件名：{}",fileName,path,uploadFileName);

        //创建目录
        File fileDir = new File(path);
        if(!fileDir.exists()){
            fileDir.setWritable(true);
            fileDir.mkdirs();//可以创建多个文件
        }
        //创建文件
        File targetFile= new File(path,uploadFileName);
        try {
            file.transferTo(targetFile);
            //到这个地方文件已经上传成功了

            //todo 将targetFile上传到FTP服务器上

            //FTPUtil.uploadFile(Lists.newArrayList(targetFile));

            //todo 上传之后，删除upload下面的文件
            //targetFile.delete();
        } catch (IOException e) {
            logger.error("上传文件异常",e);
        }
        return targetFile.getName();
    }
}
