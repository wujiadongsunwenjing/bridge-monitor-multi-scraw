/**
 * Copyright(C),2019-2023,华设检测科技有限公司
 * FileName: MonitorPointParamVo
 * Author:    WJD
 * Date:     2023/7/10  11:07
 * Description: 监测点信息请求参数
 */
package cn.com.cdg.hsjc.vo;


import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class MonitorPointParamVo {

    /**
     * 监测项ID
     **/
    private String monitorTypeId;

    /**
     * 是否查询特征值(false查询实时,true查询特征)
     **/
    private Boolean isHistory=false;

    /**
     * 查询数据表
     **/
    private String monitorTypeTable;

    /**
     * 查询特征值
     **/
    private Integer monitorTypeEigenvalueCode;

    /**
     * 监测点集合
     **/
    private List<String> stationList;
}

