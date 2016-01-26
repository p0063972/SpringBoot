package com.zjs;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2016/1/20.
 */
@Configuration
@EnableSwagger
public class SwaggerConfig {
    @Autowired
    private SpringSwaggerConfig swaggerConfig;
    @Bean
    public SwaggerSpringMvcPlugin groupOnePlugin() {
        return new SwaggerSpringMvcPlugin(swaggerConfig).apiInfo(apiInfo()).swaggerGroup("admin");
    }
    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo("Swagger With Spring Boot",
                "An example application to demonstrate Swagger working with", null,
                "stonetingxin@163.com", null, null);
        return apiInfo;
    }

}

