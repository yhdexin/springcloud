package com.lk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class NativeConfigServerApplication {
    public static void main(String agrs[])
    {
        SpringApplication.run(NativeConfigServerApplication.class,agrs);
    }

}
