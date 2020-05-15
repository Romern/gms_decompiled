package com.google.android.gms.org.conscrypt.p059io;

import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.Socket;

/* renamed from: com.google.android.gms.org.conscrypt.io.IoUtils */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class IoUtils {
    private IoUtils() {
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
            }
        }
    }

    public static void throwInterruptedIoException() {
        Thread.currentThread().interrupt();
        throw new InterruptedIOException();
    }

    public static void closeQuietly(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (Exception e) {
            }
        }
    }
}
