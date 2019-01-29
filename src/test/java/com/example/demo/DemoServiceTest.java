package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoServiceTest {
  @Autowired
  private DemoService demoService;

  @Test
  public void shouldGetFullnameWhenInputFirstnameAndLastname() throws Exception {
    String firstname = "Yuichi";
    String lastname = "Ozaki";
    String fullname = "Yuichi Ozaki";
    Demo demo = new Demo(firstname, lastname);
    Demo actual = demoService.save(demo);

    assertThat(actual.getFullname()).isEqualTo(fullname);
    assertThat(actual.getFirstname()).isEqualTo(firstname);
    assertThat(actual.getLastname()).isEqualTo(lastname);
    assertThat(actual.getId()).isNotNull();
  }

  @Test
  public void shouldNotGetFullnameWhenInputOnlyFirstname() throws Exception {
    String firstname = "Yuichi";
    String lastname = "";
    String fullname = "";
    Demo demo = new Demo(firstname, lastname);
    Demo actual = demoService.save(demo);

    assertThat(actual.getFullname()).isEqualTo(fullname);
    assertThat(actual.getFirstname()).isEqualTo(firstname);
    assertThat(actual.getLastname()).isEqualTo(lastname);
    assertThat(actual.getId()).isNotNull();
  }

  @Test
  public void shouldNotGetFullnameWhenInputOnlyLastname() throws Exception {
    String firstname = "";
    String lastname = "Ozaki";
    String fullname = "";
    Demo demo = new Demo(firstname, lastname);
    Demo actual = demoService.save(demo);

    assertThat(actual.getFullname()).isEqualTo(fullname);
    assertThat(actual.getFirstname()).isEqualTo(firstname);
    assertThat(actual.getLastname()).isEqualTo(lastname);
    assertThat(actual.getId()).isNotNull();
  }

  @Test
  public void shouldNotGetFullnameWhenNotInput() throws Exception {
    String firstname = "";
    String lastname = "";
    String fullname = "";
    Demo demo = new Demo(firstname, lastname);
    Demo actual = demoService.save(demo);

    assertThat(actual.getFullname()).isEqualTo(fullname);
    assertThat(actual.getFirstname()).isEqualTo(firstname);
    assertThat(actual.getLastname()).isEqualTo(lastname);
    assertThat(actual.getId()).isNotNull();
  }
}