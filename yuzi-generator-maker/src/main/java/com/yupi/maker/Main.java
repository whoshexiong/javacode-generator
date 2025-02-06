package com.yupi.maker;

//import com.yupi.maker.cli.CommandExecutor;

import com.yupi.maker.generator.main.MainGenerator;
import freemarker.template.TemplateException;

import java.io.IOException;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) throws TemplateException, IOException, InterruptedException {

        MainGenerator mainGenerator = new MainGenerator();
        mainGenerator.doGenerate();
    }
}