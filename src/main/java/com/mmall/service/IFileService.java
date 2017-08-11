package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * 类说明：
 *
 * @author: Casin
 * @Create: 2017-07-05 12:34
 * @HOME: https://qincasin.github.io/
 */

public interface IFileService {
    //文件的上传
    String upload(MultipartFile file, String path);
}
