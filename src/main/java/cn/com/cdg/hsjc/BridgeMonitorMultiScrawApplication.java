/**
 * Copyright(C),2019-2023,华设检测科技有限公司
 * FileName: BridgeMonitorMultiScrawApplication
 * Author:    WJD
 * Date:     2023/7/10  9:58
 * Description: 多源数据抓取主启动类
 */
package cn.com.cdg.hsjc;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableScheduling
public class BridgeMonitorMultiScrawApplication {

    public static void main(String[] args) {
        SpringApplication.run(BridgeMonitorMultiScrawApplication.class,args);
    }
}

