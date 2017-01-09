package cn.hyj.service.upload;

import cn.hyj.common.fdfs.FastDFSUtils;
import org.springframework.stereotype.Service;

/**
 * Created by huyongjin on 2017/1/9.
 */
@Service("uploadService")
public class UploadServiceImpl implements UploadService {
    @Override
    public String uploadPic(byte[] pic, String name, long size) {
        return FastDFSUtils.uploadPic(pic,name,size);
    }
}
