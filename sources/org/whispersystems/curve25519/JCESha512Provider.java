package org.whispersystems.curve25519;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.whispersystems.curve25519.java.Sha512;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class JCESha512Provider implements Sha512 {
    public void calculateDigest(byte[] bArr, byte[] bArr2, long j) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-512");
            instance.update(bArr2, 0, (int) j);
            byte[] digest = instance.digest();
            System.arraycopy(digest, 0, bArr, 0, digest.length);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
