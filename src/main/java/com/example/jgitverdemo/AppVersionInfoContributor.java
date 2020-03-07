package com.example.jgitverdemo;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class AppVersionInfoContributor implements InfoContributor  {

    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("version", "TODO");
    }
}
