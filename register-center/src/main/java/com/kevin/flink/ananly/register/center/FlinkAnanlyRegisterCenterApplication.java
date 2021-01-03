package com.kevin.flink.ananly.register.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心
 *
 * @author wangyong
 */
@EnableEurekaServer
@SpringBootApplication
public class FlinkAnanlyRegisterCenterApplication {

  public static void main(String[] args) {
    SpringApplication.run(FlinkAnanlyRegisterCenterApplication.class, args);
  }
}
