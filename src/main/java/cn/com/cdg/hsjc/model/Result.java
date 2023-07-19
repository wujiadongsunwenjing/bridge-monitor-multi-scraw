/**
 * Copyright(C),2019-2023,华设检测科技有限公司
 * FileName: Result
 * Author:    WJD
 * Date:     2023/3/17  10:08
 * Description: 统一响应
 */
package cn.com.cdg.hsjc.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "统一响应结果实体类")
public class Result<T> implements Serializable {

    private static final long serialVersionUID = -6646209220458222167L;

    @ApiModelProperty(value = "响应状态码")
    private Integer code;

    @ApiModelProperty(value = "响应信息")
    private String msg;

    @ApiModelProperty(value = "响应成功标识")
    private Boolean flag;

    @ApiModelProperty(value = "响应数据")
    private T data;

    /**
     * @Author WJD
     * @Description //响应成功
     * @Date 10:26 2023/3/17
     * @Param [code, msg, data]
     * @return cn.com.cdg.hsjc.utils.Result<T>
     **/
    public static <T> Result<T> success(Integer code, String msg,T data){
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setFlag(true);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    /**
     * @Author WJD
     * @Description //响应失败
     * @Date 10:32 2023/3/17
     * @Param [code, msg, data]
     * @return cn.com.cdg.hsjc.utils.Result<T>
     **/
    public static <T> Result<T> failure(Integer code,String msg,T data){
        Result<T> result = new Result<>();
        result.setFlag(false);
        result.setMsg(msg);
        result.setCode(code);
        result.setData(data);
        return result;
    }

}

