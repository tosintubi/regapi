package com.tommot.userreg.registration;

import com.tommot.userreg.appuser.AppUser;
import com.tommot.userreg.appuser.AppUserRole;
import com.tommot.userreg.appuser.AppUserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final EmailValidator emailValidator;
    private final AppUserService appUserService;
    public String register(RegistrationRequest request) {


        boolean isValid = emailValidator.test(request.getEmail());
        if (isValid) {
            throw  new IllegalStateException("Email address is not valid");
        }
        return appUserService.signUpUser(new AppUser(
                request.getFirstName(),
                request.getLastName(),
                request.getEmail(),
                request.getPassword(),
                AppUserRole.USER
        ));
    }
}
