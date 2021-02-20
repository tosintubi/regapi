package com.tommot.userreg.registration;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private EmailValidator emailValidator;
    public String register(RegistrationRequest request) {

        boolean isvalid = emailValidator.test(request.getEmail());
        return "works";
    }
}
