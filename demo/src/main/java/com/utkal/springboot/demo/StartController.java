package com.utkal.springboot.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {
  @RequestMapping("/members")
  public List<Member> retrieveAllMembers() {
    return Arrays.asList(
        new Member(1, "Utkal Nayak", "utkalnayak@yahoo.com", "14052 Fox Hill Road, Sparks, MD - 21152"),
        new Member(2, "A Nayak", "utkalnayak@yahoo.com", "14052 Fox Hill Road, Sparks, MD - 21152"),
        new Member(3, "B Nayak", "utkalnayak@yahoo.com", "14052 Fox Hill Road, Sparks, MD - 21152"),
        new Member(4, "C Nayak", "utkalnayak@yahoo.com", "14052 Fox Hill Road, Sparks, MD - 21152"));
  }
}
