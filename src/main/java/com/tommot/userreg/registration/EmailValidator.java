package com.tommot.userreg.registration;

import org.springframework.stereotype.Service;
import com.tommot.userreg.utils.Utils;
import java.util.function.Predicate;

@Service
public class EmailValidator  implements Predicate<String> {

    @Override
    public boolean test(String s) {
        return Utils.isValidEmail(s);
    }
}
