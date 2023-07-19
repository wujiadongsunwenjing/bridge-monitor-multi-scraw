/**
 * Copyright(C),2019-2023,华设检测科技有限公司
 * FileName: RealTime
 * Author:    WJD
 * Date:     2023/7/10  9:59
 * Description: mongodb实时数据表
 */
package cn.com.cdg.hsjc.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Sharded;

import java.util.List;

@Data
@Accessors(chain = true)
@Sharded(shardKey = {"stationId","time"})
@ApiModel(value = "实时数据实时类,用来统一监测数据格式")
public class RealTime {

    @Indexed
    @ApiModelProperty(value = "监测点编号")
    private String stationId;

    @Indexed
    @ApiModelProperty(value = "监测时间long")
    private Long time;

    @ApiModelProperty(value = "监测数据集合")
    private List<Double> data;

}

