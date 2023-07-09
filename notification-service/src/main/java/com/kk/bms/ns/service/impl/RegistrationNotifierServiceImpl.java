package com.kk.bms.ns.service.impl;

import com.kk.bms.ns.domain.User;
import com.kk.bms.ns.service.NotifierService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RegistrationNotifierServiceImpl implements NotifierService {
    @Override
    public boolean notifie(User user) {
        log.info("Sending a registration completion notification to user email = {} for the user = {} "
                , user.getEmail(), user.getName());
        log.info("Successfully sent an user onboarding notification");
        return true;
    }
}
