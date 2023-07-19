/**
 * Copyright(C),2019-2023,华设检测科技有限公司
 * FileName: MonitorTypeParamVo
 * Author:    WJD
 * Date:     2023/7/10  11:04
 * Description: 根据传递监测项/点查询监测数据
 */
package cn.com.cdg.hsjc.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class MonitorTypeParamVo {

    /**
     * 开始时间
     **/
    private Long startTime;

    /**
     * 结束时间
     **/
    private Long endTime;

    /**
     * 监测点条件集合
     **/
    private List<MonitorPointParamVo> paramList;

}

