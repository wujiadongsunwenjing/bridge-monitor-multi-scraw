/**
 * Copyright(C),2019-2023,华设检测科技有限公司
 * FileName: FftMultiScrawl
 * Author:    WJD
 * Date:     2023/7/10  11:20
 * Description: 非重车过桥时fft变化
 */
package cn.com.cdg.hsjc.multiscrawl.decorators;

import cn.com.cdg.hsjc.model.RealTime;
import cn.com.cdg.hsjc.multiscrawl.MultiScrawl;
import cn.com.cdg.hsjc.vo.MonitorTypeParamVo;

import java.util.List;

public class FftMultiScrawl implements MultiScrawl {

    private MultiScrawl multiScrawl;

    public FftMultiScrawl(MultiScrawl multiScrawl){
        this.multiScrawl = multiScrawl;
    }

    /**
     * @Author WJD
     * @Description //获取fft结果
     * @Date 13:46 2023/7/10
     * @Param [realTimeList]
     * @return java.util.List<cn.com.cdg.hsjc.model.RealTime>
     **/
    @Override
    public List<RealTime> multiScrawl(List<RealTime> realTimeList) {
        return null;
    }

}

