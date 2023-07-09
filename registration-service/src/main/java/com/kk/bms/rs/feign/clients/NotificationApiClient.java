package com.kk.bms.rs.feign.clients;

import com.kk.bms.rs.jpa.entities.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "notificationApi", url = "http://localhost:8082/api/")
public interface NotificationApiClient {

    @RequestMapping(method = RequestMethod.POST, value = "/v1/notify", consumes = "application/json")
    Boolean notifie(@RequestBody User user);
}
