package org.chromium.net;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class QuicException extends NetworkException {
    protected QuicException(String str, Throwable th) {
        super(str, th);
    }

    public abstract int getQuicDetailedErrorCode();
}
