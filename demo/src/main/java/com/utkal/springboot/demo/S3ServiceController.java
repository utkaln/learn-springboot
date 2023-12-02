package com.utkal.springboot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class S3ServiceController {
  // auto wire allows to inject the bean from configuration declared with
  // @Component
  @Autowired
  private S3ServiceConfiguration s3config;

  @RequestMapping("/s3upload")
  public S3ServiceConfiguration retrieveAllMembers() {
    return s3config;
  }
}
