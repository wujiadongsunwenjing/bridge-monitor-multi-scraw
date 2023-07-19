/**
 * Copyright(C),2019-2023,华设检测科技有限公司
 * FileName: CarTestJMultiScrawl
 * Author:    WJD
 * Date:     2023/7/10  11:20
 * Description: 获取荷载试验相关指标
 */
package cn.com.cdg.hsjc.multiscrawl.decorators;

import cn.com.cdg.hsjc.model.RealTime;
import cn.com.cdg.hsjc.multiscrawl.MultiScrawl;
import cn.com.cdg.hsjc.vo.MonitorTypeParamVo;

import java.util.List;

public class CarTestMultiScrawl implements MultiScrawl {

    private MultiScrawl multiScrawl;

    public CarTestMultiScrawl(MultiScrawl multiScrawl){
        this.multiScrawl = multiScrawl;
    }

    /**
     * @Author WJD
     * @Description //获得车辆荷载试验相关信息
     * @Date 13:45 2023/7/10
     * @Param [realTimeList]
     * @return java.util.List<cn.com.cdg.hsjc.model.RealTime>
     **/
    @Override
    public List<RealTime> multiScrawl(List<RealTime> realTimeList) {
        return null;
    }
}

