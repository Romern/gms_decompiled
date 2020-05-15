package org.whispersystems.curve25519;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NoSuchProviderException extends RuntimeException {
    private final Throwable nested;

    public NoSuchProviderException(String str) {
        super(str);
        this.nested = null;
    }

    public Throwable getNested() {
        return this.nested;
    }

    public NoSuchProviderException(Throwable th) {
        this.nested = th;
    }
}
