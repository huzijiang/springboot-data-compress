package com.demo.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author huzj
 */
@SpringBootApplication
public class DataCompressApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataCompressApplication.class, args);
    }
}
