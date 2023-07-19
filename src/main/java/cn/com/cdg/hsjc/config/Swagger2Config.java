/**
 * Copyright(C),2019-2023,华设检测科技有限公司
 * FileName: Swagger2Config
 * Author:    WJD
 * Date:     2023/7/10  10:01
 * Description: swagger配置类
 */
package cn.com.cdg.hsjc.config;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2//开启swagger的自动配置
public class Swagger2Config {

    @Value("${swagger2.basic-info.license}")
    private String license;

    @Value("${swagger2.basic-info.license-url}")
    private String licenseUrl;

    @Value("${swagger2.basic-info.title}")
    private String title;

    @Value("${swagger2.basic-info.description}")
    private String description;

    @Value("${swagger2.basic-info.contact-name}")
    private String contactName;

    @Value("${swagger2.basic-info.contact-email}")
    private String contactEmail;

    @Value("${swagger2.basic-info.contact-url}")
    private String contactUrl;

    @Value("${swagger2.basic-info.version}")
    private String version;

    @Value("${swagger2.basic-info.base-package}")
    private String basePackage;

    /**
     * @Author WJD
     * @Description //多源数据抓取API定制
     * @Date 10:41 2023/7/10
     * @Param [environment]
     * @return springfox.documentation.spring.web.plugins.Docket
     **/
    @Bean
    public Docket bridgeMonitorMultiScrawling(Environment environment){
        //设置swagger2的环境作用范围
        Profiles profiles = Profiles.of("win","dev");
        Boolean flag = environment.acceptsProfiles(profiles);
        return new Docket(DocumentationType.SWAGGER_2).forCodeGeneration(true)//创建一个swagger的bean实例
                .groupName("bridge-monitor-multi-scrawl")
                .enable(flag)//是否开启
                .select()
                .apis(basePackage(basePackage))//配置如何扫描接口
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());//配置swagger2的基本信息
    }

    /**
     * @Author WJD
     * @Description //设置swagger2的基本信息
     * @Date 17:12 2023/4/27
     * @Param []
     * @return springfox.documentation.service.ApiInfo
     **/
    private ApiInfo apiInfo() {
        Contact contact = new Contact(contactName, contactUrl, contactEmail);
        ApiInfo apiInfo = new ApiInfoBuilder()
                .license(license)
                .licenseUrl(licenseUrl)
                .title(title)
                .description(description)
                .contact(contact)
                .version(version)
                .build();
        return apiInfo;
    }

    /**
     * @Author WJD
     * @Description //配置基本扫描包
     * @Date 10:43 2023/7/10
     * @Param [basePackage]
     * @return com.google.common.base.Predicate<springfox.documentation.RequestHandler>
     **/
    public static Predicate<RequestHandler> basePackage(final String basePackage) {
        return input -> declaringClass(input).transform(handlerPackage(basePackage)).or(true);
    }

    private static Function<Class<?>, Boolean> handlerPackage(final String basePackage) {
        return input -> {
            // 循环判断匹配
            for (String strPackage : basePackage.split(";")) {
                boolean isMatch = input.getPackage().getName().startsWith(strPackage);
                if (isMatch) {
                    return true;
                }
            }
            return false;
        };
    }

    private static Optional<? extends Class<?>> declaringClass(RequestHandler input) {
        return Optional.fromNullable(input.declaringClass());
    }



}

