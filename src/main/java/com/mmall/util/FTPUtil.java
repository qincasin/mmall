package com.mmall.util;

import org.apache.commons.net.ftp.FTPClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

/**
 * 类说明：FTPUtil图片的远程上传工具
 *
 * @author: Casin
 * @Create: 2017-07-05 12:53
 * @HOME: https://qincasin.github.io/
 */

public class FTPUtil {
    private static final Logger logger= LoggerFactory.getLogger(FTPUtil.class);

    private static String ftpIp=PropertiesUtil.getProperty("ftp.server.ip");
    private static String ftpUser=PropertiesUtil.getProperty("ftp.user");
    private static String ftpIpPass=PropertiesUtil.getProperty("ftp.pass");

    /*ip*/
    private String ip;
    /*端口*/
    private int port;
    /*用户名*/
    private String user;
    /*密码*/
    private String pwd;
    /*客户端*/
    //构造方法
    public FTPUtil(String ip, int port, String user, String pwd) {
        this.ip = ip;
        this.port = port;
        this.user = user;
        this.pwd = pwd;
    }
    //上传文件（可以上传多个文件）（公开方法）
    public static boolean uploadFile(List<File> fileList) throws IOException {
        FTPUtil ftpUtil = new FTPUtil(ftpIp,21,ftpUser,ftpIpPass);
        logger.info("开始连接ftp服务器");
        //上传到远程服务器上面的img文件夹路径下
        boolean result =ftpUtil.uploadFile("img",fileList);
        logger.info("开始连接ftp服务器，结束上传，上传结果:{}",result);
        return result;


    }
    //上传文件到远程服务器（私有方法）
    private boolean uploadFile(String remotePath,List<File> fileList) throws IOException {
        boolean uploaded =true;
        FileInputStream fis=null;
        //连接FTP服务器
        if(connectServer(this.ip,this.port,this.user,this.pwd)){
            //改变工作目录
            try {
                ftpClient.changeWorkingDirectory(remotePath);
                ftpClient.setBufferSize(1024);//设置缓冲
                ftpClient.setControlEncoding("UTF-8");//设置字符编码格式
                ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);//设置文件类型为二进制格式
                ftpClient.enterLocalPassiveMode();//输入本地被动模式
                for(File fileItem:fileList){
                    fis= new FileInputStream(fileItem);
                    ftpClient.storeFile(fileItem.getName(),fis);//存储文件
                }
            } catch (IOException e) {
                logger.error("上传文件异常",e);
                uploaded=false;
                e.printStackTrace();
            }finally {
                fis.close();
                ftpClient.disconnect();
            }
        }
        return uploaded;



    }
    //连接FTP服务器
    public boolean connectServer(String ip,int port,String user,String pwd){
        boolean isSuccess =false;
        ftpClient = new FTPClient();
        try {
            ftpClient.connect(ip);
            isSuccess=ftpClient.login(user,pwd);
        } catch (IOException e) {
            logger.error("连接FTp服务器异常",e);
        }
        return isSuccess;

    }




    private FTPClient ftpClient;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public FTPClient getFtpClient() {
        return ftpClient;
    }

    public void setFtpClient(FTPClient ftpClient) {
        this.ftpClient = ftpClient;
    }
}
