package com.utkal.springboot.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

// configuration properties allows to manage this for different environments
// prefix is what the variables are prepended with
@ConfigurationProperties(prefix = "aws-s3")

// Component annotation is to allow Spring to manage this, so consumer of this
// class can autowire
@Component
public class S3ServiceConfiguration {
  private String url;
  private String iamId;
  private String iamSecret;

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getIamId() {
    return iamId;
  }

  public void setIamId(String iamId) {
    this.iamId = iamId;
  }

  public String getIamSecret() {
    return iamSecret;
  }

  public void setIamSecret(String iamSecret) {
    this.iamSecret = iamSecret;
  }

}
