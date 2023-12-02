package com.utkal.springboot.demo;

public class Member {
  private long id;
  private String name;
  private String email;
  private String address;

  public Member(long id, String name, String email, String address) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.address = address;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public String getAddress() {
    return address;
  }

  @Override
  public String toString() {
    return "Member Details => [ id = " + id + ", name = " + name + ", email = " + email + ", address = " + address
        + "]";

  }
}
