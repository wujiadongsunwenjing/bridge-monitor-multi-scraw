/**
 * Copyright(C),2019-2023,华设检测科技有限公司
 * FileName: ResultEnum
 * Author:    WJD
 * Date:     2023/3/17  10:48
 * Description: 统一响应状态码和信息
 */
package cn.com.cdg.hsjc.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "响应状态码和响应信息枚举类")
public enum ResultCodeEnum {

    RC200(200,"响应成功"),
    RC204(204,"响应体中无内容"),
    RC400(400,"请求参数错误"),
    RC401(401,"未授权"),
    RC403(403,"没有权限访问"),
    RC404(404,"请求资源不存在"),
    RC405(405,"请求参数格式错误"),
    RC429(429,"请求次数超限"),
    RC500(500,"服务器异常"),
    RC501(501,"数据库异常"),
    RC999(999,"响应失败");

    @ApiModelProperty(value = "响应状态码")
    private Integer code;

    @ApiModelProperty(value = "响应状态信息")
    private String msg;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    ResultCodeEnum() {}

    ResultCodeEnum(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }
}

