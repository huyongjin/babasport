/**
  * 模块: [该类所处的模块功能说明]<br>
  * 版权: Copyright (c) 2012-2017 Travelsky,Corp.<br>
  * 编号：日期：作者：描述<br>
  * -------------------------------------------------------------------------------------<br>
  * 001：2017年1月9日：huyongjin：SVNlog:新建<br>
  * <br>
  */
package cn.hyj.common.io;

import org.springframework.core.io.ClassPathResource;

/**
 * @ClassName:  FileUtils
 * @Description:(这里用一句话描述这个类的作用)
 * @author: huyongjin
 * @date:   2017年1月9日
 */
public class FileUtils {

	/**
	 * 根据资源名获取所在classpath路径
	 * @param resourceName
	 * @return
	 */
	public static String getResourcePath(String resourceName) {
		ClassPathResource resource = new ClassPathResource(resourceName);
		return resource.getClassLoader().getResource(resourceName).getPath();
	}
}
