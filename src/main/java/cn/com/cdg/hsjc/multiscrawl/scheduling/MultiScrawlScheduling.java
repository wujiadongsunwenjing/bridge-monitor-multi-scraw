/**
 * Copyright(C),2019-2023,华设检测科技有限公司
 * FileName: MultiScrawlScheduling
 * Author:    WJD
 * Date:     2023/7/10  13:59
 * Description: 多源数据抓取定时任务
 */
package cn.com.cdg.hsjc.multiscrawl.scheduling;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MultiScrawlScheduling {


    /**
     * @Author WJD
     * @Description //多源数据抓取、提取关键指标及入库
     * @Date 14:01 2023/7/10
     * @Param []
     * @return void
     **/
    @Scheduled(cron = "0 0/10 * * * ?")
    public void multiScrawlingData(){

    }

}