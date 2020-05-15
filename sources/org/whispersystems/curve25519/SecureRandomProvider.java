package org.whispersystems.curve25519;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface SecureRandomProvider {
    void nextBytes(byte[] bArr);

    int nextInt(int i);
}
