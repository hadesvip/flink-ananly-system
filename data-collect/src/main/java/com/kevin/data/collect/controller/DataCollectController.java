package com.kevin.data.collect.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 数据收集
 *
 * @author wangyong
 */
@RestController
@RequestMapping("/dataCollect")
public class DataCollectController {


  @GetMapping("/echo/{name}")
  public String echo(@PathVariable("name") String name) {
    return "hello,".concat(name).concat("!");
  }


}
