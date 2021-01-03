package com.kevin.flink.ananly.common.vo;

import java.io.Serializable;

/**
 * 终端信息
 *
 * @author wangyong
 */
public class DeviceComonInfo implements Serializable {

  /**
   * 用户ID
   */
  protected String userId;

  /**
   * 设备ID
   */
  protected String deviceId;

  /**
   * 设备类型
   */
  protected String deviceType;

  /**
   * 打开终端时间
   */
  protected String openDateTime;

  /**
   * 关闭终端时间
   */
  protected String closeDateTime;

  /**
   * 远程地址
   */
  protected String remoteIp;

  /**
   * 国家
   */
  protected String country;

  /**
   * 省份
   */
  protected String province;

  /**
   * 城市
   */
  protected String city;

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  public String getOpenDateTime() {
    return openDateTime;
  }

  public void setOpenDateTime(String openDateTime) {
    this.openDateTime = openDateTime;
  }

  public String getCloseDateTime() {
    return closeDateTime;
  }

  public void setCloseDateTime(String closeDateTime) {
    this.closeDateTime = closeDateTime;
  }

  public String getRemoteIp() {
    return remoteIp;
  }

  public void setRemoteIp(String remoteIp) {
    this.remoteIp = remoteIp;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  @Override
  public String toString() {
    return "DeviceComonInfo{" +
        "userId='" + userId + '\'' +
        ", deviceId='" + deviceId + '\'' +
        ", deviceType='" + deviceType + '\'' +
        ", openDateTime='" + openDateTime + '\'' +
        ", closeDateTime='" + closeDateTime + '\'' +
        ", remoteIp='" + remoteIp + '\'' +
        ", country='" + country + '\'' +
        ", province='" + province + '\'' +
        ", city='" + city + '\'' +
        '}';
  }
}
