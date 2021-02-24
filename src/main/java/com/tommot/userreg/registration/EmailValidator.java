package com.tommot.userreg.registration;

import org.springframework.stereotype.Service;
import com.tommot.userreg.utils.Utils;
import java.util.function.Predicate;

@Service
public class EmailValidator  implements Predicate<String> {

    @Override
    public boolean test(String s) {
        // TODO: Regex to validate email. - Lets assume all is valid for now
        return Utils.isValidEmail(s);
    }
}
