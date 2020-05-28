package com.youxiu326.utils;

import org.springframework.security.crypto.password.PasswordEncoder;

public class MyPasswordEncoder implements PasswordEncoder {

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return encodedPassword.equals(Md5Utils.encode((String)rawPassword));
    }

    @Override
    public String encode(CharSequence rawPassword) {
        return Md5Utils.encode((String)rawPassword);
    }
}
