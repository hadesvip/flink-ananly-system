package com.kevin.data.collect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 数据收集服务
 *
 * @author wangyong
 */
@EnableDiscoveryClient
@SpringBootApplication
public class DataCollectApplication {

  public static void main(String[] args) {
    SpringApplication.run(DataCollectApplication.class, args);
  }
}
