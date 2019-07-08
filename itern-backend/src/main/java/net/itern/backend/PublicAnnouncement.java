package net.itern.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController("/")
public class PublicAnnouncement {

    @GetMapping
    public String hello() {
        return "System initialized at " + LocalTime.now();
    }
}
