package com.epam.hotel.api.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/hotelServiceFallBack")
    public String hotelServiceFallBackMethod() {
        return "Hotel Service is taking longer than Expected." +
                " Please try again later";
    }

    @GetMapping("/guestServiceFallBack")
    public String guestServiceFallBackMethod() {
        return "Guest Service is taking longer than Expected." +
                " Please try again later";
    }
}