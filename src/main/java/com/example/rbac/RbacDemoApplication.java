
package com.example.rbac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
    "com.example.rbac", "controller", "service", "model"
})
public class RbacDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RbacDemoApplication.class, args);
    }
}