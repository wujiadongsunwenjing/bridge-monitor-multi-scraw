/**
 * Copyright(C),2019-2023,华设检测科技有限公司
 * FileName: PeakRecongnitionMultiScrawl
 * Author:    WJD
 * Date:     2023/7/10  11:18
 * Description: 峰值识别、图片提取
 */
package cn.com.cdg.hsjc.multiscrawl.decorators;

import cn.com.cdg.hsjc.model.RealTime;
import cn.com.cdg.hsjc.multiscrawl.MultiScrawl;

import java.util.List;

public class PeakRecognitionMultiScrawl implements MultiScrawl {

    private MultiScrawl multiScrawl;

    public  PeakRecognitionMultiScrawl(MultiScrawl multiScrawl){
        this.multiScrawl = multiScrawl;
    }

    /**
     * @Author WJD
     * @Description //峰值识别,车辆图片提取
     * @Date 13:47 2023/7/10
     * @Param [realTimeList]
     * @return java.util.List<cn.com.cdg.hsjc.model.RealTime>
     **/
    @Override
    public List<RealTime> multiScrawl(List<RealTime> realTimeList) {
        return null;
    }
}

