package cn.hyj.common.fdfs;

import cn.hyj.common.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.csource.common.NameValuePair;
import org.csource.fastdfs.*;

/**
 * Created by huyongjin on 2017/1/9.
 */
public class FastDFSUtils {

    public static String uploadPic(byte[] pic, String name, long size) {
        String path = null;
        try {
            ClientGlobal.init(FileUtils.getResourcePath("fdfs_client.conf"));
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getConnection();
            StorageServer storageServer = null;
            StorageClient1 storageClient1 = new StorageClient1(trackerServer,storageServer);
            String ext = FilenameUtils.getExtension(name);
            NameValuePair[] meta_list = new NameValuePair[3];
            meta_list[0] = new NameValuePair("fileName",name);
            meta_list[1] = new NameValuePair("fileExt",ext);
            meta_list[2] = new NameValuePair("fileSize",String.valueOf(size));


            //  group1/M00/00/01/wKjIgFWOYc6APpjAAAD-qk29i78248.jpg
            path = storageClient1.upload_file1(pic, ext, meta_list);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return path;
    }
}
