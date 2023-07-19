/**
 * Copyright(C),2019-2023,华设检测科技有限公司
 * FileName: MultiScrawlController
 * Author:    WJD
 * Date:     2023/7/10  13:42
 * Description: 多源数据抓取控制类
 */
package cn.com.cdg.hsjc.multiscrawl.controller;


import cn.com.cdg.hsjc.model.Result;
import cn.com.cdg.hsjc.vo.MonitorTypeParamVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/multi/scraws")
public class MultiScrawlController {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * @Author WJD
     * @Description //查询重车抓拍点数据
     * @Date 13:53 2023/7/10
     * @Param [monitorTypeParamVo]
     * @return cn.com.cdg.hsjc.model.Result<java.lang.String>
     **/
    @PostMapping("/one/displacement")
    public Result<String> getDisplacementData(@RequestBody MonitorTypeParamVo monitorTypeParamVo){

        return null;
    }

    /**
     * @Author WJD
     * @Description //多源数据抓取
     * @Date 13:56 2023/7/10
     * @Param [monitorTypeParamVo]
     * @return cn.com.cdg.hsjc.model.Result<java.lang.String>
     **/
    @PostMapping("/multi/displacement")
    public Result<String> multiScrawlData(@RequestBody MonitorTypeParamVo monitorTypeParamVo){
        return null;
    }
}