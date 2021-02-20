package com.tommot.userreg.registration;

import java.util.function.Predicate;

public class EmailValidator  implements Predicate<String> {

    /**
     * Evaluates this predicate on the given argument.
     *
     * @param s the input argument
     * @return {@code true} if the input argument matches the predicate,
     * otherwise {@code false}
     */
    @Override
    public boolean test(String s) {
        // TODO: Regex to validate email. - Lets assume all is valid for now
        return false;
    }
}
