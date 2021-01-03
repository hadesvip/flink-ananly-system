package com.kevin.flink.ananly.common.conts;

/**
 * 终端类型
 *
 * @author wangyong
 */
public enum DeviceTypeEnum {

  /**
   * pc
   */
  PC("PC", "PC端"),

  /**
   * app
   */
  APP("APP", "app端"),

  /**
   * 小程序
   */
  MINI_APP("MINI_APP", "小程序端");


  /**
   * 类型
   */
  private String type;

  /**
   * 描述
   */
  private String desc;

  public String getType() {
    return type;
  }

  public String getDesc() {
    return desc;
  }

  DeviceTypeEnum(String type, String desc) {
    this.type = type;
    this.desc = desc;
  }
}
