package com.welab.k8s_backend_user.secret.hash;

import java.util.Objects;

public class SecureHashUtils {
    public static String hash(String password) {
        return password;
    }

    public static boolean matches(String password, String hashedPassword) {
        String hashed = hash(password);

        return hashed.equals(hashedPassword);
    }
}
