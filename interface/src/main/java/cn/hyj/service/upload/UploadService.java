package cn.hyj.service.upload;

/**
 * Created by huyongjin on 2017/1/9.
 */
public interface UploadService {
    String uploadPic(byte[] pic, String name, long size);
}
