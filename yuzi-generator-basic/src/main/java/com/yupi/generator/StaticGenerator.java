package com.yupi.generator;

import cn.hutool.core.io.FileUtil;

import java.io.File;

public class StaticGenerator {

    /**
     * 将input目录下的文件复制到output目录下
     * @param inputPath
     * @param outputPath
     */
    public static void copyFileByHutool(String inputPath, String outputPath) {
        FileUtil.copy(inputPath,outputPath,false);
    }

    public static void main(String[] args) {
        //获取此项目的根目录
        String projectPath = System.getProperty("user.dir");
        //获取此目录的父目录，即yuzi-generator
        File parentFile = new File(projectPath).getParentFile();
        //输入路径，ACM示例代码模版目录
        String inputPath = new File(parentFile,"yuzi-generator-demo-projects/acm-template").getAbsolutePath();
        //输出路径，直接输出到项目的根目录
        String outputPath = projectPath;
        copyFileByHutool(inputPath, outputPath);

    }
}
