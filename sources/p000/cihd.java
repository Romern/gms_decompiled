package p000;

import java.security.PrivilegedExceptionAction;
import javax.net.ssl.SSLSocket;

/* renamed from: cihd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cihd implements PrivilegedExceptionAction {
    public final /* bridge */ /* synthetic */ Object run() {
        return SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
    }
}
