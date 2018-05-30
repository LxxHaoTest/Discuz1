package util;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.xalan.xslt.Process;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * 配置log日志
 * Logger ----- 在执行应用程序时，接收日志语句生成的日志请求。
    Appender -- 管理日志语句的输出结果。
    Layout ----- 用于指定 appender 将日志语句写入日志目的地所采用的格式。
 */
public class LogConfiguration {
    public static void initlog(){
        //设置日期输出格式
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy_MM_dd HH_mm_ss");
        //获取本地网络时间
        String date=dateFormat.format(new Date());
        //声明文件的存储路径和文件格式
        final String logFilePath="./Log/"+date+".log";
        Properties properties=new Properties();
        //将日志信息输出到控制台和指定文件
        properties.setProperty("log4j.rootLogger","info,toConsole,toFile");
        //设置日志在文件中的格式展示
        properties.setProperty("log4j.appender.toConsole","org.apache.log4j.ConsoleAppender");
        properties.setProperty("log4j.appender.toConsole.layout","org.apache.log4j.PatternLayout");
        properties.setProperty("log4j.appender.toConsole.layout.ConversionPattern","[%d{yyyy_MM_dd HH:mm:ss}] [%p] %m%n");
        properties.setProperty("log4j.appender.toFile","org.apache.log4j.DailyRollingFileAppender");
        properties.setProperty("log4j.appender.toFile.layout","org.apache.log4j.PatternLayout");
        properties.setProperty("log4j.appender.toFile.layout.ConversionPattern","[%d{yyyy_MM_dd HH:mm:ss}] [%p] %m%n");
        properties.setProperty("log4j.appender.toFile.file",logFilePath);
        //使配置生效
        PropertyConfigurator.configure(properties);
    }
}
