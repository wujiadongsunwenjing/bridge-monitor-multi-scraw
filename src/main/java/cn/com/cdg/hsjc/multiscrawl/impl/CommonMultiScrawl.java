/**
 * Copyright(C),2019-2023,华设检测科技有限公司
 * FileName: MultiScrawlServiceImpl
 * Author:    WJD
 * Date:     2023/7/10  11:16
 * Description: 多源数据抓取默认实现
 */
package cn.com.cdg.hsjc.multiscrawl.impl;

import cn.com.cdg.hsjc.model.RealTime;
import cn.com.cdg.hsjc.multiscrawl.MultiScrawl;
import cn.com.cdg.hsjc.vo.MonitorTypeParamVo;

import java.util.List;

public class CommonMultiScrawl implements MultiScrawl {

    /**
     * @Author WJD
     * @Description //多源数据抓取(车温解耦,挠度统计)
     * @Date 13:45 2023/7/10
     * @Param [realTimeList]
     * @return java.util.List<cn.com.cdg.hsjc.model.RealTime>
     **/
    @Override
    public List<RealTime> multiScrawl(List<RealTime> realTimeList) {

        return null;
    }
}

