/**
 * Copyright(C),2019-2023,华设检测科技有限公司
 * FileName: MultiScrawl
 * Author:    WJD
 * Date:     2023/7/10  11:01
 * Description: 多源数据抓取接口
 */
package cn.com.cdg.hsjc.multiscrawl;

import cn.com.cdg.hsjc.model.RealTime;
import cn.com.cdg.hsjc.vo.MonitorTypeParamVo;

import java.util.List;

public interface MultiScrawl {

    /**
     * @Author WJD
     * @Description //多源数据抓取
     * @Date 13:48 2023/7/10
     * @Param [realTimeList]
     * @return java.util.List<cn.com.cdg.hsjc.model.RealTime>
     **/
    List<RealTime> multiScrawl(List<RealTime> realTimeList);
}
