/**
 * Copyright(C),2019-2023,华设检测科技有限公司
 * FileName: RestTemplateConfig
 * Author:    WJD
 * Date:     2023/7/10  13:40
 * Description: 访问远程API接口
 */
package cn.com.cdg.hsjc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Configuration
public class RestTemplateConfig {

    /**
     * @Author WJD
     * @Description //开启访问第三方接口
     * @Date 13:41 2023/7/10
     * @Param []
     * @return org.springframework.web.client.RestTemplate
     **/
    @Bean
    public RestTemplate restTemplate(){
        OkHttp3ClientHttpRequestFactory okhttp3 = new OkHttp3ClientHttpRequestFactory();
        //设置连接超时时间
        okhttp3.setConnectTimeout(10000);
        //设置读取超时时间
        okhttp3.setReadTimeout(30000);
        RestTemplate restTemplate = new RestTemplate(okhttp3);
        //解决中文乱码
        List<HttpMessageConverter<?>> messageConverters = restTemplate.getMessageConverters();
        messageConverters.add(new StringHttpMessageConverter(StandardCharsets.UTF_8));
        //自定义错误响应,返回详细错误信息
        restTemplate.setErrorHandler(new ResponseErrorHandler() {
            @Override
            public boolean hasError(ClientHttpResponse response) throws IOException {
                return false;
            }

            @Override
            public void handleError(ClientHttpResponse response) throws IOException {

            }
        });
        return restTemplate;
    }
}