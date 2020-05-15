package org.whispersystems.curve25519;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class JCESecureRandomProvider implements SecureRandomProvider {
    public int nextInt(int i) {
        try {
            return SecureRandom.getInstance("SHA1PRNG").nextInt(i);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public void nextBytes(byte[] bArr) {
        try {
            SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
